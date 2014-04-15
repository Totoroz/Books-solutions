# Write a program that reads an integer and displays, using asterisks, a filled diamond
# of the given side length. For example, if the side length is 4, the program should
# dis play
#     *
#    ***
#   *****
#  *******
#   *****
#    ***
#     *

side = int(input("Enter side length: "))
maxWidth = int((side * 2) - 1)
halfWidth = int((maxWidth) / 2)

dotNum =1

# top half
for i in range(side):
    # spaces to line up triangle
    for j in range(halfWidth):
        print(end = " ")

    for j in range(dotNum):
        print("*", end = "")

    print()

    dotNum += 2
    halfWidth -= 1

# bot part
dotNum = maxWidth - 2
halfWidth = 1

for i in range(side):
    for j in range(halfWidth):
        print(end = " ")

    for j in range(dotNum):
        print("*", end = "")

    print()

    dotNum -= 2
    halfWidth += 1