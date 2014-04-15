# Add a class FillInQuestion to the question hierarchy of Section 10.1. Such a question
# is constructed with a string that contains the answer, surrounded by _ _ , for exam­ple,
# "The inventor of Python was _Guido van Rossum_" . The question should be displayed as
# The inventor of Python was _ _ _ _ _


# IMPORTS
from question import Question


class FillInQuestion(Question):
    def __init__(self):
        super().__init__()

    def set_text(self, question_text):
        question_answer = question_text.split("_")
        super().set_text(question_answer[0])
        super().set_answer(question_answer[1])

    def display(self):
        print("{} {}".format(super().display), "_" * 5)
