# Write a program that prompts the user for a radius and then prints
# • The area and circumference of a circle with that radius
# • The volume and surface area of a sphere with that radius

radius = float(input("Enter the radius: "))

Pi = 3.14159265359

#circle
areaCircle = (radius * radius ) * Pi
diameterCircle = 2 * radius
circumferenceCircle = Pi * diameterCircle
#sphere
volumeSphere = (4 / 3) * Pi * (radius ** 3)
volumeArea = 4 * Pi * (radius * radius)


print("Circle area:          %.2f" % areaCircle)
print("Circle diameter:      %.2f" % diameterCircle)
print("Circle circumference: %.2f" % circumferenceCircle)
print("-" * 28)
print("Sphere volume:        %.2f" % volumeSphere)
print("Sphere area:          %.2f " % volumeArea)