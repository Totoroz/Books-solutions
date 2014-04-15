# Write a program find.py that searches all files specified on 
# the command line and prints out all lines containing a specified word. 
# For example, if you call
# 	python find.py ring report.txt address.txt homework.py

# then the program might print
# 	report.txt: has broken up an international ring of DVD bootleggers that
# 	address.txt: Kris Kringle, North Pole
# 	address.txt: Homer Simpson, Springfield
# 	homework.py: string = "text"

# The specified word is always the first command line argument

# IMPORTS
from sys import argv

# FUNCTIONS

# main
def main():
	wordToFind = argv[1]

	for i in range(2, len(argv)):
		filename = argv[i]
		file = open(filename, "r")
		for line in file:
			if wordToFind in line:
				print("%s: %s" % (filename, line))

# PROGRAM RUN
if __name__ == '__main__':
	main()