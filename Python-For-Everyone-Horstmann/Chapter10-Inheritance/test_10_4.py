# Unit tests for P10_4.py


# IMPORTS
from P10_4 import AnyCorrectChoiceQuestion
import unittest


# main
class AnyCorrectChoiceQuestionTests(unittest.TestCase):
    def setUp(self):
        self.q = AnyCorrectChoiceQuestion()

    def test_set_text(self):
        self.q.set_text("Is this a good test?")
        self.assertEqual("Is this a good test?", self.q.get_text())

    def test_set_answer(self):
        self.q.set_answer("No")
        self.assertEqual("No", self.q.get_answer())

    def test_clear_answer(self):
        self.q.set_answer("No")
        self.assertEqual("No", self.q.get_answer())
        self.q.clear_answer()
        self.assertEqual("", self.q.get_answer())

    def test_check_answer_false(self):
        self.q.set_answer("No")
        self.q.set_answer("Maybe")
        self.q.set_answer("Not really")
        self.assertFalse(self.q.check_answer("Yes"))

    def test_check_answer_true(self):
        self.q.set_answer("No")
        self.q.set_answer("Maybe")
        self.q.set_answer("Not really")
        self.assertTrue(self.q.check_answer("Maybe"))


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
