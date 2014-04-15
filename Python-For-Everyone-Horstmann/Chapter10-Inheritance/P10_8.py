# Implement a superclass Person . Make two classes, Student and Instructor , that inherit
# from Person . A person has a name and a year of birth. A student has a major, and an
# instructor has a salary. Write the class declarations, the constructors, and the _ _repr_ _
# method for all classes. Supply a test program that tests these classes and methods.


# IMPORTS
from datetime import datetime


class Person():
    def __init__(self, name, birth_year):
        self._name = name
        self._year = birth_year
        self._age = self.person_age(birth_year)

    def person_age(self, birth_year):
        return datetime.now().year - birth_year

    def get_name(self):
        return self._name

    def get_year(self):
        return self._year

    def get_age(self):
        return self._age

    def __repr__(self):
        return "Name: {}\nBorn: {}\nAge: {}".format(self._name, self._year, self._age)


class Student(Person):
    def __init__(self, name, birth_year, major=None):
        super().__init__(name, birth_year)
        self._major = major

    def get_major(self):
        return self._major

    def __repr__(self):
        return "{}\nMajor: {}".format(super().__repr__(), self.get_major())
