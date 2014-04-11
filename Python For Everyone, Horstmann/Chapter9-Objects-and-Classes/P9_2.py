# Simulate a tally counter that can be used to admit a limited number of people. First,
# the limit is set with a call
# def setLimit(self, maximum)
# If the count button is clicked more often
# simulate an alarm by print-
# ing out a message “Limit exceeded”.


class Counter():
    def __init__(self, value, limit):
        self._value = value
        self._limit = limit

    def get_value(self):
        return self._value

    def click(self):
        if self._value + 1 > self._limit:
            return False
        self._value += 1

    def undo(self):
        self._value -= 1
        if self._value < 0:
            self._value = 0

    def reset(self):
        self._value = 0

    def set_limit(self, max_limit):
        self._limit = max_limit
