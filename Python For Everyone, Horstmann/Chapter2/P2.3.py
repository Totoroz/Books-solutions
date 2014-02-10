# Write a program that reads a number and displays the square, cube, and fourth
# power. Use the  ** operator only for the fourth power.


number = float(input("Enter a number: "))

numberSquare = number * number
numberCube = number * number * number
numberFourth = number ** 4

print("User input number: %.2f" % number)
print("Square of number: %.2f" % numberSquare)
print("Cube of number: %.2f" % numberCube)
print("Fourth power of number: %.2f" % numberFourth)