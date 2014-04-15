# Write a function def equals(a, b) that checks whether two lists have the same
# elements in the same order.

# FUNCTIONS
def equals(listA, listB):
    if len(listA) < len(listB) or len(listA) > len(listB):
        return False

    equalBool = False

    for i in range(len(listA)):
        if listA[i] == listB[i]:
            equalBool = True

        else:
            return False

    return equalBool

# main
def main():
    exampleListA = [ 10, 15, 20, 34, 5 ]
    exampleListB = [ 15, 23, 21, 15, 2 ]
    exampleListC = [ 15, 23, 21, 15, 2 ]
    print("The lists: A, B, C =>", exampleListA, exampleListB, exampleListC)
    print("Are A and B equal:", equals(exampleListA, exampleListB))
    print("Are A and C equal:", equals(exampleListA, exampleListC))
    print("Are B and C equal:", equals(exampleListB, exampleListC))


# PROGRAM RUN
main()