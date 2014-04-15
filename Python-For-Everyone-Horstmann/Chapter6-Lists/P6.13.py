# Write a function
#     def sameElements(a, b)
# that checks whether two lists have the same elements in some order, with the same
# multiplicities. For example,
#             1  4  9  16  9  7  4  9  11
#     and
#             11  1  4  9  16  9  7  4  9
#
#     would be considered identical, but
#
#             1  4  9  16  9  7  4  9  11
#     and
#             11  11  7  9  16  4  1  4  9
#
# would not. You will probably need one or more helper functions.

# FUNCTIONS
def sameSet(listA, listB):
    removeDuplicates(listA)
    removeDuplicates(listB)

    lenList = max(len(listA), len(listB))

    equalBool = False
    for i in range(lenList):
        try:
            if listA[i] in listB:
                equalBool = True

            else:
                return False


        except IndexError:
            print("end of list")
            break


    return equalBool

def removeDuplicates(list):
    for element in list:
        if list.count(element) > 1:
            list.remove(element)

    return list

# main
def main():
    exampleListA = [ 1, 4, 9, 16, 9, 7, 4, 9, 11 ]
    exampleListB = [ 11, 11, 4, 9, 16, 9, 7, 4, 9 ]
    print("List A", exampleListA)
    print("List B", exampleListB)

    print("Expected False")
    print("Are they identical:", sameSet(exampleListA, exampleListB))

    exampleListB = [ 11, 1, 4, 9, 16, 9, 7, 4, 9 ]
    print("Expected True")
    print("Are they identical:", sameSet(exampleListA, exampleListB))

# PROGRAM RUN
main()
