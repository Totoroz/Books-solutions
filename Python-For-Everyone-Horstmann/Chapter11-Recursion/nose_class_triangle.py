# Unit tests for class_triangle.py


# IMPORTS
from class_triangle import Triangle
from nose.tools import ok_, eq_


class TestTriangle():
    def setup(self):
        self.t = Triangle(10)

    def test_constructor(self):
        ok_(isinstance(self.t, Triangle))

    def test_get_side_length(self):
        eq_(10, self.t.get_side_length())

    def test_area_negative(self):
        self.t._side_length = -1
        eq_(0, self.t.area())

    def test_area_0(self):
        self.t._side_length = 0
        eq_(0, self.t.area())

    def test_area(self):
        eq_(55, self.t.area())
