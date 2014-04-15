# Write a function
#     def mergeSorted(a, b)
# that merges two sorted lists, producing a new sorted list. Keep an index into each list,
# indicating how much of it has been processed already. Each time, append the small-
# est unprocessed element from either list, then advance the index. For example, if a is
#     1  4  9  16
# and b is
#     4  7  9  9  11
# then mergeSorted returns a new list containing the values
#     1  4  4  7  9  9  9  11  16

# FUNCTIONS
def mergeSorted(listA, listB):
    i, j, k = 0, 0, 0
    outputList = [ ]

    while i < len(listA) and j < len(listB):
        if listA[i] < listB[j]:
            outputList.append(listA[i])
            i += 1

        else:
            outputList.append(listB[j])
            j += 1

        k += 1

    if i < len(listA):
        while i < len(listA):
            outputList.append(listA[i])
            i += 1
            k += 1

    elif j < len(listB):
        while j < len(listB):
            outputList.append(listB[j])
            j += 1
            k += 1

    return outputList

# main
def main():
    exampleListA = [ 1, 4, 9, 16 ]
    exampleListB = [ 4, 7, 9, 9, 11 ]
    print(exampleListA)
    print(exampleListB)

    print("After merge sort")
    print(mergeSorted(exampleListA, exampleListB))

# PROGRAM RUN
main()