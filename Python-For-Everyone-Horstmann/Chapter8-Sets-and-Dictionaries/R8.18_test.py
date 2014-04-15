# Unit test for R8.18

# IMPORTS
import R8_18
import unittest


# main
class Print_Dictionary_Tests(unittest.TestCase):
    def setUp(self):
        self.dummy_dictionary = {"A": 8, "D": 3, "B": 15, "F": 2, "C": 6}

    def test_print_keys(self):
        self.assertEqual("A\nB\nC\nD\nF", R8_18.print_keys(self.dummy_dictionary))

    def test_print_values(self):
        self.assertEqual("2\n3\n6\n8\n15", R8_18.print_values(self.dummy_dictionary))

    def test_print_pairs_sorted(self):
        self.assertEqual("('A', 8)\n('B', 15)\n('C', 6)\n('D', 3)\n('F', 2)", R8_18.print_pairs(self.dummy_dictionary))

    def test_print_average_value(self):
        self.assertEqual((8+3+15+2+6)/5, R8_18.print_average_value(self.dummy_dictionary))

    def test_print_bar_charts(self):
        self.assertEqual("A: ********\nB: ***************\nC: ******\nD: ***\nF: **", R8_18.print_bar_charts(self.dummy_dictionary))


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
