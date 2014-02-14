# Write a program that asks the user to enter a month (1 for January, 2 for February,
# and so on) and then prints the number of days in the month. For February, print “28
# or 29 days”.
#     Enter a month: 5
#     30 days
# Do not use a separate  if/else branch for each month. Use Boolean operators

from sys import exit

month = int(input("Enter a month: "))

if month < 1 or month > 12:
    exit("Invalid input. Month less than 1 or greater than 12")

days = 0

if month == 4 or month == 6 or month == 9 or month == 11:
    print("30 days")

elif month == 2:
    print("28 or 29 days")

else:
    print("31 days")