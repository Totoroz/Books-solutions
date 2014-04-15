"""Coverage 3.x support for Nose"""

VERSION = (0, 1, 0)

__version__ = ".".join(map(str, VERSION))
__author__ = "Ask Solem"
__contact__ = "askh@opera.com"
__homepage__ = "http://github.com/ask/nosecover3/"
__docformat__ = "restructuredtext"
__license__ = "GNU LGPL"

import logging
import os
import re
import sys
from nose.plugins.base import Plugin
from nose.util import src, tolist

log = logging.getLogger(__name__)

COVERAGE_STATS_TEMPLATE = '''Covered: %(covered)s lines<br/>
Missed: %(missed)s lines<br/>
Skipped %(skipped)s lines<br/>
Percent: %(percent)s %%<br/>
'''

RE_LIST = re.compile(r"\s*,\s*|\n")

class Coverage3(Plugin):
    """
    Activate a coverage report using Ned Batchelder's coverage module.
    """
    coverTests = False
    coverPackages = None
    score = 200
    status = {}
    _cov = None

    def _get_cov(self):
        if self._cov is None:
            import coverage
            self._cov = coverage.coverage(branch=self.coverBranch, cover_pylib=False)
        return self._cov
    cov = property(_get_cov)

    def options(self, parser, env):
        """
        Add options to command line.
        """

        Plugin.options(self, parser, env)
        parser.add_option("--cover3-package", action="append",
                          default=env.get('NOSE_COVER_PACKAGE'),
                          metavar="PACKAGE",
                          dest="cover_packages",
                          help="Restrict coverage output to selected packages "
                          "[NOSE_COVER_PACKAGE]")
        parser.add_option("--cover3-erase", action="store_true",
                          default=env.get('NOSE_COVER_ERASE'),
                          dest="cover_erase",
                          help="Erase previously collected coverage "
                          "statistics before run")
        parser.add_option("--cover3-tests", action="store_true",
                          dest="cover_tests",
                          default=env.get('NOSE_COVER_TESTS'),
                          help="Include test modules in coverage report "
                          "[NOSE_COVER_TESTS]")
        parser.add_option("--cover3-branch", action="store_true",
                          dest="cover_branch",
                          default=env.get('NOSE_COVER_BRANCH'),
                          help="Include branch coverage. "
                          "[NOSE_COVER_BRANCH]")
        parser.add_option("--cover3-exclude", action="store",
                          dest="cover_exclude",
                          default=env.get('NOSE_COVER_EXCLUDE'),
                          type="string",
                          help="List of modules to exclude from coverage. "
                          "Supports wildcard matching at both start and "
                          "end. Example: *.core.dispatch.* "
                          "[NOSE_COVER_EXCLUDE]")
        parser.add_option("--cover3-inclusive", action="store_true",
                          dest="cover_inclusive",
                          default=env.get('NOSE_COVER_INCLUSIVE'),
                          help="Include all python files under working "
                          "directory in coverage report.  Useful for "
                          "discovering holes in test coverage if not all "
                          "files are imported by the test suite. "
                          "[NOSE_COVER_INCLUSIVE]")
        parser.add_option("--cover3-html", action="store_true",
                          default=env.get('NOSE_COVER_HTML'),
                          dest='cover_html',
                          help="Produce HTML coverage information")
        parser.add_option('--cover3-html-dir', action='store',
                          default=env.get('NOSE_COVER_HTML_DIR', 'cover'),
                          dest='cover_html_dir',
                          metavar='DIR',
                          help='Produce HTML coverage information in dir')
        parser.add_option('--cover3-xml', action='store_true',
                          default=env.get('NOSE_COVER_XML'),
                          dest='cover_xml',
                          help='Add Cobertura-style XML coverage reports')
        parser.add_option('--cover3-xml-file', action='store',
                          default=env.get('NOSE_COVER_XML_FILE'),
                          dest='cover_xml_file',
                          help='File to write XML coverage report.')

    def configure(self, options, config):
        """
        Configure plugin.
        """
        try:
            self.status.pop('active')
        except KeyError:
            pass
        Plugin.configure(self, options, config)
        if getattr(config, "worker", None) and config.worker:
            return
        if self.enabled:
            try:
                import coverage
            except ImportError:
                log.error("Coverage not available: "
                          "unable to import coverage module")
                self.enabled = False
                return
        self.conf = config
        self.coverErase = options.cover_erase
        self.coverTests = options.cover_tests
        self.coverBranch = options.cover_branch
        self.coverExclude = options.cover_exclude or []
        if isinstance(self.coverExclude, str):
            self.coverExclude = RE_LIST.split(self.coverExclude)
        self.coverXml = options.cover_xml
        self.coverXmlFile = options.cover_xml_file
        self.coverPackages = []
        if options.cover_packages:
            for pkgs in [tolist(x) for x in options.cover_packages]:
                self.coverPackages.extend(pkgs)
        self.coverInclusive = options.cover_inclusive
        if self.coverPackages:
            log.info("Coverage report will include only packages: %s",
                     self.coverPackages)
        self.coverHtmlDir = None
        if options.cover_html:
            self.coverHtmlDir = options.cover_html_dir
            log.debug('Will put HTML coverage report in %s', self.coverHtmlDir)
        if self.enabled:
            self.status['active'] = True

    def begin(self):
        """
        Begin recording coverage information.
        """
        log.debug("Coverage begin")
        self.skipModules = list(sys.modules.keys())[:]
        if self.coverErase:
            log.debug("Clearing previously collected coverage statistics")
            self.cov.erase()
        self.cov.exclude('#pragma[: ]+[nN][oO] [cC][oO][vV][eE][rR]')
        self.cov.start()

    def report(self, stream):
        """
        Output code coverage report.
        """
        log.debug("Coverage report")
        self.cov.stop()
        modules = [ module
                    for name, module in list(sys.modules.items())
                    if self.wantModuleCoverage(name, module)
                    and not self.isExcludedModule(module)]
        log.debug("Coverage report will cover modules: %s", modules)
        self.cov.report(modules, file=stream)
        if self.coverXml:
            self.cov.xml_report(modules, outfile=self.coverXmlFile)
        if self.coverHtmlDir:
            if not os.path.exists(self.coverHtmlDir):
                os.makedirs(self.coverHtmlDir)
            log.debug("Generating HTML coverage report")
            self.cov.html_report(directory=self.coverHtmlDir, morfs=modules)

    def isExcludedModule(self, mod):
        for exclude in self.coverExclude:
            wildstart, wildend = exclude[0] == "*", exclude[-1] == "*"
            if wildstart and wildend and exclude[1:-1] in mod.__name__:
                return True
            if wildend and mod.__name__.startswith(exclude[:-1]):
                return True
            if wildstart and mod.__name__.endswith(exclude[1:]):
                return True
            if mod.__name__ == exclude:
                return True
        return False

    def computePercent(self, covered, missed):
        if covered + missed == 0:
            percent = 1
        else:
            percent = covered/(covered+missed+0.0)
        return int(percent * 100)

    def wantModuleCoverage(self, name, module):
        if not hasattr(module, '__file__'):
            log.debug("no coverage of %s: no __file__", name)
            return False
        module_file = src(module.__file__)
        if not module_file or not module_file.endswith('.py'):
            log.debug("no coverage of %s: not a python file", name)
            return False
        if self.coverPackages:
            for package in self.coverPackages:
                if (name.startswith(package)
                    and (self.coverTests
                         or not self.conf.testMatch.search(name))):
                    log.debug("coverage for %s", name)
                    return True
        if name in self.skipModules:
            log.debug("no coverage for %s: loaded before coverage start",
                      name)
            return False
        if self.conf.testMatch.search(name) and not self.coverTests:
            log.debug("no coverage for %s: is a test", name)
            return False
        # accept any package that passed the previous tests, unless
        # coverPackages is on -- in that case, if we wanted this
        # module, we would have already returned True
        return not self.coverPackages

    def wantFile(self, file, package=None):
        """If inclusive coverage enabled, return true for all source files
        in wanted packages.
        """
        if self.coverInclusive:
            if file.endswith(".py"):
                if package and self.coverPackages:
                    for want in self.coverPackages:
                        if package.startswith(want):
                            return True
                else:
                    return True
        return None
