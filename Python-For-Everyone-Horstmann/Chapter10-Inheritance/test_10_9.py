# Unit tests for P10_9.py


# IMPORTS
from P10_9 import Employee
from P10_9 import Manager
import unittest


# main
class EmployeeTests(unittest.TestCase):
    def setUp(self):
        self.e = Employee("Abraham", 50)

    def test_get_name(self):
        self.assertEqual("Abraham", self.e.get_name())

    def test_get_salary(self):
        self.assertEqual(50, self.e.get_salary())

    def test_obj_repr(self):
        print(self.e)


class ManagerTests(unittest.TestCase):
    def setUp(self):
        self.m = Manager("George", 90, "Do Nothing")

    def test_get_department(self):
        self.assertEqual("Do Nothing", self.m.get_department())

    def test_obj_repr(self):
        print(self.m)


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
