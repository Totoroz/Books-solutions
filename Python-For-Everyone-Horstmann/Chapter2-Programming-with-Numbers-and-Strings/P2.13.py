# Write a program that reads a number between 1,000 and 999,999 from the user,
# where the user enters a comma in the input. Then print the number without a
# comma. Here is a sample dialog; the user input is in color:
# Please enter an integer between 10,000 and 99,999: 23,456
# 23456
# Hint: Read the input as a string. Turn the strings consisting of the first two charac-
# ters and the last three characters into numbers, and combine them.

userInput = float(input("Please enter an integer between 10,000 and 99,999: "))

strUserInput = str(userInput)
decimal = strUserInput[:2]
float = strUserInput[3:]

print(decimal + float)