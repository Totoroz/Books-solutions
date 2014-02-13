# Repeat Exercise P3.5, but before reading the numbers, ask the user whether increas­
# ing/decreasing should be “strict” or “lenient”. In lenient mode, the sequence 3 4 4 is
# increasing and the sequence 4 4 4 is both increasing and decreasing

order = str(input("Strict or lenient?: "))

number1 = float(input("Enter number one: "))
number2 = float(input("Enter number two: "))
number3 = float(input("Enter number three: "))

if order == "strict" or order == "Strict":
    if number1 < number2 < number3:
        print("Increasing")

    elif number1 > number2 > number3:
        print("Decreasing")

    else:
        print("Neither")

elif order == "lenient" or order == "Lenient":
    if (number1 < number2 <= number3) or (number1 <= number2 < number3):
        print("Increasing")

    elif (number1 > number2 >= number3) or (number1 >= number2 > number3):
        print("Decreasing")

    elif number1 == number2 and number2 == number3:
        print("Increasing and decreasing")

    else:
        print("Neither")