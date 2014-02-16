#  The boiling point of water drops by about one degree Celsius for every 300 meters
# (or 1,000 feet) of altitude. Improve the program of Exercise P3.9 to allow the user to
# supply the altitude in meters or feet.

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

    else:
        boil_celsius -= (altitude / 1000)

    if temperature <= FREEZE_CELSIUS:
        print("Solid")

    elif temperature >= boil_celsius:
        print("Gas")

    else:
        print("Liquid")

else:
    if units == "M":
        boil_fahrenheit -= (altitude / 300)

    else:
        boil_fahrenheit -= (altitude / 1000)

    if temperature <= FREEZE_FAHRENHEIT:
        print("Solid")

    elif temperature >= boil_fahrenheit:
        print("Gas")

    else:
        print("Liquid")