class Question():
    def __init__(self):
        self._text = ""
        self._answer = ""

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

    def display(self):
        print(self._text, end=' ')


class ChoiceQuestion(Question):
    def __init__(self):
        super().__init__()
        self._choices = []

    def add_choice(self, choice, correct):
        self._choices.append(choice)
        if correct:
            choiceString = str(len(self._choices))
            self.set_answer(choiceString)

    def display(self):
        super().display()
        for i in range(len(self._choices)):
            choiceNumber = i + 1
            print("%d: %s" % (choiceNumber, self._choices[i]))
