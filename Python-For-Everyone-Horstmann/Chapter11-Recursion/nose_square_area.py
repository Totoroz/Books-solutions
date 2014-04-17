# Unit tests for square_area.py


# IMPORTS
from square_area import square_area
from nose.tools import eq_


class TestSquareArea():
    def test_square_area_negative(self):
        eq_(0, square_area(-5))

    def test_square_area_0(self):
        eq_(0, square_area(0))

    def test_square_area_1(self):
        eq_(1, square_area(1))

    def test_square_area_2(self):
        eq_(4, square_area(2))

    def test_square_area_3(self):
        eq_(9, square_area(3))

    def test_square_area_11(self):
        eq_(121, square_area(11))
