# Write the following functions and provide a program to test them.
# a.  def allTheSame(x, y, z) (returning true if the arguments are all the same)
# b.  def allDifferent(x, y, z) (returning true if the arguments are all different)
# c.  def sorted(x, y, z) (returning true if the arguments are sorted, with the
# smallest one coming first)
# FUNCTIONS
def allTheSame(x, y, z):
    if x == y and x == z:
        return True

    else:
        return False

def allDifferent(x, y, z):
    if x != y and x != z and y != z:
        return True

    else:
        return False

# avoids shadowing the builtins.py sorted function
def sortedFunc(x, y, z):
    if x > y and y > z:
        return True

    elif x > z and z > y:
        return True

    elif y > x and x > z:
        return True

    elif y > z and z > x:
        return True

    elif z > x and x > x:
        return True

    elif z > y and y > x:
        return True

    else:
        return False

def main():
    x = float(input("x: "))
    y = float(input("y: "))
    z = float(input("z: "))

    print("All different: ", allDifferent(x, y, z))
    print("All the same: ", allTheSame(x, y, z))
    print("Sorted: ", sortedFunc(x, y, z))


# PROGRAM RUN
main()