# Write a program that reads in three integers and prints “in order” if they are sorted in
# ascending or descending order, or “not in order” otherwise. For example,
#     1 2 5 in order
#     1 5 2 not in order
#     5 2 1 in order
#     1 2 2 in order

number1 = float(input("Enter number one: "))
number2 = float(input("Enter number two: "))
number3 = float(input("Enter number three: "))

if (number1 < number2 < number3) or (number1 > number2 > number3)\
    or (number1 <= number2 < number3) or (number1 < number2 <= number3)\
    or (number1 >= number2 > number3) or (number1 > number2 >= number3):
    print("In order")

else:
    print("Not in order")