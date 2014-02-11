# The following pseudocode describes how to extract the dollars and cents from a
# price given as a floating-point value. For example, a price of 2.95 yields values 2 and
# 95 for the dollars and cents.
#     Convert the price to an integer and store it in a variable dollars.
#     Multiply the difference price - dollars by 100 and add 0.5.
#     Convert the result to an integer variable and store it in a variable cents.
# Translate this pseudocode into a Python program. Read a price and print the dollars
# and cents. Test your program with inputs 2.95 and 4.35.

price = float(input("Enter a price: "))

dollars = int(price)
cents = int((price - dollars) * 100 + 0.5)

print("%d dollars and %d cents" % (dollars, cents))