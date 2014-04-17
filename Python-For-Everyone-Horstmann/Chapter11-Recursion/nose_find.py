# Unit tests for find.py


# IMPORTS
from find import find


class TestFind():
    def test_find_txt(self):
        # expected 1 match
        find("/home/synd/Books-solutions/Python-For-Everyone-Horstmann", "txt")

    def test_find_py(self):
        # expected 652 matches
        find("/home/synd/Books-solutions/Python-For-Everyone-Horstmann", "pyc")
