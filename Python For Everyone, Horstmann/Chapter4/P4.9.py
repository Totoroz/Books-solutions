# Write a program that reads a word and prints the word in reverse. For example, if the
# user provides the input  "Harry" , the program prints
#     yrraH

inputWord = str(input("Enter a word: "))

for i in range(len(inputWord) - 1, -1, -1):
    print(inputWord[i], end = "")