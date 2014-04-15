# Write a program that asks the user for the lengths of the sides of a rectangle. Then
# print
# • The area and perimeter of the rectangle
# • The length of the diagonal

from math import sqrt

rectangleSide1 = float(input("Rectangle side 1:    "))
rectangleSide2 = float(input("Rectangle side 2:    "))

rectangleArea = rectangleSide1 * rectangleSide2
rectanglePerimeter = 2 * (rectangleSide1 + rectangleSide2)
rectangleDiagonal = sqrt((rectangleSide1 * rectangleSide1) + (rectangleSide2 * rectangleSide2))

print("Rectangle area:      %.2f" % rectangleArea)
print("Rectangle perimeter: %.2f" % rectanglePerimeter)
print("Rectangle diagonal:  %.2f" % rectangleDiagonal)