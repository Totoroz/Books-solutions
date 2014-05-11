# Unit tests for p20.py


# IMPORTS
from S20 import Person
import unittest


# main
class PersonTests(unittest.TestCase):
    def setUp(self):
        self.p = Person("Harry", "Morgan")

    def test_get_name(self):
        self.assertEqual("Morgan, Harry", self.p.get_name())

    def test_get_name_when_empty_constructor(self):
        new_person = Person()
        self.assertEqual("unknown", new_person.get_name())


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
