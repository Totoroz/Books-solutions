# Write a program that reads in two floating­point numbers and tests whether they are
# the same up to two decimal places. Here are two sample runs.
#     Enter a floating-point number: 2.0
#     Enter a floating-point number: 1.99998
#     They are the same up to two decimal places.
#     Enter a floating-point number: 2.0
#     Enter a floating-point number: 1.98999
#     They are different.

number1 = float(input("Enter a floating-point number: "))
number2 = float(input("Enter a floating-point number: "))

if abs(number1 - number2) <= 0.01:
    print("They're the same")

else:
    print("They're different.")