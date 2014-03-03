# Write a program that checks the spelling of all words in a file.
# It should read each word of a file and check whether it is contained 
# in a word list. A word list is avail­able on most Linux systems in 
# the file /usr/share/dict/words . (If you don’t have access to a Linux
# system, your instructor should be able to get you a copy.) The program
# should print out all words that it cannot find in the word list.

# IMPORTS
from sys import argv

# FUNCTIONS

# main
def main():
	filename = argv[1]
	file = open(filename, "r")
	fileDictionary = open("/usr/share/dict/words", "r")
	dictionaryContents = fileDictionary.read()
	wordsNotFound = ""

	for line in file:
		wordsList = line.split()
		for word in wordsList:
			if word not in dictionaryContents:
				wordsNotFound += word + " "
	print(wordsNotFound)

# PROGRAM RUN
if __name__ == "__main__":
    main()
