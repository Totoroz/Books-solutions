# Implement a class Student . For the purpose of this exercise, a student has a name
# and a total quiz score. Supply an appropriate constructor and methods getName() ,
# addQuiz(score) , getTotalScore() , and getAverageScore() . To compute the latter, you also
# need to store the number of quizzes that the student took.


class Student():
    def __init__(self, name, score):
        self._name = name
        self._total_score = score
        self._scores = 0

    def get_name(self):
        return self._name

    def add_quiz(self, score):
        self._total_score += score
        self._scores += 1

    def get_total_score(self):
        return self._total_score

    def get_average_score(self):
        return self._total_score / self._scores
