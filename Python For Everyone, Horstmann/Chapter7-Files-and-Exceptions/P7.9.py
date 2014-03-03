# Write a program that reads each line in a file, reverses its lines, 
# and writes them to another file. For example, if the file input.txt 
# contains the lines

# 	Mary had a little lamb
# 	Its fleece was white as snow
# 	And everywhere that Mary went
# 	The lamb was sure to go.

# and you run 
# 	reverse input.txt output.txt

# then output.txt contains
# 	The lamb was sure to go.
# 	And everywhere that Mary went
# 	Its fleece was white as snow
# 	Mary had a little lamb


# IMPORTS
from sys import argv, exit

# FUNCTIONS

# main
def main():
	command = argv[1]
	filenameToRead = argv[2]
	filenameToWrite = argv[3]

	if command == "reverse":
		fileRead = open(filenameToRead, "r")
		fileWrite = open(filenameToWrite, "w")
		for line in reversed(list(fileRead)):
			fileWrite.write(line)

		fileRead.close()
		fileWrite.close()

	else:
		exit("Unknown command or number of argumnets")
    
# PROGRAM RUN
if __name__ == "__main__":
    main()
