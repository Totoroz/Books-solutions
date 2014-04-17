# Unit tests for triangle_area.py


# IMPORTS
from triangle_area import triangle_area
from nose.tools import eq_


class TestTriangleArea():
    def test_triangle_area_side_length_0(self):
        eq_(0, triangle_area(0))

    def test_triangle_area_side_length_1(self):
        eq_(1, triangle_area(1))

    def test_triangle_area_side_length2(self):
        eq_(3, triangle_area(2))

    def test_triangle_area_side_length10(self):
        eq_(55, triangle_area(10))

    def test_triangle_area_side_length_negative(self):
        eq_(0, triangle_area(-5))
