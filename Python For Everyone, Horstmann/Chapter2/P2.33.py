# The following pseudocode describes how to turn a string containing a ten-digit
# phone number (such as  "4155551212" ) into a more readable string with parentheses
# and dashes, like this:  "(415) 555-1212" .
#     Take the string consisting of the first three characters and surround it with "(" and ") ". This is the area
#     code.
#     Concatenate the area code, the string consisting of the next three characters, a hyphen, and the string
#     consisting of the last four characters. This is the formatted number.
# Translate this pseudocode into a Python program that reads a telephone number into
# a string variable, com putes the formatted number, and prints it.

userInput = str(input("Enter a ten-digit telephone number: "))

print("(%s) %s-%s" %(userInput[:3], userInput[3:6], userInput[-4:]))