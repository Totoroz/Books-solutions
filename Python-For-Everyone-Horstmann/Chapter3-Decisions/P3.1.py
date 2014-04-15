# Write a program that reads an integer and prints whether it is negative, zero, or
# positive.

userInput = int(input("Enter an integer: "))

if userInput < 0:
    print("It's negative")

elif userInput == 0:
    print("It's zero")

else:
    print("It's positive")