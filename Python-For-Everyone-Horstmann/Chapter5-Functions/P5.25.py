# Postal bar codes. For faster sorting of letters, the United States Postal Service
# encourages companies that send large volumes of mail to use a bar code denoting the zip
# code (see Figure 6).
# The encoding scheme for a five-digit zip code is shown in Figure 7. There are
# full-height frame bars on each side. The five encoded digits are followed by a check
# digit, which is computed as follows: Add up all digits, and choose the check digit to
# make the sum a multiple of 10. For example, the zip code 95014 has a sum of 19, so
# the check digit is 1 to make the sum equal to 20.
# The digit can be easily computed from the bar code using the column weights 7, 4, 2,
# 1, 0. For example, 01100 is 0 × 7 + 1 × 4 + 1 × 2 + 0 × 1 + 0 × 0 = 6. The only exception
# is 0, which would yield 11 according to the weight formula.
# Write a program that asks the user for a zip code and prints the bar code. Use  : for
# half bars,  | for full bars. For example, 95014 becomes
# ||:|:::|:|:||::::::||:|::|:::|||
# Provide these functions:
#     def printDigit(d)
#     def printBarCode(zipCode)

# FUNCTIONS
def printDigit(digit):
    if digit == 0:
        return "||:::"

    elif digit == 1:
        return ":::||"

    elif digit == 2:
        return "::|:|"

    elif digit == 3:
        return "::||:"

    elif digit == 4:
        return ":|::|"

    elif digit == 5:
        return ":|:|:"

    elif digit == 6:
        return ":||::"

    elif digit == 7:
        return "|:::|"

    elif digit == 8:
        return "|::|:"

    else:
        return "|:|::"

def digitSum(value):
    sum = 0

    while value > 0:
        sum += value % 10
        value = value // 10

    return sum

def printBarcode(zipCode):
    bars = printDigit(zipCode % 10)
    zipCode = zipCode // 10
    bars = printDigit(zipCode % 10) + bars
    zipCode = zipCode // 10
    bars = printDigit(zipCode % 10) + bars
    zipCode = zipCode // 10
    bars = printDigit(zipCode % 10) + bars
    zipCode = zipCode // 10
    bars = printDigit(zipCode % 10) + bars

    sum = digitSum(zipCode)
    correction = (10 - sum % 10) % 10

    return "|" + bars + printDigit(correction) + "|"

# main
def main():
    inputZIP = int(input("Enter a ZIP code: "))
    print("The bar code representation of %d is" % inputZIP)
    print(printBarcode(inputZIP))

# PROGRAM RUN
main()