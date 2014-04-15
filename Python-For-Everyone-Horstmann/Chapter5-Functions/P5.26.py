# Write a program that reads in a bar code (with  : denoting half bars and |  denoting
# full bars) and prints out the zip code it represents. Print an error message if the bar
# code is not correct.

# IMPORTS
from sys import exit

# FUNCTIONS
def barcodeToNum(barcode):
    if barcode == "||:::": return 0
    elif barcode == ":::||": return 1
    elif barcode == "::|:|": return 2
    elif barcode == "::||:": return 3
    elif barcode == ":|::|": return 4
    elif barcode == ":|:|:": return 5
    elif barcode == ":||::": return 6
    elif barcode == "|:::|": return 7
    elif barcode == "|::|:": return 8
    elif barcode == "|:|::": return 9

    else:
        exit("Unknown barcode")


def convert(barcode):
    NDIGIT = 6
    DIGIT_LENGTH = 5

    if len(barcode) != 2 + NDIGIT * DIGIT_LENGTH:
        exit("Invalid barcode")

    if barcode[0] != "|":
        exit("Invalid barcode starting character. Likely a wrong barcode too")

    if barcode[-1] != "|":
        exit("Invalid barcode ending character. Likely a wrong barcode too")

    d1 = barcodeToNum(barcode[1:DIGIT_LENGTH + 1])
    d2 = barcodeToNum(barcode[1 + DIGIT_LENGTH:2 * DIGIT_LENGTH + 1])
    d3 = barcodeToNum(barcode[1 + 2 * DIGIT_LENGTH:3 * DIGIT_LENGTH + 1])
    d4 = barcodeToNum(barcode[1 + 3 * DIGIT_LENGTH:4 * DIGIT_LENGTH + 1])
    d5 = barcodeToNum(barcode[1 + 4 * DIGIT_LENGTH:5 * DIGIT_LENGTH + 1])
    d6 = barcodeToNum(barcode[1 + 5 * DIGIT_LENGTH:6 * DIGIT_LENGTH + 1])

    if (d1 + d2 + d3 + d4 + d5 + d6) % 10 != 0:
        exit("Invalid barcode sum")

    return 10000 * d1 + 1000 * d2 + 100 * d3 + 10 * d4 + d5

# main
def main():
    print("Example input: ||:|:::|:|:||::::::||:|::|:::|||")
    print("Example expected output: 95014")

    inputBarcode = str(input("Enter a postal barcode: "))

    value = convert(inputBarcode)
    if value >= 0:
        print("The value is", value)

    else:
        print("The postal bar code is invalid")

# PROGRAM RUN
main()