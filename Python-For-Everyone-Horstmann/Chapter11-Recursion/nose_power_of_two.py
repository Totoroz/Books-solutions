# Unit tests for power_of_two.py


# IMPORTS
from power_of_two import power2
from nose.tools import eq_


class TestPowerOfTwo():
    def test_power2_negative(self):
        eq_(1, power2(-5))

    def test_power2_0(self):
        eq_(1, power2(0))

    def test_power2_1(self):
        eq_(2, power2(1))

    def test_power2_2(self):
        eq_(4, power2(2))

    def test_power2_3(self):
        eq_(8, power2(3))

    def test_power2_4(self):
        eq_(16, power2(4))

    def test_power2_5(self):
        eq_(32, power2(5))

    def test_power2_6(self):
        eq_(64, power2(6))

    def test_power2_7(self):
        eq_(128, power2(7))

    def test_power2_8(self):
        eq_(256, power2(8))

    def test_power2_9(self):
        eq_(512, power2(9))

    def test_power2_10(self):
        eq_(1024, power2(10))
