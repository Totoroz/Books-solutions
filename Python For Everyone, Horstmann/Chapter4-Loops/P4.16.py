# Factoring of integers. Write a program that asks the user for an integer and then
# prints out all its factors. For example, when the user enters 150, the program should
# print
#     2
#     3
#     5
#     5

inputN = int(input("Enter an integer: "))

i = 2

while i <= inputN:
    if inputN % i == 0:
        print(i)
        inputN /= i

    else:
        i += 1