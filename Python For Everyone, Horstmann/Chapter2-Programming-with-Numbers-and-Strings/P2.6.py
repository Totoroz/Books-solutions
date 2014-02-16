# Write a program that prompts the user for a measurement in meters and then con­
# verts it to miles, feet, and inches.

measurementMeters = float(input("Enter the measurement in meters: "))

measurementMiles = measurementMeters * 0.000621371192
measurementFeet = measurementMeters * 3.2808399
measurementInches = measurementMeters * 39.3700787

print("Measurement in miles: %f" % measurementMiles)
print("Measurement in feet: %.2f" % measurementFeet)
print("Measurement in inches: %.2f" % measurementInches)