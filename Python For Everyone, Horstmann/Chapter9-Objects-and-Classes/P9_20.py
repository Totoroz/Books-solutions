# Reimplement the CashRegister class so that it keeps track of the total price as an inte­
# ger: the total cents of the price. For example, instead of storing 17.29, store the inte­
# ger 1729. Such an implementation is commonly used because it avoids the accumula-
# tion of roundoff errors. Do not change the public interface of the class.


class Item():
    def __init__(self, name, price):
        self._name = name
        self._price = price * 100

    def get_name(self):
        return self._name

    def get_price(self):
        return self._price / 100


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
