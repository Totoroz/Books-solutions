# Unit test for R8.18

# IMPORTS
import R8_18
import unittest


# main
class Print_Dictionary_Tests(unittest.TestCase):
    def setUp(self):
        self.dummy_dictionary = {"example1": 5, "example2": 6, "example3": 7}

    def test_print_keys(self):
        self.assertEqual("example1\nexample2\nexample3", R8_18.print_keys(self.dummy_dictionary))

    def test_print_values(self):
        self.assertEqual("5\n6\n7", R8_18.print_value(self.dummy_dictionary))

    def test_print_pairs(self):
        self.assertEqual("('example1', 5)\n('example2', 6)\n('example3', 7)", R8_18.print_pairs(self.dummy_dictionary))

    def test_print_average_value(self):
        self.assertEqual((5+6+7)/3, R8_18.print_average_value(self.dummy_dictionary))


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
