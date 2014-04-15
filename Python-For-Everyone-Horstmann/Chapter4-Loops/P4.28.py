# Currency conversion. Write a program that first asks the user to type today’s ex-
# change rate between U.S. dollars and Japanese yen, then reads U.S. dollar values and
# converts each to yen. Use 0 as a sentinel.

# imports
from sys import exit

currentExchangeRate = float(input("Current currency exchange rate(USD -> JPY): "))

if currentExchangeRate <= 0:
    exit("Invalid currency exchange rate. Less or equal to 0. Exiting...")

usdAmount = float(input("USD amount to convert: "))
jpyAmount = currentExchangeRate * usdAmount

print("$%.2f = %.2fJPY" % (usdAmount, jpyAmount))