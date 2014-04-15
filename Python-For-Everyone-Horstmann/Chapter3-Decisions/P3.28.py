# Roman numbers. Write a program that converts a positive integer into the Roman
# number system. The Roman number system has digits
#     I 1
#     V 5
#     X 10
#     L 50
#     C 100
#     D 500
#     M 1,000
# Numbers are formed according to the following rules:
#     a.  Only numbers up to 3,999 are represented.
#     b.  As in the decimal system, the thousands, hundreds, tens, and ones are ex­
#     pressed separately.
#     c.  The numbers 1 to 9 are expressed as
#         I  1
#         II  2
#         III  3
#         IV  4
#         V  5
#         VI  6
#         VII  7
#         VIII  8
#         IX  9
#         As you can see, an I preceding a V or X is subtracted from the value, and you
#         can never have more than three I’s in a row.
#     d.  Tens and hundreds are done the same way, except that the letters X, L, C and C,
#         D, M are used instead of I, V, X, respectively.
# Your program should take an input, such as 1978, and convert it to Roman numerals,
# MCMLXXVIII.

from sys import exit

num = int(input("Enter the integer less than 4000, you wish to convert: "))

if num <= 0:
    exit("Your number must be greater than zero")

roman = ""

digit = num / 1000

if digit == 3:
    roman = "MMM"

elif digit == 2:
    roman = "MM"

elif digit == 1:
    roman = "M"

num %= 1000
digit = num / 1000

if digit == 9:
    roman += "CM"

elif digit == 4:
    roman += "CD"

else:
    if digit >= 5:
        roman += "D"
        digit -= 5

    if digit == 3:
        roman += "CCC"

    elif digit == 2:
        roman += "CC"

    elif digit == 1:
        roman += "C"

num %= 100
digit = num / 10

if digit == 9:
    roman += "XC"

elif digit == 4:
    roman += "XL"

else:
    if digit >= 5:
        roman += "L"
        digit -= 5

    if digit == 3:
        roman += "XXX"

    elif digit == 2:
        roman += "XX"

    elif digit == 1:
        roman += "X"

digit = num % 10

if digit == 9:
    roman += "IX"

elif digit == 4:
    roman += "IV"

else:
    if digit >= 5:
        roman += "V"
        digit -= 5

    if digit == 3:
        roman += "III"

    elif digit == 2:
        roman += "II"

    elif digit == 1:
        roman += "I"

print("The roman numeral is:", roman)
