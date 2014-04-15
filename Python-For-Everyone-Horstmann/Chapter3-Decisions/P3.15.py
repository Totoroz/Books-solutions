# Write a program that reads in three floating­point numbers and prints the largest of
# the three inputs without using the  max function. For example:
#     Enter a number: 4
#     Enter a number: 9
#     Enter a number: 2.5
#     The largest number is 9.0

number1 = float(input("Enter a number: "))
number2 = float(input("Enter a number: "))
number3 = float(input("Enter a number: "))

largest = 0

if number1 >= number2 and number1 > number3:
    largest =  number1

elif number2 > number1 and number2 >= number3:
    largest = number2

else:
    largest = number3

print("Largest number is:", largest)