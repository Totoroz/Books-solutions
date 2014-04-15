# DOCUMENTATION

# IMPORTS
from P9_19 import Item
from P9_19 import CashRegister
import unittest


# main
class ItemTests(unittest.TestCase):
    def setUp(self):
        self.item = Item("Knife", 7.00)

    def test_get_name(self):
        self.assertEqual("Knife", self.item.get_name())

    def test_get_price(self):
        self.assertEqual(7.00, self.item.get_price())


class CashRegisterTests(unittest.TestCase):
    def setUp(self):
        self.reg = CashRegister()
        self.item = Item("Fork", 5.10)

    def test_get_count(self):
        self.assertEqual(0, self.reg.get_count())

    def test_get_total(self):
        self.assertEqual(0, self.reg.get_total())

    def test_add_item(self):
        self.reg.add_item(self.item)
        self.assertEqual(1, self.reg.get_count())
        self.assertEqual(5.10, self.reg.get_total())

    def test_display_items(self):
        self.reg.add_item(self.item)
        self.assertEqual("Fork - 5.1", self.reg.display_items())


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
