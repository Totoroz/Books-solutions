# Unit tests for p19.py


# IMPORTS
from S19 import Counter
import unittest


# main
class CounterTests(unittest.TestCase):
    def setUp(self):
        self.test_counter = Counter()

    def test_get_value(self):
        self.assertEqual(0, self.test_counter.get_value())

    def test_click(self):
        self.test_counter.click()
        self.assertEqual(1, self.test_counter.get_value())

    def test_reset(self):
        self.test_counter.click()
        self.test_counter.click()
        self.test_counter.click()
        self.assertEqual(3, self.test_counter.get_value())
        self.test_counter.reset()
        self.assertEqual(0, self.test_counter.get_value())

    def test_constructor_default_value(self):
        new_counter = Counter(6)
        self.assertEqual(6, new_counter.get_value())
        new_counter.click()
        self.assertEqual(7, new_counter.get_value())


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
