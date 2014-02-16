# Improve the program discussed in How To 2.1 to allow input of quar ters in addition
# to bills.

#constants
PENNIES_PER_DOLLAR = 100
PENNIES_PER_QUARTER = 25


cashValue = float(input("Enter value (0.25 = quarter, 1.25 ="
                        " $1.25, 5 = $5 bill, etc.): "))

itemPrice = int(input("Item price in pennies: "))

amountDue = PENNIES_PER_DOLLAR * cashValue - itemPrice
dollarCoins = amountDue / PENNIES_PER_DOLLAR

amountDue %= PENNIES_PER_DOLLAR
quarters = amountDue / PENNIES_PER_QUARTER

print("Dollar coins: %6.2f" % dollarCoins)
print("Quarters:     %6.2f" % quarters)