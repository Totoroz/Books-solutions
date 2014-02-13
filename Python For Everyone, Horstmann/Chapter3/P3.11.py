# Add error handling to Exercise P3.10. If the user provides an invalid unit for the
# altitude, print an error message and end the program.

from sys import exit

FREEZE_CELSIUS = 0
FREEZE_FAHRENHEIT = 32
boil_celsius = 100
boil_fahrenheit = 212

temperature = float(input("Enter the temperature: "))
type = str(input("Enter C for celsius or F for fahrenheit: "))
altitude = float(input("Enter the altitude above sea level: "))
units = str(input("Enter M for meters or F for feet: "))

if type == "C":
    if units == "M":
        boil_celsius -= (altitude / 300)

    elif units == "F":
        boil_celsius -= (altitude / 1000)

    else:
        exit("Invalid unit for the altitude. Exiting...")

    if temperature <= FREEZE_CELSIUS:
        print("Solid")

    elif temperature >= boil_celsius:
        print("Gas")

    else:
        print("Liquid")

else:
    if units == "M":
        boil_fahrenheit -= (altitude / 300)

    elif units == "F":
        boil_fahrenheit -= (altitude / 1000)

    else:
        exit("Invalid unit for the altitude. Exiting...")

    if temperature <= FREEZE_FAHRENHEIT:
        print("Solid")

    elif temperature >= boil_fahrenheit:
        print("Gas")

    else:
        print("Liquid")