# Unit tests for is_lucky_number.py


# IMPORTS
from is_lucky_number import is_lucky
from nose.tools import eq_


class TestIsLuckyNumber():
    def test_is_lucky_8(self):
        eq_(True, is_lucky(8))

    def test_is_lucky_number_less_than_8(self):
        eq_(False, is_lucky(5))

    def test_is_lucky_number_18(self):
        eq_(True, is_lucky(18))

    def test_is_lucky_number_81(self):
        eq_(True, is_lucky(81))

    def test_is_lucky_number_91(self):
        eq_(False, is_lucky(91))
