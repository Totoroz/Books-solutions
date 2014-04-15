# Translate the following pseudocode for randomly permuting the characters in a
# string into a Python program.
#     Read a word.
#     Repeat len(word) times
#         Pick a random position i in the word, but not the last position.
#         Pick a random position j > i in the word.
#         Swap the letters at positions j and i.
#     Print the word.
# To swap the letters, construct substrings as follows:
# first middle last i j
# Then replace the string with
# first + word[j] + middle + word[i] + last

from random import random

inputWord = str(input("Enter a word: "))

first = ""
middle = ""
last = ""

wordLen = len(inputWord)

for i in range(wordLen):
    a = int(random() % wordLen)
    b = int((a + 1) + random() % (wordLen - (a + 1) + 1))

    if a == 0:
        first = ""

    else:
        first = inputWord[:a]

    if a == b - 1:
        middle = ""

    else:
        start = a + 1
        end = b - start + start
        middle = inputWord[start:end]

    if b == wordLen:
        last = ""

    else:
        start = b + 1
        end = wordLen - b - 1 + start
        last = inputWord[start:end]

    inputWord = first +  inputWord[b:b+1] + middle + inputWord[a:a+1] + last


print(inputWord)