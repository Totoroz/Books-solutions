# Unit tests for P9_24.py


# IMPORTS
from P9_24 import Message
import unittest


# main
class MessageTests(unittest.TestCase):
    def setUp(self):
        self.m = Message("John", "Mary")

    def test_to_string(self):
        self.assertEqual("From: John\nTo: Mary\n", self.m.to_string())

    def test_add_message(self):
        self.m.add_message("How are you?")
        self.assertEqual("From: John\nTo: Mary\nHow are you?", self.m.to_string())


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()