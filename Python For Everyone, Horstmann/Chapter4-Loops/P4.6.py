# Translate the following pseudocode for finding the minimum value from a set of
# inputs into a Python program.
#     Set a Boolean variable "first" to true.
#     While another value has been read successfully
#         If first is true
#             Set the minimum to the value.
#             Set first to false.
#         Else if the value is less than the minimum
#             Set the minimum to the value.
#     Print the minimum.


# imports
from sys import exit


first = True

try:
    inputN = float(input("Enter a number: "))

except ValueError:
    print("Not a number")
    exit()

minN = inputN

while True:
    try:
        inputN = float(input("Enter a number: "))

    except ValueError:
        break

    if first == True:
        minN = inputN
        first = False

    elif inputN < minN:
        minN = inputN

print("Minimum value", minN)