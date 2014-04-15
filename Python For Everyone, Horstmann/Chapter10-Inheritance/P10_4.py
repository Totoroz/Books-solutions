# Add a class AnyCorrectChoiceQuestion to the question hierarchy of Section 10.1 that
# allows multiple correct choices. The respondent should provide any one of the cor­
# rect choices. The answer string should contain all of the correct choices, separated by
# spaces. Provide instructions in the question text.


# IMPORTS
from question import ChoiceQuestion


class AnyCorrectChoiceQuestion(ChoiceQuestion):
    def __init__(self):
        super().__init__()

    def clear_answer(self):
        super().set_answer("")

    def set_answer(self, additional_answer):
        answer = "{} {}".format(super().get_answer(), additional_answer).strip()
        super().set_answer(answer)

    def check_answer(self, response):
        return response in super().get_answer()
