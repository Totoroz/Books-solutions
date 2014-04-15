# Write a program that reads a file containing two columns of floating-point ­numbers.
# Prompt the user for the file name. Print the average of each column.

# IMPORTS
from sys import exit

# FUNCTIONS

# main
def main():
    filename = str(input("Enter file to open: "))

    file = open(filename, "r")

    sumColumn1 = 0
    sumColumn2 = 0

    for line in file:
        line = line.split()
        line = list(map(float, line))
        try:
            sumColumn1 += line[0]
            sumColumn2 += line[1]
        except TypeError:
            exit("Error: File doesn't contain numbers!")

    file.close()
    print("Sum of column 1:", sumColumn1)
    print("Sum of column 2:", sumColumn2)
    
# PROGRAM RUN
if __name__ == "__main__":
    main()
