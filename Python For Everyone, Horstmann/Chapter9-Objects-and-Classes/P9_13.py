# Implement a class Moth that models a moth flying in a straight line. The moth has a
# position, the distance from a fixed origin. When the moth moves toward a point of
# light, its new position is halfway between its old position and the position of the
# light source. Supply a constructor
#     def _ _init_ _(self, initialPosition)
# and methods
# •    def moveToLight(self, lightPosition)
# •    def getPosition(self)


class Moth():
    def __init__(self, initial_position):
        self._position = initial_position

    def get_position(self):
        return self._position

    def move_to_light(self, light_position):
        self._position = (self._position + light_position) / 2
