# Unit tests for P9_8.py


# IMPORTS
from P9_8 import Grade
from P9_8 import Student
import unittest


# main
class GradeTests(unittest.TestCase):
    def setUp(self):
        self.g = Grade("A")

    def test_get_grade(self):
        self.assertEqual(5, self.g.get_grade())

    def test_get_grade_with_sign(self):
        grade = Grade("B+")
        self.assertEqual(4.3, grade.get_grade())


class StudentTests(unittest.TestCase):
    def setUp(self):
        self.st = Student("Random", 5)

    def test_get_name(self):
        self.assertEqual("Random", self.st.get_name())

    def test_get_scores_count(self):
        self.assertEqual(1, self.st.get_scores_count())

    def test_get_total_score(self):
        self.assertEqual(5, self.st.get_total_score())

    def test_add_quiz(self):
        self.st.add_quiz(Grade("A"))
        self.assertEqual(2, self.st.get_scores_count())
        self.assertEqual(10, self.st.get_total_score())

    def test_get_average_score(self):
        self.st.add_quiz(Grade("B"))
        self.assertEqual(9 / 2, self.st.get_average_score())


# PROGRAM RUN
if __name__ == '__main__':
    unittest.main()
