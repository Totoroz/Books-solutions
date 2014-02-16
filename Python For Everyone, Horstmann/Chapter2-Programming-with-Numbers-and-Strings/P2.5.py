# Enhance the output of Exercise P2.4 so that the numbers are properly aligned:
# Sum: 45
# Difference: -5
# Product: 500
# Average: 22.50
# Distance: 5
# Maximum: 25
# Minimum: 20

number1 = int(input("Enter number one: "))
number2 = int(input("Enter number two: "))

numbersSum = number1 + number2
numbersDifference = number1 - number2
numbersProduct = number1 * number1
numbersDistance = abs(number1 - number2)
numbersMax = max(number1, number2)
numbersMin = min(number1, number2)


print("The sum is:        %3d" % numbersSum)
print("The difference is: %3d" % numbersDifference)
print("The product is:    %3d " % numbersProduct)
print("The distance is:   %3d" % numbersDistance)
print("The maximum is:    %3d" % numbersMax)
print("The minimum is:    %3d" % numbersMin)