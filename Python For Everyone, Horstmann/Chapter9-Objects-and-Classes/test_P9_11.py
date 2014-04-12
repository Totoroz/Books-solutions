# Unit tests for P9_11.py


# IMPORTS
from P9_11 import Letter
import unittest


# main
class LetterTests(unittest.TestCase):
    def setUp(self):
        self.l = Letter("John", "Mary")

    def test_get_text(self):
        self.assertEqual("Dear John:\n\nSincerely,\n\nMary", self.l.get_text())

    def test_add_line(self):
        self.l.add_line("I am sorry we must part.")
        self.l.add_line("I wish you all the best.")
        self.assertEqual("Dear John:\n\nI am sorry we must part.\nI wish you all the best.\nSincerely,\n\nMary", self.l.get_text())


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
