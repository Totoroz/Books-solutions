# The Counter class in Section 9.2 didn’t have a constructor. Provide one.


class Counter:
    def __init__(self, value=0):
        self._value = value

    def get_value(self):
        return self._value

    def click(self):
        self._value += 1

    def reset(self):
        self._value = 0
