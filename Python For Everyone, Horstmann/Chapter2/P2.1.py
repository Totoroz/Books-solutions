# Write a program that displays the dimensions of a letter­size (8.5 × 11 inch) sheet of
# paper in millimeters. There are 25.4 millimeters per inch. Use con stants and com­
# ments in your program.

dimensionX = float(input("Enter the dimensions of the sheet in inches.\nX: "))
dimensionY = float(input("Y: "))

milimetersPerInch = 25.4

dimensionX *= milimetersPerInch
dimensionY *= milimetersPerInch

print("The dimensions in milimeters are: %.2f, %.2f" % (dimensionX, dimensionY) )