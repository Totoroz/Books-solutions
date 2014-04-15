# Unit tests for P10_8.py


# IMPORTS
from P10_8 import Person
from P10_8 import Student
import unittest


class PersonTests(unittest.TestCase):
    def setUp(self):
        self.p = Person("John", 1986)

    def test_get_name(self):
        self.assertEqual("John", self.p.get_name())

    def test_get_birth_year(self):
        self.assertEqual(1986, self.p.get_year())

    def test_get_age(self):
        self.assertEqual(2014 - 1986, self.p.get_age())

    def test_object_repr(self):
        print(self.p)


class StudentTests(unittest.TestCase):
    def setUp(self):
        self.s = Student("Mike", 1989, "Law")

    def test_get_major(self):
        self.assertEqual("Law", self.s.get_major())

    def test_object_repr(self):
        print(self.s)


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
