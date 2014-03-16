# Write a program that reads a word and prints the number of vowels in the word. For
# this exercise, assume that  a e i o u y are vowels. For example, if the user pro vides the
# input  "Harry" , the program prints  2 vowels .

#  situations when Y is not a vowel are not handled.
inputWord = str(input("Enter a word: "))
vowels = ('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y')

numVowels = 0

for i in range(len(inputWord)):
    if inputWord[i] in vowels:
        numVowels += 1

print("%d vowels" % numVowels)
