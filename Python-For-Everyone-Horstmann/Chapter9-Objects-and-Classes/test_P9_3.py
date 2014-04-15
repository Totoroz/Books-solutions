# Unit tests for P9_3.py


# IMPORTS
from P9_3 import Menu
import unittest


# main
class MenuTests(unittest.TestCase):
    def setUp(self):
        self.m = Menu()

    def test_get_options_count(self):
        self.assertEqual(0, self.m.get_options_count())

    def test_add_option(self):
        self.m.add_option("Exit")
        self.assertEqual(1, self.m.get_options_count())

    def test_get_options(self):
        self.m.add_option("Exit")
        self.assertEqual("[1] Exit", self.m.get_options())


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
