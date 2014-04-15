# Solve Exercise P9.14 by implementing classes Sphere , Cylinder , and Cone .
# Which approach is more object-oriented?


# IMPORTS
from math import pi
from math import sqrt


class Sphere():
    def __init__(self, radius):
        self._radius = radius

    def get_radius(self):
        return self._radius

    def volume(self):
        return 4/3 * pi * self._radius ** 3

    def surface(self):
        return 4 * pi * self._radius ** 2


class Cylinder():
    def __init__(self, radius, height):
        self._radius = radius
        self._height = height

    def get_radius(self):
        return self._radius

    def get_height(self):
        return self._height

    def volume(self):
        return pi * self._radius ** 2

    def surface(self):
        return pi * self._radius ** 2 * 2 * pi * self._radius * self._height


class Cone():
    def __init__(self, radius, height):
        self._radius = radius
        self._height = height

    def get_radius(self):
        return self._radius

    def get_height(self):
        return self._height

    def volume(self):
        return 1/3 * pi * self._radius ** 2 * self._height

    def surface(self):
        return pi * self._radius ** 2 + pi * self._radius * sqrt(self._height ** 2 + self._radius ** 2)
