# Write a program that reads a file containing text. Read each line and send it to the
# output file, preceded by line numbers. If the input file is
#     Mary had a little lamb
#     Whose fleece was white as snow.
#     And everywhere that Mary went,
#     The lamb was sure to go!

# then the program produces the output file
#     /* 1 */ Mary had a little lamb
#     /* 2 /* Whose fleece was white as snow.
#     /* 3 /* And everywhere that Mary went,
#     /* 4 /* The lamb was sure to go!

# Prompt the user for the input and output file names.

# FUNCTIONS

# main
def main():
    openFilename = str(input("File to open: "))
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
