# Make a class Employee with a name and salary. Make a class Manager inherit from
# Employee . Add an instance variable, named _department , that stores a string. Supply
# a method _ _repr_ _ that prints the manager’s name, department, and salary. Make
# a class Executive inherit from Manager . Supply appropriate _ _repr_ _ methods for all
# classes. Supply a test program that tests these classes and methods.


class Employee():
    def __init__(self, name, salary):
        self._name = name
        self._salary = salary

    def get_name(self):
        return self._name

    def get_salary(self):
        return self._salary

    def __repr__(self):
        return "Name:{}\nSalary:{}".format(self._name, self._salary)


class Manager(Employee):
    def __init__(self, name, salary, department):
        super().__init__(name, salary)
        self._department = department

    def get_department(self):
        return self._department

    def __repr__(self):
        return "{}\nDepartment: {}".format(super().__repr__(), self.get_department())
