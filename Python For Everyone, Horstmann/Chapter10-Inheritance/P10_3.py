# Modify the checkAnswer method of the Question class so that it does not take into
# account different spaces or upper/lowercase characters. For example, the response
# "GUIDO van Rossum" should match an answer of "Guido van Rossum" .


class Question:
    def __init__(self):
        self._text = ""
        self._answer = ""

    def set_text(self, questionText):
        self._text = questionText

    def set_answer(self, correctResponse):
        self._answer = correctResponse

    def check_answer(self, response):
        return response.lower() == self._answer.lower()

    def display(self):
        print(self._text, end=" ")
