# Unit tests for p24.py


# IMPORTS
from S24 import Item
import unittest


# main
class ItemTests(unittest.TestCase):
    def test_empty_constructor(self):
        item = Item()
        self.assertEqual("", item.get_name())
        self.assertEqual(0.0, item.get_price())

    def test_constructor_with_name(self):
        item = Item("Corn Flakes")
        self.assertEqual("Corn Flakes", item.get_name())
        self.assertEqual(0.0, item.get_price())

    def test_constructor_with_name_and_price(self):
        item = Item("Corn Flakes", 3.95)
        self.assertEqual("Corn Flakes", item.get_name())
        self.assertEqual(3.95, item.get_price())


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
