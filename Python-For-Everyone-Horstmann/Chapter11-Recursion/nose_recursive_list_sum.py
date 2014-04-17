# Unit tests for list_sum.py


# IMPORTS
from recursive_list_sum import recursive_sum
from nose.tools import eq_


class TestListSum():
    def test_sum_1_2_3(self):
        eq_(1 + 2 + 3, recursive_sum([1, 2, 3]))

    def test_sum_4_5_6(self):
        eq_(4 + 5 + 6, recursive_sum([4, 5, 6]))

    def test_sum_minus_3_2_1(self):
        eq_(-3 - 2 - 1, recursive_sum([-3, -2, -1]))

    def test_sum_of_negative_and_positive_items(self):
        eq_(-3 + 5 + 8 - 9, recursive_sum([-3, 5, 8, -9]))
