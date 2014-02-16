# Write a program that reads a word and prints the number of syllables in the word.
# For this exercise, assume that syllables are determined as follows: Each sequence of
# adjacent vowels  a e i o u y , except for the last  e in a word, is a syllable. However, if
# that algorithm yields a count of 0, change it to 1. For example,
#     Word Syllables
#     Harry 2
#     hairy 2
#     hare 1
#     the  1

inputWord = str(input("Enter a word: "))
vowels = ('a','e','i','o','u','y','A','E','I','O','U','Y')

lastVowel = False
lastCons = False
currVowel = False
currCons = False

syllablesCount = 0

for i in range(len(inputWord)):
    letter = inputWord[i]

    if letter in vowels:
        currVowel = True
        currCons = False

    else:
        currVowel = False
        currCons = True

    if currCons == True and lastVowel == True:
        syllablesCount += 1

    lastVowel = currVowel
    lastCons = currCons

lastStart = len(inputWord) - 1
lastEnd = len(inputWord)
last = inputWord[lastStart:lastEnd]

if last == "a" or last == "i" or last == "o"  or last == "u" or last == "y" or last == "A" or last == "I" or last == "O" or last == "U" or last == "Y":
    syllablesCount += 1

if syllablesCount == 0:
    syllablesCount = 1

print("There are %d syllables" % syllablesCount)