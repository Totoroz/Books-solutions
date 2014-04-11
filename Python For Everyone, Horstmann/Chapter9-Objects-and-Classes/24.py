# 24.
#     Define a constructor for the Item class that allows for any of the following forms
#     when creating a new Item object.
#     Item("Corn flakes")
#     Item("Corn flakes", 3.95)
#     Item()


class Item():
    def __init__(self, name="", price=0.0):
        self._name = name
        self._price = price

    def get_name(self):
        return self._name

    def get_price(self):
        return self._price
