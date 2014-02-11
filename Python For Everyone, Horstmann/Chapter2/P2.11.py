# Write a program that asks the user to input
# • The number of gallons of gas in the tank
# • The fuel efficiency in miles per gallon
# • The price of gas per gallon
# Then print the cost per 100 miles and how far the car can go with the gas in the tank.

gallons = float(input("Enter number of gallons in tank: "))
fuelEfficiency = float(input("Enter fuel efficiency in miles per gallons: "))
pricePerGal = float(input("Enter price of gas per gallon: "))

costPer100miles = 100 / fuelEfficiency * pricePerGal
print("The cost per 100 miles is $%.2f" % costPer100miles)

milesGas = fuelEfficiency * gallons
print("You can make it %.2f 5miles on that amount of gas." % milesGas)