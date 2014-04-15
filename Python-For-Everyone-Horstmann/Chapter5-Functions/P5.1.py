# Write the following functions and provide a program to test them.
# a.  def smallest(x, y, z) (returning the smallest of the arguments)
# b.  def average(x, y, z) (returning the average of the arguments)
# FUNCTIONS
def smallest(x, y , z):
    if x <= y and x <= z:
        return x

    elif y <= x and y <= z:
        return  y

    else:
        return z

def average(x, y, z):
    return (x + y + z) / 3


def main():
    x = float(input("Enter x: "))
    y = float(input("Enter y: "))
    z = float(input("Enter z: "))
    print("Smallest: ", smallest(x, y, z))
    print("Average: ", average(x, y, z))


# PROGRAM RUN
main()