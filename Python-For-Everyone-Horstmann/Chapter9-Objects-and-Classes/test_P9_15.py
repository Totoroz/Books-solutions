# Unit tests for P9_15.py


# IMPORTS
from math import sqrt
from math import pi
import P9_15
import unittest


# main
class SphereTests(unittest.TestCase):
    def setUp(self):
        self.sphere = P9_15.Sphere(5)

    def test_get_radius(self):
        self.assertEqual(5, self.sphere.get_radius())

    def test_volume(self):
        self.assertEqual(4/3 * pi * 5 ** 3, self.sphere.volume())

    def test_surface(self):
        self.assertEqual(4 * pi * 5 ** 2, self.sphere.surface())


class CylinderTests(unittest.TestCase):
    def setUp(self):
        self.cylinder = P9_15.Cylinder(8, 10)

    def test_get_radius(self):
        self.assertEqual(8, self.cylinder.get_radius())

    def test_get_height(self):
        self.assertEqual(10, self.cylinder.get_height())

    def test_volume(self):
        self.assertEqual(pi * 8 ** 2, self.cylinder.volume())

    def test_surface(self):
        self.assertEqual(pi * 8 ** 2 * 2 * pi * 8 * 10, self.cylinder.surface())


class ConeTests(unittest.TestCase):
    def setUp(self):
        self.cone = P9_15.Cone(10, 15)

    def test_get_radious(self):
        self.assertEqual(10, self.cone.get_radius())

    def test_get_height(self):
        self.assertEqual(15, self.cone.get_height())

    def test_volume(self):
        self.assertEqual(1/3 * pi * 10 ** 2 * 15, self.cone.volume())

    def test_surface(self):
        self.assertEqual(pi * 10 ** 2 + pi * 10 * sqrt(15 ** 2 + 10 ** 2), self.cone.surface())


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
