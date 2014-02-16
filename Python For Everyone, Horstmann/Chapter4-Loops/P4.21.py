# Write a program that reads an integer and displays, using asterisks, a filled and hol-
# low square, placed next to each other. For example if the side length is 5, the pro gram
# should display
#     *****   *****
#     *****   *   *
#     *****   *   *
#     *****   *   *
#     *****   *****

side = int(input("Enter side length: "))

lineNum =  1
dotNum = 1

for i in range(side):
    dotNum = 1

    # filled square
    for i in range(side):
        print("*", end = "")

    print(end=" ")

    # hollow square
    for i in range(side):
        if lineNum == 1 or lineNum == side:
            print("*", end = "")

        else:
            if dotNum == 1 or dotNum == side:
                print("*", end = "")

            else:
                print(" ", end = "")

        dotNum += 1

    lineNum += 1
    print()