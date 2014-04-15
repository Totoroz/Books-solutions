# Write a function
#     def countWords(string)
# that returns a count of all words in the string  string . Words are separated by spaces.
# For example,  count Words("Mary had a little lamb") should return 5.

# FUNCTIONS
def countWords(string):
    numWords = 1
    for i in range(len(string)):
        if string[i] == " ":
            numWords += 1

    return numWords

def main():
    string = str(input("Enter a string: "))

    print("Words:", countWords(string))

# PROGRAM RUN
main()

