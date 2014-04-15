# The Downtown Marketing Association wants
# to promote downtown shopping with a loyalty
# program similar to the one in Exercise P9.26.
# Shops are identified by a number between
# 1 and 20. Add a new parameter variable to the
# makePurchase method that indicates the shop.
# The discount is awarded if a customer makes
# purchases in at least three different shops,
# spending a total of $100 or more.


class Customer():
    def __init__(self):
        self._purchase = 0
        self._total_purchases = 0
        self._shops = set()

    def get_purchase(self):
        return self._purchase

    def get_total_purchases(self):
        return self._total_purchases

    def is_shop_id_valid(self, shop_id):
        if shop_id > 0 and shop_id < 21:
            return True
        return False

    def make_purchase(self, amount, shop_id):
        if self.is_shop_id_valid(shop_id) is True:
            if self.is_discount_reached() is True:
                self._total_purchases += amount - 10
                self._purchase = 0
                self._shops.add(shop_id)
            else:
                self._total_purchases += amount
                self._purchase = 0
        return False

    def is_discount_reached(self):
        if len(self._shops) != 0:
            if len(self._shops) % 3 == 0:
                return True
        return False
