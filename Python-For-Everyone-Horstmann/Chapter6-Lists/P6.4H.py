# Write list functions that carry out the following tasks for a list of integers. For each
# function, provide a test program.
#     h.	 Return true if the list is currently sorted in increasing order.

# FUNCTIONS
def is_sorted(list):
    sortedBool = False


    for i in range(0, len(list) - 1):
        if list[i] < list[i + 1]:
            sortedBool = True

        else:
            return False

    return sortedBool

# main
def main():
    exampleListUnSorted = [ 5, 6, 1, 7 ]
    exampleListSorted = [ 1, 2, 3, 4 ]

    print("Unsorted list", exampleListUnSorted)
    print("Sorted list", exampleListSorted)

    print("Test unsorted: ", is_sorted(exampleListUnSorted))
    print("Test sorted: ", is_sorted(exampleListSorted))

# PROGRAM RUN
main()