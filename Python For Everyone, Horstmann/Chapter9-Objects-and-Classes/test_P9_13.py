# Unit tests for P9_13.py


# IMPORTS
from P9_13 import Moth
import unittest


# main
class MothTests(unittest.TestCase):
    def setUp(self):
        self.moth = Moth(5)

    def test_get_position(self):
        self.assertEqual(5, self.moth.get_position())

    def test_move_to_light(self):
        self.moth.move_to_light(10)
        self.assertEqual(7.5, self.moth.get_position())


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
