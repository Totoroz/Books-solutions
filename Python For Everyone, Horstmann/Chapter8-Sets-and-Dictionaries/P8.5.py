# Write a program that keeps a dictionary in which both keys
# and values are strings—names of students and their course
# grades. Prompt the user of the program to add or remove
# students, to modify grades, or to print all grades. The printout should
# sorted by name and formatted like this:
# Carl: B+
# Joe: C
# Sarah: A
# Francine: A


# FUNCTIONS
def parse_command(command):
    return tuple(command.split(" "))


def is_command(command_tuple, command_string):
    return command_tuple[0] == command_string


def trigger_add_student(dictionary, student_name, student_grade):
    dictionary[student_name] = student_grade
    return dictionary


def trigger_remove_student(dictionary, student_name):
    if student_name in dictionary:
        dictionary.pop(student_name)
    return dictionary


def trigger_modify_grade(dictionary, student_name, new_grade):
    if student_name in dictionary:
        old_grade = dictionary[student_name]
        dictionary[student_name] = new_grade
    return dictionary


def trigger_print_students(dictionary):
    for key in sorted(dictionary):
        print("{}: {}".format(key, dictionary[key]))


# main
def main():
    students = {}
    while True:
        command = parse_command(input("Enter command>"))

        if is_command(command, "add"):
            trigger_add_student(students, command[1], command[2])

        elif is_command(command, "remove"):
            trigger_remove_student(students, command[1], command[2])

        elif is_command(command, "modify"):
            trigger_modify_grade(students, command[1], command[2])

        elif is_command(command, "print"):
            trigger_print_students(students)


# PROGRAM RUN
if __name__ == "__main__":
    main()
