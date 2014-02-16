# Write a program that reads three numbers and prints “increasing” if they are
# in increasing order, “decreasing” if they are in decreasing order, and “neither”
# otherwise. Here, “increasing” means “strictly increasing”, with each value larger
# than its predecessor. The sequence 3 4 4 would not be considered increasing.

number1 = float(input("Enter number one: "))
number2 = float(input("Enter number two: "))
number3 = float(input("Enter number three: "))

if number1 < number2 < number3:
    print("Increasing")

elif number1 > number2 > number3:
    print("Decreasing")

else:
    print("Neither")