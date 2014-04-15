# Write a function
# def appendList(a, b)
# that appends one list after another. For example, if a is
#          1  4  9  16
# and b is
#          9  7  4  9  11
# then append returns a new list containing the values
#         1  4  9  16  9  7  4  9  11

# FUNCTIONS
def appendList(listA, listB):
    for i in range(len(listB)):
        listA.append(listB[i])

    return listA

# main
def main():
    exampleA = [ 1, 4, 9, 16 ]
    exampleB = [ 9, 7, 4, 9, 11 ]
    print("List A", exampleA)
    print("List B", exampleB)

    print("Appended")
    print(appendList(exampleA, exampleB))

# PROGRAM RUN
main()