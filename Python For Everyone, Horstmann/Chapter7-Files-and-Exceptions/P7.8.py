# Write a program that replaces each line of a file with its reverse.
# For example, if you run
# 	python reverse.py hello.py

# then the contents of hello.py are changed to 

# 	.margorp nohtyP tsrif yM #
# 	)"!dlroW ,olleH"(tnirp

# Of course, if you run Reverse twice on the same file, you get back the original file


# IMPORTS
from sys import argv

# FUNCTIONS

# main
def main():
	filename = argv[1]
	file = open(filename, "r")
	reversedFile = ""

	for line in file:
		reversedFile += line[::-1]

	file.close()
	file = open(filename, "w")
	file.write(reversedFile)
	file.close()
    
# PROGRAM RUN
if __name__ == "__main__":
    main()
