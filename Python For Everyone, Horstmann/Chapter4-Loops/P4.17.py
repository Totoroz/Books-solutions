#  Prime numbers. Write a program that prompts the user for an integer and then prints
# out all prime numbers up to that integer. For example, when the user enters 20, the
# program should print
#     2
#     3
#     5
#     7
#     11
#     13
#     17
#     19
# Recall that a number is a prime number if it is not divisible by any number except 1
# and itself.

# imports
from math import sqrt

inputN = int(input("Enter an integer: "))

i = 2

while i <= inputN:
    if i == 2 or  i == 3:
        print(i)

    else:
        prime = True
        limit = int(sqrt(float(i)))

        for j in range(2, limit+1):
            if i % j == 0:
                prime = False

        if prime:
            print(i)

    i += 1