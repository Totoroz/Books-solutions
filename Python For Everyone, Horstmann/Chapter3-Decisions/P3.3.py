# Write a program that reads an integer and prints how many digits the number has, by
# checking whether the number is ≥ 10, ≥ 100, and so on. (Assume that all integers are
# less than ten billion.) If the number is negative, first multiply it by –1.

userInput = int(input("Enter an integer: "))

numDigits = 0

if userInput < 0:
    userInput *= -1


if userInput >= 10 and userInput < 100:
    numDigits = 2

elif userInput >= 100 and userInput < 1000:
    numDigits = 3

elif userInput >= 1000 and userInput < 10000:
    numDigits = 4

elif userInput >= 10000 and userInput < 100000:
    numDigits = 5

elif userInput >= 100000 and userInput < 1000000:
    numDigits = 6

elif userInput >= 1000000 and userInput < 10000000:
    numDigits = 7

elif userInput >= 10000000 and userInput < 100000000:
    numDigits = 8

elif userInput >= 100000000 and userInput < 1000000000:
    numDigits = 9

elif userInput >= 1000000000 and userInput < 10000000000:
    numDigits = 10

elif userInput >= 10000000000 and userInput < 100000000000:
    numDigits = 11

else:
    numDigits = "greater than 11(10 billion)"


print("The number of digits is:", numDigits)