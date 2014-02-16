# Write a program that reads a word and prints all substrings, sorted by length. For
# example, if the user provides the input  "rum" , the program prints
#     r
#     u
#     m
#     ru
#     um
#     rum

word = str(input("Enter a word: "))

wordLen = len(word)
subLen = 1
start = 0

for i in range(wordLen):
    start = 0
    while start + subLen <= wordLen:
        print(word[start:start+subLen])
        start += 1
    subLen += 1