# Write a program that reads a temperature value and the letter C for Celsius or F for
# Fahrenheit. Print whether water is liquid, solid, or gaseous at the given temperature
# at sea level.

type = str(input("Enter the temperature type, C for celsius or F for fahrenheit: "))
temperature = float(input("Enter the temperature: "))

if type == "C":
    if temperature >= 0 and temperature < 100:
        print("Water is liquid.")

    elif temperature >= 100:
        print("Water is gaseous.")

    else:
        print("Water is solid.")

elif type == "F":
    if temperature >= 32 and temperature < 132:
        print("Water is liquid.")

    elif temperature >= 132:
        print("Water is gaseous.")

    else:
        print("Water is solid.")