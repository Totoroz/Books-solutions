# Unit tests for P9_2.py

# IMPORTS
from P9_2 import Counter
import unittest


# main
class CounterTests(unittest.TestCase):
    def setUp(self):
        self.c = Counter(5, 7)

    def test_get_value(self):
        self.assertEqual(5, self.c.get_value())

    def test_reset(self):
        self.c.reset()
        self.assertEqual(0, self.c.get_value())

    def test_click(self):
        self.c.click()
        self.assertEqual(6, self.c.get_value())

    def test_click_beyond_limit(self):
        self.c.click()
        self.c.click()
        self.assertEqual(7, self.c.get_value())
        self.assertFalse(self.c.click())
        self.assertEqual(7, self.c.get_value())

    def test_undo(self):
        self.c.undo()
        self.assertEqual(4, self.c.get_value())

    def test_attempt_to_undo_to_minus(self):
        for i in range(7):
            self.c.undo()
        self.assertEqual(0, self.c.get_value())


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
