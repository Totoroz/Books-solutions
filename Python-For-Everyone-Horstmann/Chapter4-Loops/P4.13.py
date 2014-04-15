# Write a program that reads an integer value and prints all of its binary digits in
# reverse order: Print the remainder  number % 2 , then replace the number with  number //
# 2 . Keep going until the number is 0. For example, if the user provides the input 13,
# the output should be
#     1
#     0
#     1
#     1

inputN = int(input("Enter a number: "))

while inputN > 0:
    print(inputN % 2)
    inputN = inputN // 2