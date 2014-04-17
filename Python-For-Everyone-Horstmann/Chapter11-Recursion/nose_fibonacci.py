# Unit tests for fibonacci.py


# IMPORTS
from fibonacci import fibonacci
from nose.tools import eq_


class TestFibonacci():
    def test_fibonacci_negative(self):
        eq_(0, fibonacci(-5))

    def test_fibonacci_0(self):
        eq_(0, fibonacci(0))

    def test_fibonacci_1(self):
        eq_(1, fibonacci(1))

    def test_fibonacci_2(self):
        eq_(1, fibonacci(2))

    def test_fibonacci_3(self):
        eq_(2, fibonacci(3))

    def test_fibonacci_4(self):
        eq_(3, fibonacci(4))

    def test_fibonacci_5(self):
        eq_(5, fibonacci(5))

    def test_fibonacci_6(self):
        eq_(8, fibonacci(6))

    def test_fibonacci_7(self):
        eq_(13, fibonacci(7))

    def test_fibonacci_8(self):
        eq_(21, fibonacci(8))

    def test_fibonacci_9(self):
        eq_(34, fibonacci(9))

    def test_fibonacci_10(self):
        eq_(55, fibonacci(10))
