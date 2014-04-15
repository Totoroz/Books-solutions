# Unit test for P8.10


# IMPORTS
import P8_10
import unittest
from os import remove


# main
class FilesCommonWordsTest(unittest.TestCase):
    def setUp(self):
        opened_file = open("test_file_a", "w")
        opened_file.write("marry had a little lamb")
        opened_file.close()

        opened_file = open("test_file_b", "w")
        opened_file.write("And everywhere that Marry went, the lamb was sure to go.")
        opened_file.close()

    def test_file_contents_to_set_a(self):
        expected = {"a", "had", "lamb", "little", "marry"}
        self.assertSetEqual(expected, P8_10.file_contents_to_set("test_file_a"))

    def test_file_contets_to_set_b(self):
        expected = {"and", "everywhere", "go", "lamb", "marry", "sure", "that", "the", "to", "was", "went"}
        self.assertSetEqual(expected, P8_10.file_contents_to_set("test_file_b"))

    def test_common_words(self):
        set_a = P8_10.file_contents_to_set("test_file_a")
        set_b = P8_10.file_contents_to_set("test_file_b")
        expected = {"lamb", "marry"}
        self.assertSetEqual(expected, P8_10.common_words(set_a, set_b))

    def tearDown(self):
        remove("test_file_a")
        remove("test_file_b")


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
