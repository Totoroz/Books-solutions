# Implement a class Address . An address has a house number, a street, an optional
# apartment number, a city, a state, and a postal code. Define the constructor such that
# an object can be created in one of two ways: with an apartment number or without.
# Supply a print method that prints the address with the street on one line and the city,
# state, and postal code on the next line. Supply a method def comesBefore(self, other)
# that tests whether this address comes before other when compared by postal code.


class Address():
    def __init__(self, city, state, postal_code, street, house_number, apartment_number=0):
        self._city = city
        self._state = state
        self._postal_code = postal_code
        self._street = street
        self._house_number = house_number
        self._apartment_number = apartment_number

    def get_postal_code(self):
        return self._postal_code

    def get_address(self):
        if self._apartment_number == 0:
            return "Street: {}, House №: {}\nCity: {}, State: {}, Postal Code: {}".format(self._street, self._house_number, self._city, self._state, self._postal_code)
        return "Street: {}, House №: {}, Apartment №: {}\nCity: {}, State: {}, Postal Code: {}".format(self._street, self._house_number, self._apartment_number, self._city, self._state, self._postal_code)

    def comes_before(self, other_object):
        if self.get_postal_code() > other_object.get_postal_code():
            return True
        return False
