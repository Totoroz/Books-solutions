# Suppose the class Employee is defined as follows:
#     class Employee :
#         def _ _init_ _(self) :
#           self._name = ""
#           self._baseSalary = 0.0
#         def setName(self, newName) :
#            . . .
#         def setBaseSalary(self, newSalary) :
#            . . .
#         def getName(self) :
#            . . .
#         def getSalary(self) :
#            . . .
# Define a class Manager that inherits from the class Employee and adds an instance
# variable _bonus for storing a salary bonus. Omit any new methods.


class Employee():
    def __init__(self, name="", base_salary=0.0):
        self._name = name
        self._base_salary = base_salary

    def set_name(self, new_name):
        self._name = new_name

    def set_base_salary(self, new_salary):
        self._base_salary = new_salary

    def get_name(self):
        return self._name

    def get_salary(self):
        return self._base_salary


class Manager(Employee):
    def __init__(self, name="", base_salary=0.0, bonus=0.0):
        super().__init__(name, base_salary)
        self._bonus = bonus

    def get_bonus(self):
        return self._bonus
