# Write a program copyfile that copies one file to another.
# The file names are specified
# on the command line. For example,
# copyfile report.txt report.sav


# IMPORTS
from sys import argv


# FUNCTIONS
def copy_file(input_filename, output_filename):
    read_file = open(input_filename, "r")
    contents = read_file.read()
    read_file.close()

    write_file = open(output_filename, "w")
    write_file.write(contents)
    write_file.close()


# main
def main():
    copy_file(argv[1], argv[2])


# PROGRAM RUN
if __name__ == "__main__":
    main()
