# Write a program that produces ten random permutations of the numbers 1 to 10. To
# generate a random permutation, you need to fill a list with the numbers 1 to 10 so
# that no two entries of the list have the same contents. You could do it by brute force,
# by generating random values until you have a value that is not yet in the list. But that
# is inefficient. Instead, follow this algorithm.
#     Make a second list and fill it with the numbers 1 to 10.
#     Repeat 10 times
#          Pick a random element from the second list.
#          Remove it and append it to the permutation list.

# IMPORTS
from random import randint

# FUNCTIONS
def generateSecondList(list):
    for i in range(1, 11):
        list.append(i)

    return list

def generatePermutationList(permList, secList):
    for i in range(10):
        randN = randint(0, len(secList) - 1)
        randN = secList[randN]
        permList.append(randN)

    return permList

# main
def main():
    permutationList = []
    secondList = []
    secondList = generateSecondList(secondList)

    permutationList = generatePermutationList(permutationList, secondList)
    print(permutationList)
# PROGRAM RUN
main()