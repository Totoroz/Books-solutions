# Write a function that implements the algorithm developed in Section 6.6.
# We need to swap all coins in the first half.
# That is, we need to swap length / 2 coins. The pseudocode is
#     i = 0
#     j = length / 2
#     While (i < length / 2)
#          Swap elements at positions i and j
#          i = i + 1
#          j = j + 1

# FUNCTION
def swap(list, i, j):
    list[i], list[j] = list[j], list[i]


# main
def main():
    exampleList = [ 10, 15, 23, 54, -7, 12, 1, 6 ]
    print("Before", exampleList)

    len_halfList = len(exampleList) // 2
    i = 0
    j = len_halfList

    while i < len_halfList:
        swap(exampleList, i, j)
        i += 1
        j += 1

    print("After", exampleList)


# PROGRAM RUN
main()