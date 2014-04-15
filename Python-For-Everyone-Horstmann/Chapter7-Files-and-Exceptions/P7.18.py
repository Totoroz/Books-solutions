# Write a program copyfile that copies one file to another. The file names are specified
# on the command line. For example,
#     copyfile report.txt report.sav

# IMPORTS
from sys import argv, exit

# FUNCTIONS

# main
def main():
    if len(argv) != 3:
        exit("Error: Invalid number of arguments")

    readFilename = argv[1]
    writeFilename = argv[2]

    readFile = open(readFilename, "r")
    writeFile = open(writeFilename, "w")

    for line in readFile:
        writeFile.write(line)

    readFile.close()
    writeFile.close()    
    
# PROGRAM RUN
if __name__ == "__main__":
    main()
