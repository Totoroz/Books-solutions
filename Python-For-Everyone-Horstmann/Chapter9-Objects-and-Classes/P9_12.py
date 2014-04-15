# Write a class Bug that models a bug moving along a horizontal line. The bug moves
# either to the right or left. Initially, the bug moves to the right, but it can turn to
# change its direction. In each move, its position changes by one unit in the current
# direction. Provide a constructor
#     def _ _init_ _(self, initialPosition)
# and methods
# •    def turn(self)
# •    def move(self)
# •    def get_position(self)

# Sample usage:
#     bugsy = Bug(10)
#     bugsy.move()
#     # Now the position is 11
#     bugsy.turn()
#     bugsy.move()
#     # Now the position is 10


class Bug():
    def __init__(self, position):
        self._position = position
        # 1 = LEFT, 0 = RIGHT
        self._direction = 0

    def get_position(self):
        return self._position

    def get_direction(self):
        return self._direction

    def turn(self):
        if self.get_direction() == 0:
            self._direction = 1
        elif self.get_direction() == 1:
            self._direction = 0

    def move(self):
        if self.get_direction() == 0:
            self._position += 1
        elif self.get_direction() == 1:
            self._position -= 1
