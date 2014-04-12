# DOCUMENTATION

# IMPORTS
from P9_9 import ComboLock
import unittest


# main
class ComboLockTests(unittest.TestCase):
    def setUp(self):
        self.c = ComboLock(5, 6, 7)

    def test_assign_secret(self):
        self.assertEqual(5, self.c.assign_secret(5))

    def test_assign_secret_below_0(self):
        self.assertEqual(0, self.c.assign_secret(-5))

    def test_assign_secret_beyond_39(self):
        self.assertEqual(39, self.c.assign_secret(70))

    def test_get_dial(self):
        self.assertEqual(0, self.c.get_dial())

    def test_reset(self):
        self.c.reset()
        self.assertEqual(0, self.c.get_dial())

    def test_dial_scrolling(self):
        self.assertEqual(3, self.c.dial_scrolling(3))

    def test_dial_scrolling_beyond_39(self):
        self.assertEqual(1, self.c.dial_scrolling(40))

    def test_dial_scrolling_beyond_39_again(self):
        self.assertEqual(31, self.c.dial_scrolling(70))

    def test_dial_scrolling_below_0(self):
        self.assertEqual(39, self.c.dial_scrolling(-1))

    def test_turn_right(self):
        self.c.turn_right(5)
        self.assertEqual(5, self.c.get_dial())

    def test_turn_left(self):
        self.c.turn_left(5)
        self.assertEqual(40-5, self.c.get_dial())

    def test_dial_to_39_and_move_right(self):
        self.c._dial = 39
        self.c.turn_right(1)
        self.assertEqual(0, self.c.get_dial())

    def test_dial_to_0_and_move_left(self):
        self.c._dial = 0
        self.c.turn_left(1)
        self.assertEqual(39, self.c.get_dial())


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
