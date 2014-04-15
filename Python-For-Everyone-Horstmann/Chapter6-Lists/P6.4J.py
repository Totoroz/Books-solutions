# Write list functions that carry out the following tasks for a list of integers. For each
# function, provide a test program.
#     i.	 Return true if the list contains two adjacent duplicate elements.
#     j.	 Return true if the list contains duplicate elements
#            (which need not be adjacent).

# FUNCTIONS
# reuse from P6.4-I
def twoAdjacent(list):
    for i in range(len(list) - 1):
        if list[i] == list[i + 1]:
            return True

    return False

def duplicates(list):
    boolTwoAdjacent = twoAdjacent(list)

    for i in range(len(list)):
        if list.count(list[i]) > 1 and boolTwoAdjacent == False:
            return True

    return False

# main
def main():
    exampleListFalse = [ 5, 7, 7, 1, 2, 3 ]
    exampleListTrue = [ 5, 6, 7, 1, 2, 7 ]

    print("List expected False:", exampleListFalse)
    print("List expected True:", exampleListTrue)

    print("Test expected False:", duplicates(exampleListFalse))
    print("Test expected True:", duplicates(exampleListTrue))

# PROGRAM RUN
main()