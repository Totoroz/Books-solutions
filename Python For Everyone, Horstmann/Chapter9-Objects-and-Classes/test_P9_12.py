# Unit tests for P9_12.py


# IMPORTS
from P9_12 import Bug
import unittest


# main
class BugTests(unittest.TestCase):
    def setUp(self):
        self.bug = Bug(5)

    def test_get_position(self):
        self.assertEqual(5, self.bug.get_position())

    def test_get_direction(self):
        self.assertEqual(0, self.bug.get_direction())

    def test_turn(self):
        # start direction - right
        self.assertEqual(0, self.bug.get_direction())
        self.bug.turn()
        # direction - left
        self.assertEqual(1, self.bug.get_direction())

    def test_move_right(self):
        self.bug.move()
        self.assertEqual(6, self.bug.get_position())

    def test_move_left(self):
        self.bug.turn()
        self.bug.move()
        self.assertEqual(4, self.bug.get_position())


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
