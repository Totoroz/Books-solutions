# Unit conversion. Write a unit conversion program that asks the users from which
# unit they want to convert (fl. oz, gal, oz, lb, in, ft, mi) and to which unit they want to
# convert (ml, l, g, kg, mm, cm, m, km). Reject incompatible conversions (such as gal
# → km). Ask for the value to be converted, then display the result:
#     Convert from? gal
#     Convert to? ml
#     Value? 2.5
#     2.5 gal = 9463.5 ml

FLUID_OUNCE_TO_LITER = 0.029586
GALLON_TO_LITER = 3.758
OUNCE_TO_GRAM = 28.3495
POUND_TO_GRAM = 453.6
INCH_TO_METER = 0.00254
FOOT_TO_METER = 0.305
MILE_TO_METER = 1609.0

convertFrom = str(input("Convert from? (fl.oz, gal, oz, lb, in, ft, mi) "))
convertTo = str(input("Convert to? (ml, l, g, kg, mm, cm, m, km) "))
value = float(input("Value?: "))

cfactor = 0.0

if convertFrom == "fl.oz":
    if convertTo == "ml":
        cfactor = FLUID_OUNCE_TO_LITER * 1000

    elif convertTo == "l":
        cfactor = FLUID_OUNCE_TO_LITER

elif convertFrom == "gal":
    if convertTo == "ml":
        cfactor = GALLON_TO_LITER * 1000

    elif convertTo == "l":
        cfactor = GALLON_TO_LITER

elif convertFrom == "oz":
    if convertTo == "g":
        cfactor = OUNCE_TO_GRAM

    elif convertTo == "kg":
        cfactor = OUNCE_TO_GRAM / 1000

elif convertFrom == "lb":
    if convertTo == "g":
        cfactor = POUND_TO_GRAM

    elif convertTo == "kg":
        cfactor = POUND_TO_GRAM / 1000

elif convertFrom == "in":
    if convertTo == "mm":
        cfactor = INCH_TO_METER * 1000

    elif convertTo == "cm":
        cfactor = INCH_TO_METER * 100

    elif convertTo == "m":
        cfactor = INCH_TO_METER

    elif convertTo == "km":
        cfactor = INCH_TO_METER / 1000

elif convertFrom == "ft":
    if convertTo == "mm":
        cfactor = FOOT_TO_METER * 1000

    elif convertTo == "cm":
        cfactor = FOOT_TO_METER * 100

    elif convertTo == "m":
        cfactor = FOOT_TO_METER

    elif convertTo == "km":
        cfactor = FOOT_TO_METER / 1000

elif convertFrom == "mi":
    if convertTo == "mm":
        cfactor = MILE_TO_METER * 1000

    elif convertTo == "cm":
        cfactor = MILE_TO_METER * 100

    elif convertTo == "m":
        cfactor = MILE_TO_METER

    elif convertTo == "km":
        cfactor = MILE_TO_METER / 1000


if cfactor == 0.0:
    print("Conversion is not available")

else:
    converted = value * cfactor
    print(str(value) + " " + str(convertFrom) + " = " + str(converted) + " " + str(convertTo))

