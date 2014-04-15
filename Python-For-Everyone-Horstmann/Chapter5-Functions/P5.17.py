# Use recursion to implement a function  find(string, match) that tests whether  match is
# contained in  string :
#     b = find("Mississippi", "sip") #  Sets  b to  true
# Hint: If  string starts with  match , you are done. If not, consider the string that you
# obtain by removing the first character.

# FUNCTIONS
def find(string, match):
    if len(string) < len(match):
        return False

    if string[:len(string)] == match:
        return True

    end = int(1 + len(string) - 1)

    return find(string[1:end], match)

def main():
    inputString = str(input("Enter the string: "))
    inputMatch = str(input("Enter the string to find: "))

    print("Found?", find(inputString, inputMatch))

# PROGRAM RUN
main()