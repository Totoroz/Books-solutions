# Write a program that reads a word and prints each character of the word on a sepa-
# rate line. For example, if the user provides the input  "Harry" , the program prints
#     H
#     a
#     r
#     r
#     y

inputWord = str(input("Enter a word: "))

for i in range(len(inputWord)):
    print(inputWord[i])