# DOCUMENTATION
# 20.
#   The Counter class in Section 9.2 didn’t have a constructor. Provide one.
#   Consider the class
#   constructorlass Person :
#   def _ _init_ _(self, firstName, lastName ) :
#   self._name = lastName + ", " + firstName
#   . . .
#   If an object is constructed as
#   harry = Person("Harry", "Morgan")
# 21.
#   what is the value of its instance variable _name ?
#   Provide an implementation for a Person constructor so that after the call
#   p = Person()
#   the _name instance variable of p is "unknown" .


class Person():
    def __init__(self, first_name="", last_name=""):
        self._name = "{}, {}".format(last_name, first_name)
        if first_name == "":
            self._name = "unknown"

    def get_name(self):
        return self._name
