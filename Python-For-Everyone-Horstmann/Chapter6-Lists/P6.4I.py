# Write list functions that carry out the following tasks for a list of integers. For each
# function, provide a test program.
#     i.	 Return true if the list contains two adjacent duplicate elements.

# FUNCTIONS
def twoAdjacent(list):
    for i in range(len(list) - 1):
        if list[i] == list[i + 1]:
            return True

    return False

# main
def main():
    exampleListTrue = [ 5, 7, 7, 1, 2, 3 ]
    exampleListFalse = [ 5, 6, 7, 1, 2, 3]
    print("List, expected True", exampleListTrue)
    print("List, expected False", exampleListFalse)

    print("2 adjacent duplicates list True:", twoAdjacent(exampleListTrue))
    print("2 adjacent duplicates list False:", twoAdjacent(exampleListFalse))

# PROGRAM RUN
main()