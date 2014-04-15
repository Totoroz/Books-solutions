# Unit tests for P10_9.py written with nose unittesting framework


# IMPORTS
from P10_9 import *
from nose.tools import *


class TestEmployee():
    def setup(self):
        self.e = Employee("John", 50)

    def test_get_name(self):
        ok_("John", self.e.get_name())

    def test_get_salary(self):
        ok_(self.e.get_salary(), 50)


class TestManager():
    def setup(self):
        self.m = Manager("Mike", 70, "DND")

    def test_get_name(self):
        ok_("Mike", self.m.get_name())

    def test_get_salary(self):
        ok_(70, self.m.get_salary())

    def test_get_department(self):
        ok_("DND", self.m.get_department())
