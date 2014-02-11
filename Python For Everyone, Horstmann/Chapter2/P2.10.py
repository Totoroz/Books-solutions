# Write a program that helps a person decide whether to buy a hybrid car. Your
# pro gram’s inputs should be:
# • The cost of a new car
# • The estimated miles driven per year
# • The estimated gas price
# • The efficiency in miles per gallon
# • The estimated resale value after 5 years
# Compute the total cost of owning the car for
# five years. (For simplic ity, we will not take the
# cost of financing into account.) Obtain
# realistic prices for a new and used hybrid
# and a com parable car from the Web. Run your program twice, using today’s gas
# price and 15,000 miles per year. Include pseudocode and the program runs with your
# assignment.

carCost = float(input("Enter the cost of the car: "))
milesDriven = int(input("Enter number of miles driven per year: "))
estimatedGasPrice = float(input("Enter estimated gas price: "))
estimatedResaleValue = float(input("Estimated resale value after 5 years: "))

costToOwn = carCost + (5 * milesDriven * estimatedGasPrice)
print("Total cost to own for 5 year is $%.2f" %  costToOwn)

estimatedResaleValue = carCost - estimatedResaleValue
print("Cost after resale is $%.2f" % estimatedResaleValue)
