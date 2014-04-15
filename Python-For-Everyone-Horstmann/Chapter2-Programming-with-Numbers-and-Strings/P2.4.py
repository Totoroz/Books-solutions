# Write a program that prompts the user for two integers and then prints
# • The sum
# • The difference
# • The product
# • The average
# • The distance (absolute value of the difference)
# • The maximum (the larger of the two)
# • The minimum (the smaller of the two)
# Hint: Python defines  max and  min functions that accept a sequence of values, each
# separated with a comma.

number1 = int(input("Enter number one: "))
number2 = int(input("Enter number two: "))

numbersSum = number1 + number2
numbersDifference = number1 - number2
numbersProduct = number1 * number1
numbersDistance = abs(number1 - number2)
numbersMax = max(number1, number2)
numbersMin = min(number1, number2)


print("The sum is: %d" % numbersSum)
print("The difference is: %d" % numbersDifference)
print("The product is: %d " % numbersProduct)
print("The distance is: %d" % numbersDistance)
print("The maximum is: %d" % numbersMax)
print("The minimum is: %d" % numbersMin)