# Write functions
#     def sphereVolume(r)
#     def sphereSurface(r)
#     def cylinderVolume(r, h)
#     def cylinderSurface(r, h)
#     def coneVolume(r, h)
#     def coneSurface(r, h)
# that compute the volume and surface area of a sphere with radius  r , a cylinder with a
# circular base with radius  r and height  h , and a cone with a circular base with radius  r
# and height  h . Then write a program that prompts the user for the values of  r and  h ,
# calls the six functions, and prints the results.

# IMPORTS
from math import pi, sqrt

# FUNCTIONS
def sphereVolume(r):
    return 4 / 3.0 * pi * r * r * r

def sphereSurface(r):
    return 4 * pi * r * r

def cylinderVolume(r, h):
    return pi * r * r * h

def cylinderSurface(r, h):
    return 2 * pi * r * h

def coneVolume(r, h):
    return 1 / 3.0 * pi * r * r * h

def coneSurface(r, h):
    return sqrt(r * r + h * h) * r * pi

def main():
    r = float(input("Enter r: "))
    h = float(input("Enter h: "))

    print("Sphere volume:", sphereVolume(r))
    print("Sphere surface:", sphereSurface(r))
    print("Cylinder volume:", cylinderVolume(r, h))
    print("Cylinder surface:", cylinderSurface(r, h))
    print("Cone volume:", coneVolume(r, h))
    print("Cone surface:", coneSurface(r, h))

# PROGRAM RUN
main()