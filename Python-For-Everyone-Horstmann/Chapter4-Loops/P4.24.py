# The Drunkard’s Walk. A drunkard in a grid of streets randomly picks one of four
# directions and stumbles to the next intersection, then again randomly picks one of
# four directions, and so on. You might think that on average the drunkard doesn’t
# move very far because the choices cancel each other out, but that is actually not the
# case.
# Represent locations as integer pairs (x, y). Implement the drunkard’s walk over 100
# intersections, starting at (0, 0), and print the ending location.

# imports
from random import randint

# starting location
locX = 0
locY = 0

# movement directions
NORTH = 0
WEST = 1
EAST = 2
SOUTH = 3

# input number of tries
tries = int(input("Number of tries: "))

for i in range(tries):
    direction = randint(0,4)

    if direction == NORTH:
        locY += 1

    elif direction == WEST:
        locX -= 1

    elif direction == EAST:
        locX += 1

    elif direction == SOUTH:
        locY -= 1


# output
print("After %d intersections," % tries)
print("the ending locations for the drunk is")
print("(%d, %d)" % (locX, locY))

