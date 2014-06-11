# Write a program that asks the user for a file name and
# prints the number of charac­ters, words, and lines in that file.

# FUNCTIONS

# main
def main():
    filename = str(input("File to open: "))
    file = open(filename, "r")
    numCharacters = 0
    numWords = 0
    numLines = 0

    for line in file:
        numCharacters += len(line.strip())
        numWords += len(line.split(" "))
        numLines += 1
    file.close()
    print("Num characters:", numCharacters)
    print("Num words:", numWords)
    print("Num lines:", numLines)

# PROGRAM RUN
if __name__ == "__main__":
    main()
