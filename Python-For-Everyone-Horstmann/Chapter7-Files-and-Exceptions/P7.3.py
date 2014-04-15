# Repeat Exercise P7.2, but allow the user to specify the file name on 
# the commandline. If the user doesn’t specify any file name, 
# then prompt the user for the name.

# IMPORTS
from sys import argv

# FUNCTIONS

# main
def main():
    openFilename = ""
    saveFilename = ""

    if argv[1] != "":
        openFilename = argv[1]
    else:
        openFilename = str(input("File to open: "))

    if argv[2] != "":
        saveFilename = argv[2]
    else:
        saveFilename = str(input("File to save into: "))

    readFile = open(openFilename, "r")
    writeFile = open(saveFilename, "w")

    lineNumber = 1
    for line in readFile:
        writeFile.write("/* %s */ %s" % (lineNumber, line))
        lineNumber += 1

    readFile.close()
    writeFile.close()

# PROGRAM RUN
if __name__ == "__main__":
    main()
