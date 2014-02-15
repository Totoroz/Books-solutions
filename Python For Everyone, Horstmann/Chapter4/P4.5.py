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