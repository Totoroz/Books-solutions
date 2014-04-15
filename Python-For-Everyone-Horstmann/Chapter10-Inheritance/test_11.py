# Unit tests for c11.py


# IMPORTS
from c11 import Employee
from c11 import Manager
import unittest


# main
class EmployeeTests(unittest.TestCase):
    def setUp(self):
        self.e = Employee()

    def test_get_name(self):
        self.assertEqual("", self.e.get_name())

    def test_get_salary(self):
        self.assertEqual(0, self.e.get_salary())

    def test_set_name(self):
        self.e.set_name("Regular")
        self.assertEqual("Regular", self.e.get_name())

    def test_set_salary(self):
        self.e.set_base_salary(70)
        self.assertEqual(70, self.e.get_salary())

    def test_full_constructor(self):
        e = Employee("John", 60)
        self.assertEqual("John", e.get_name())
        self.assertEqual(60, e.get_salary())


class ManagerTests(unittest.TestCase):
    def setUp(self):
        self.m = Manager()

    def test_get_name(self):
        self.assertEqual("", self.m.get_name())

    def test_get_salary(self):
        self.assertEqual(0, self.m.get_salary())

    def test_get_bonus(self):
        self.assertEqual(0, self.m.get_bonus())

    def test_full_constructor(self):
        m = Manager("Michael", 70, 20)
        self.assertEqual("Michael", m.get_name())
        self.assertEqual(70, m.get_salary())
        self.assertEqual(20, m.get_bonus())

# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
