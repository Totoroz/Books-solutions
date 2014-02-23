# In this assignment, you will model the game of Bulgarian Solitaire. The game starts
# with 45 cards. (They need not be playing cards. Unmarked index cards work just as
# well.) Randomly divide them into some number of piles of random size. For exam­
# ple, you might start with piles of size 20, 5, 1, 9, and 10. In each round, you take one
# card from each pile, forming a new pile with these cards. For example, the sample
# starting configuration would be transformed into piles of size 19, 4, 8, 9, and 5. The
# solitaire is over when the piles have size 1, 2, 3, 4, 5, 6, 7, 8, and 9, in some order. (It
# can be shown that you always end up with such a configuration.)
# In your program, produce a random starting configuration and print it. Then keep
# applying the soli­taire step and print the result. Stop when the solitaire final configu-
# ration is reached.

# IMPORTS
from random import randint

# FUNCTIONS
def createPile():
    numCards = 45
    piles = []

    while numCards > 0:
        randN = randint(1, numCards)
        numCards -= randN
        piles.append(randN)

    print("The initial piles are", piles)

    return piles

def removeZeros(list):
    copyList = []

    for i in range(len(list)):
        if list[i] != 0:
            copyList.append(list[i])

    list = copyList
    return list

def nextRound(list):
    numCards = len(list)

    for i in range(len(list)):
        list[i] -= 1

    removeZeros(list)
    list.append(numCards)

    return list

def finalConfig(list):
    if len(list) != 9:
        return False

    dupes = False
    for i in range(len(list)):
        for j in range(1, len(list)):
            if list[i] == list[j]:
                dupes == True

    if dupes == True:
        return False

    else:
        return True

# main
def main():
    piles = []
    piles = createPile()

    while finalConfig(piles) == False:
        nextRound(piles)
        print(piles)


# PROGRAM RUN
main()