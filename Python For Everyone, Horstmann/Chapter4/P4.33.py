# Credit Card Number Check. The last digit of a credit card number is the check digit,
# which protects against transcription errors such as an error in a single digit or
# switching two digits. The following method is used to verify actual credit card
# numbers but, for simplicity, we will describe it for numbers with 8 digits instead
# of 16:
#     • Starting from the rightmost digit, form the sum of every other digit. For
#     example, if the credit card number is 43589795, then you form the sum
#     5 + 7 + 8 + 3 = 23.
#     • Double each of the digits that were not included in the preceding step. Add all
#     digits of the resulting numbers. For example, with the number given above,
#     doubling the digits, starting with the next-to-last one, yields 18 18 10 8. Adding
#     all digits in these values yields 1 + 8 + 1 + 8 + 1 + 0 + 8 = 27.
#     • Add the sums of the two preceding steps. If the last digit of the result is 0, the
#     number is valid. In our case, 23 + 27 = 50, so the number is valid.
# Write a program that implements this algorithm. The user should supply an 8-digit
# number, and you should print out whether the number is valid or not. If it is not
# valid, you should print out the value of the check digit that would make the number
# valid.

number = int(input("8-digit credit card number: "))

# split by digits
digit_7 = number % 10
number = int(number / 10)
digit_6 = number % 10
number = int(number / 10)
digit_5 = number % 10
number = int(number / 10)
digit_4 = number % 10
number = int(number / 10)
digit_3 = number % 10
number = int(number / 10)
digit_2 = number % 10
number = int(number / 10)
digit_1 = number % 10
number = int(number / 10)
digit_0 = number % 10

# split by parts

# part 1
part1 = digit_7 + digit_5 + digit_3 + digit_1

# part 2
twice =  2 * digit_6
part2 = 0

part2 = int(part2 + ((twice % 10) + (twice / 10)))
twice = 2 * digit_4
part2 = int(part2 + ((twice % 10) + (twice / 10)))
twice = 2 * digit_2
part2 = int(part2 + ((twice % 10) + (twice / 10)))
twice = 2 * digit_0
part2 = int(part2 + ((twice % 10) + (twice / 10)))

# total validation number
total = part1 + part2

# check validity
remaining = total % 10

if remaining == 0:
    print("Card number is valid")

else:
    print("Card number is invalid")

    if digit_7 - remaining < 0:
        checkDigit = int(digit_7 + (10 - remaining))
        print("Check digit should have been:", checkDigit)

    else:
        checkDigit = int(digit_7 - remaining)
        print("Check digit should have been:", checkDigit)