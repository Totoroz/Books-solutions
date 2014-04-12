# Modify the Student class of Exercise P9.7 to compute grade point averages. Meth­ods
# are needed to add a grade and get the current GPA. Specify grades as elements of a
# class Grade . Supply a constructor that constructs a grade from a string, such as "B+" .
# You will also need a method that translates grades into their numeric values (for
# example, "B+" becomes 3.3).


class Grade():
    def __init__(self, grade):
        self._grade = self.assign_grade(grade)

    def assign_grade(self, letter):
        if letter == "A+":
            return 5.3
        elif letter == "A":
            return 5
        elif letter == "A-":
            return 4.7
        elif letter == "B+":
            return 4.3
        elif letter == "B":
            return 4
        elif letter == "B-":
            return 3.7
        elif letter == "C+":
            return 3.3
        elif letter == "C":
            return 3
        elif letter == "C-":
            return 2.7
        elif letter == "D+":
            return 2.3
        elif letter == "D":
            return 2
        elif letter == "D-":
            return 1.7
        elif letter == "F+":
            return 1.3
        elif letter == "F":
            return 1

    def get_grade(self):
        return self._grade


class Student():
    def __init__(self, name, score):
        self._name = name
        self._total_score = score
        self._scores = 1

    def get_name(self):
        return self._name

    def add_quiz(self, grade_object):
        self._total_score += grade_object.get_grade()
        self._scores += 1

    def get_total_score(self):
        return self._total_score

    def get_scores_count(self):
        return self._scores

    def get_average_score(self):
        return self._total_score / self._scores
