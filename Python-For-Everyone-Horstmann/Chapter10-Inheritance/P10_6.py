# Add a method addText to the Question superclass and provide a different implementa­tion
# of ChoiceQuestion that calls addText rather than storing a list of choices.


class Question():
    def __init__(self):
        self._text = ""
        self._answer = ""
        self._answer_number = 0

    def get_text(self):
        return self._text

    def get_answer(self):
        return self._answer

    def set_text(self, questionText):
        self._text = questionText

    def set_answer(self, correctResponse):
        self._answer = correctResponse

    def check_answer(self, response):
        return response == self._answer

    def add_text(self, additional_text):
        self._answer_number += 1
        self._text += "{} {}".format(self.i, additional_text)

    def get_answer_number(self):
        return self._answer_number

    def display(self):
        print(self._text, end=' ')


class ChoiceQuestion(Question):
    def __init__(self):
        super().__init__()

    def add_choice(self, choice, correct):
        super().add_text(choice)
        if correct:
            self.set_answer(str(self._answer_number))

    def display(self):
        super().display()
