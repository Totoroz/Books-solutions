# Add a class NumericQuestion to the question hierarchy of Section 10.1. If the response
# and the expected answer differ by no more than 0.01, then accept the response as
# correct.


# IMPORTS
from question import Question


class NumericQuestion(Question):
    def __init__(self):
        super().__init__()

    def check_answer(self, correct_response):
        if abs(self._answer - correct_response) <= 0.01:
            return True
        return False
