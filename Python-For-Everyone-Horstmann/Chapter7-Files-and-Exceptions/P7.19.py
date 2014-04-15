# Write a program that concatenates the contents of several files into one file. 
# For example,
#     catfiles chapter1.txt chapter2.txt chapter3.txt book.txt
# makes a long file book.txt that contains the contents of the files chapter1.txt ,
# chapter2.txt , and chapter3.txt . The target file is always the last file specified
# on the command line.

# IMPORTS
from sys import argv, exit

# FUNCTIONS

# main
def main():
    if len(argv) < 3:
        exit("Error: Invalid number of arguments!")

    elif argv[1] != "catfiles":
        exit("Error: Invalid command given!")

    outputFilename = argv[len(argv) - 1]
    outputFile = open(outputFilename, "a")

    for i in range(2, len(argv) - 1):
        with open(argv[i], "r") as file:
            for line in file:
                outputFile.write(line)
            file.close()

    outputFile.close()

# PROGRAM RUN
if __name__ == "__main__":
    main()
