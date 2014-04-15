# Unit test for P8.9


# IMPORTS
import P8_9
import unittest


# main
class StringSetsTest(unittest.TestCase):
    def setUp(self):
        self.dummy_a = "abra"
        self.dummy_b = "kadabra"

    def test_shared_characters(self):
        self.assertEqual("a, b, r", P8_9.shared_characters(self.dummy_a, self.dummy_b))

    def test_unique_characters(self):
        self.assertEqual("d, k", P8_9.unique_characters(self.dummy_a, self.dummy_b))

    def test_non_occurring_characters(self):
        self.assertEqual("c, e, f, g, h, i, j, l, m, n, o, p, q, s, t, u, v, w, x, y, z", P8_9.non_occurring_letters(self.dummy_a, self.dummy_b))


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
