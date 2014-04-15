# Add a class MultiChoiceQuestion to the question hierarchy of Section 10.1 that allows
# multiple correct choices. The respondent should provide all correct choices, sepa­
# rated by spaces. Provide instructions in the question text.


# IMPORTS
from question import ChoiceQuestion


class MultiChoiceQuestion(ChoiceQuestion):
    def __init__(self):
        super().__init__()

    def clear_answer(self):
        super().set_answer("")

    def set_answer(self, additional_answer):
        answer = "{} {}".format(super().get_answer(), additional_answer).strip()
        super().set_answer(answer)

    def check_answer(self, response):
        for answer in response.split(" "):
            if answer not in super().get_answer():
                return False
        return True
