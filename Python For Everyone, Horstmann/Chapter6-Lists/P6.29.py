# Write a function
#     def merge(a, b)
# that merges two lists, alternating elements from both lists. If one list is shorter than
# the other, then alternate as long as you can and then append the remaining elements
# from the longer list. For example, if a is
#     1  4  9  16
# and b is
#     9  7  4  9  11
# then merge returns a new list containing the values
#     1  9  4  7  9  4  16  9  11

# FUNCTIONS
def merge(listA, listB):
    outputList = []

    i, j, k = 0, 0, 0
    lenLists = len(listA) + len(listB) - 1
    while k < lenLists:
        outputList.append(listA[i])
        outputList.append(listB[j])
        i += 1
        j += 1
        k += 2

    if i < len(listA):
        while i < len(listA):
            outputList.append(listA[i])
            i += 1

    elif j < len(listB):
        while j < len(listB):
            outputList.append(listB[j])
            j += 1

    return outputList


# main
def main():
    exlistA = [ 1, 4, 9, 16 ]
    exlistB = [ 9, 7, 4, 9, 11 ]
    print(exlistA)
    print(exlistB)

    print("Merged")
    print(merge(exlistA, exlistB))

# PROGRAM RUN
main()