# Unit tests for R8_20.py

# IMPORTS
import R8_20
import unittest


# main
class SetsTests(unittest.TestCase):
    def setUp(self):
        self.set_a = {1, 2, 3, 4}
        self.set_b = {2, 4, 6, 8}
        self.set_c = {5, 7, 9, 2}

    def test_create_new_set_from_union_of_two_sets(self):
        self.assertEqual({1, 3, 6, 8}, R8_20.create_new_set_from_union_of_unique_elements(self.set_a, self.set_b))

    def test_create_new_set_from_union_of_three_sets(self):
        self.assertEqual({1, 2, 6}, R8_20.create_new_set_from_union_of_unique_elements_in_three_sets(self.set_a, self.set_b, self.set_c))


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
