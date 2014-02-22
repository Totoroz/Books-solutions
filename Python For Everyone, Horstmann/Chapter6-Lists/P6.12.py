# Write a function
#     def sameSet(a, b)
#
# that checks whether two lists have the same elements in some order, ignoring
# duplicates. For example, the two lists
#         1  4  9  16  9  7  4  9  11
#     and
#         11  11  7  9  16  4  1
#
# would be considered identical. You will probably need one or more helper
# functions.

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
    exampleListB = [ 11, 11, 7, 9, 16, 4, 1, 11, 7, 9 ]
    print("List A", exampleListA)
    print("List B", exampleListB)

    print("Are they identical:", sameSet(exampleListA, exampleListB))

# PROGRAM RUN
main()