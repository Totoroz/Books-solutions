# Reimplement the CashRegister class so that it keeps track of the price of each added
# item in a list. Remove the _itemCount and _totalPrice instance variables. Reimple-
# ment the clear , addItem , getTotal , and getCount methods. Add a method displayAll that
# displays the prices of all items in the current sale.


class Item():
    def __init__(self, name, price):
        self._name = name
        self._price = price

    def get_name(self):
        return self._name

    def get_price(self):
        return self._price


class CashRegister():
    def __init__(self):
        self._items = []

    def add_item(self, item):
        self._items.append(item)

    def clear(self):
        self._items[:] = []

    def get_count(self):
        return len(self._items)

    def get_total(self):
        total = 0
        for item_object in self._items:
            total += item_object.get_price()
        return total

    def display_items(self):
        output = []
        for item_object in self._items:
            output.append("{} - {}".format(item_object.get_name(), item_object.get_price()))
        return "\n".join(output)
