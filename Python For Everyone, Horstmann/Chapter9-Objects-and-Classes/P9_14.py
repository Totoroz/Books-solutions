# Write functions
# •    def sphereVolume(r)
# •    def sphereSurface(r)
# •    def cylinderVolume(r, h)
# •    def cylinderSurface(r, h)
# •    def coneVolume(r, h)
# •    def coneSurface(r, h)
# that compute the volume and surface area of a sphere with a radius r , a cylinder with
# a circular base with radius r and height h , and a cone with a circular base with radius r
# and height h . Place them into a geom­etry module. Then write a program that prompts
# the user for the values of r and h , calls the six functions, and prints the results.


# IMPORTS
from math import sqrt
from math import pi


# FUNCTIONS
def sphere_volume(radius):
    return 4/3 * pi * radius ** 3


def sphere_surface(radius):
    return 4 * pi * radius ** 2


def cylinder_volume(radius, height):
    return pi * radius ** 2


def cylinder_surface(radius, height):
    return pi * radius ** 2 * 2 * pi * radius * height


def cone_volume(radius, height):
    return 1/3 * pi * radius ** 2 * height


def cone_surface(radius, height):
    return pi * radius ** 2 + pi * radius * sqrt(height ** 2 + radius ** 2)


# main
def main():
    radius = input("Radius>")
    height = input("Height>")

    print("Sphere volume: {}".format(sphere_volume(radius)))
    print("Sphere surface: {}".format(sphere_surface(radius)))
    print("Cylinder volume: {}".format(cylinder_volume(radius, height)))
    print("Cylinder surface area: {}".format(cylinder_surface(radius, height)))
    print("Cone volume: {}".format(cone_volume(radius, height)))
    print("Cone surface: {}".format(cone_surface(radius, height)))


# PROGRAM RUN
if __name__ == "__main__":
    main()
