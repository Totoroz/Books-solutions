# Write a program that generates a sequence of 20 random values between 0 and 99 in
# a list, prints the sequence, sorts it, and prints the sorted sequence. Use the list sort
# method.

# IMPORTS
from random import randint

# FUNCTIONS
def generateSequence(list):
    for i in range(20):
        list.append(randint(0, 99))

    list.sort()
    return list

# main
def main():
    exampleList = []
    exampleList = generateSequence(exampleList)
    print(exampleList)

# PROGRAM RUN
main()