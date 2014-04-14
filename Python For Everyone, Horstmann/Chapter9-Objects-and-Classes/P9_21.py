# After closing time, the store manager would like to know how much business was
# transacted during the day. Modify the CashRegister class to enable this functionality.
# Supply methods getSalesTotal and getSalesCount to get the total amount of all sales
# and the number of sales. Supply a method resetSales that resets any counters and
# totals so that the next day’s sales start from zero.


class CashRegister():
    def __init__(self):
        self._items = []
        self._sales = []

    def add_item(self, item):
        self._items.append(item)

    def clear(self):
        self._sales.append(self._items)
        print(self._sales)
        self._items[:] = []

    def get_sales_count(self):
        return len(self._sales)

    def get_sales_total(self):
        total = 0
        for sale in self._sales:
            for item in sale:
                total += item.get_price()
        return total

    def reset_sales(self):
        self._sales[:] = []

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
