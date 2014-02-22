# A run is a sequence of adjacent repeated values. Write a program that prints the
# runs by including them in parentheses, like this:
#      1 2 (5 5) 3 1 2 4 3 (2 2 2 2) 3 6 (5 5) 6 3 1
#
# Use the following pseudocode:
#     Set a boolean variable inRun to false.
#     For each valid index i in the list
#          If inRun
#              If values[i] is different from the preceding value
#                  Print ).
#                  inRun = false.
#          If not inRun
#              If values[i] is the same as the following value
#                  Print (.
#                  inRun = true.
#          Print values[i].
#     If inRun, print ).

# FUNCTIONS
def run(list):
    inRun = False

    for i in range(len(list) - 1):
        if inRun == True:
            if list[i] != list[i - 1]:
                print(")", end = " ")
                inRun = False
        elif inRun == False:
            if list[i] == list[i + 1]:
                print("(", end = " ")
                inRun = True
        print(list[i], end = ", ")

    if inRun == True:
        print(") ", end = "")


# main
def main():
    exampleList = [ 1, 2, 5, 5, 3, 1, 2, 4, 3, 2, 2, 2, 2, 3, 6, 5, 5, 6, 3, 1 ]

    print("List, before", exampleList)

    print("List, after")
    print(run(exampleList))


# PROGRAM RUN
main()