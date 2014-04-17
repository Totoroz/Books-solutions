# Unit tests for n_factorial.py


# IMPORTS
from n_factorial import n_factorial
from nose.tools import eq_


class TestNFactorial():
    def test_n_factorial_1(self):
        eq_(1, n_factorial(1))

    def test_n_factorial_2(self):
        eq_(2, n_factorial(2))

    def test_n_factorial_3(self):
        eq_(6, n_factorial(3))

    def test_n_factorial_4(self):
        eq_(24, n_factorial(4))

    def test_n_factorial_5(self):
        eq_(120, n_factorial(5))

    def test_n_factorial_6(self):
        eq_(720, n_factorial(6))

    def test_n_factorial_7(self):
        eq_(5040, n_factorial(7))

    def test_n_factorial_8(self):
        eq_(40320, n_factorial(8))

    def test_n_factorial_9(self):
        eq_(362880, n_factorial(9))