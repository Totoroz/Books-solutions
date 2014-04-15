# Implement a class SodaCan with methods getSurfaceArea() and get­­Volume() . In the con-
# structor, supply the height and radius of the can.


# IMPORTS
from math import pi


class SodaCan():
    def __init__(self, height, radius):
        self._height = height
        self._radius = radius

    def get_surface_area(self):
        return 2 * pi * self._radius ** 2 + 2 * pi * self._radius * self._height

    def get_volume(self):
        return pi * self._radius ** 2 * self._height
