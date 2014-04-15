# Magic squares. An n × n matrix that is filled with the numbers 1, 2, 3, . . ., square n is a
# magic square if the sum of the elements in each row, in each column, and in the two
# diagonals is the same value.
# Write a program that reads in 16 values from the keyboard and tests whether they
# form a magic square when put into a 4 × 4 table. You need to test two features:
#     1.	 Does each of the numbers 1, 2, ..., 16 occur in the user input?
#     2.	 When the numbers are put into a square, are the sums of the rows, columns,
#     and diagonals equal to each other?

# IMPORT
from sys import exit

# FUNCTIONS

# main
def main():
    square_list = []

    # input
    print("Enter 16 values: ")
    for i in range(16):
        inputN = int(input())
        square_list.append(inputN)

    # check if the numbers from 1 to 16 occur exactly once
    for i in range(1, 17):
        found = False
        for j in range(len(square_list)):
            if found == False:
                if square_list[j] == i:
                    found = True

        if found == False:
            print(i, "not in the matrix")

    # magic square matrix
    magicSquare = [[0 for x in range(4)] for x in range(4) ]

    # construct a matrix from square_list
    for i in range(4):
        for j in range(4):
            magicSquare[i][j] = square_list[i * 4 + j]

    sumMatrix = 0

    # sum each row
    for i in range(4):
        total = 0
        for j in range(4):
            total += magicSquare[i][j]

        if i == 0:
            sumMatrix = total

        elif sumMatrix != total:
            exit("Not a magic square")

    # sum each column
    for i in range(4):
        total = 0
        for j in range(4):
            total += magicSquare[j][i]

        if sumMatrix != 0:
            exit("Not a magic square")

    # sum first diagonal
    total = 0
    for i in range(4):
        total += magicSquare[i][i]

    if sumMatrix != total:
        exit("Not a magic square")

    # sum second diagonal
    total = 0
    for i in range(4):
        total += magicSquare[i][4 - 1 - i]

    if sumMatrix != total:
        exit("Not a magic square")

    # if nothing fails, then it's a square
    print("It's a magic square")

# PROGRAM RUN
main()