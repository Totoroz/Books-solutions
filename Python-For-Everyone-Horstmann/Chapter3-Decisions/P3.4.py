# Write a program that reads three numbers and prints “all the same” if they are all the
# same, “all different” if they are all different, and “neither” otherwise.

number1 = float(input("Enter number one: "))
number2 = float(input("Enter number two: "))
number3 = float(input("Enter number three: "))

if number1 == number2 and number2 == number3 :
    print("They're all the same")

elif number1 != number2 and number2 != number3 and number1 != number3:
    print("They're all different")

else:
    print("Neither")