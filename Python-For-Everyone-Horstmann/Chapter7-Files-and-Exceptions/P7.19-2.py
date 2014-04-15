# Write a program that concatenates the contents of several files into one file.
# For example,
# catfiles chapter1.txt chapter2.txt chapter3.txt book.txt
# makes a long file book.txt that contains the contents of the files
# chapter1.txt, chapter2.txt, and chapter3.txt.
# The target file is always the last file specified on the command line.


# IMPORTS
from sys import argv


# FUNCTIONS
def get_arguments():
    list_arguments = []
    for arg in argv:
        list_arguments.append(arg)
    return list_arguments


def catfile(input, output):
    output_file = open(output, "a")
    with open(input, "r") as file:
        for line in file:
            output_file.write(line)
        file.close()
    output_file.close()


def catfiles(arguments_list, output_file):
    for i in range(1, len(arguments_list) - 1):
        catfile(arguments_list[i], output_file)


# main
def main():
    arguments = get_arguments()
    output_file = arguments[-1]
    catfiles(arguments, output_file)


# PROGRAM RUN
if __name__ == "__main__":
    main()
