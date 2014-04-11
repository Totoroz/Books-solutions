# We want to add a button to the tally counter in Section 9.2 that allows an operator to
# undo an accidental button click. Provide a method
# def undo(self)
# that simulates such a button. As an added precaution, make sure that the operator
# cannot click the undo button more often than the count button.


class Counter():
    def __init__(self, value):
        self._value = value

    def get_value(self):
        return self._value

    def click(self):
        self._value += 1

    def undo(self):
        self._value -= 1
        if self._value < 0:
            self._value = 0

    def reset(self):
        self._value = 0
