# Write a program that reads a number between 1,000 and 999,999 from the user and
# prints it with a comma separating the thousands.
# Here is a sample dialog; the user input is in color:
#   Please enter an integer between 1000 and 999999: 23456
#   23,456

userInput = str(int(input("Please enter an integer between 10000 and 99999: ")))

print(userInput[:2] + "," + userInput[-3:])