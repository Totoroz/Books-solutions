# Design a Customer class to handle a customer loyalty marketing campaign. After
# accumulating $100 in purchases, the customer receives a $10 discount on the next
# purchase. Provide methods
# •    def makePurchase(self, amount)
# •    def discountReached(self)
# Provide a test program and test a scenario in which a customer has earned a discount
# and then made over $90, but less than $100 in purchases. This should not result in a
# second discount. Then add another purchase that results in the second discount.


class Customer():
    def __init__(self):
        self._purchase = 0
        self._total_purchases = 0

    def get_purchase(self):
        return self._purchase

    def get_total_purchases(self):
        return self._total_purchases

    def make_purchase(self, amount):
        if self.is_discount_reached() is True:
            self._total_purchases += amount - 10
            self._purchase = 0
        else:
            self._total_purchases += amount
            self._purchase = 0

    def is_discount_reached(self):
        if self._purchase >= 100:
            return True
        return False
