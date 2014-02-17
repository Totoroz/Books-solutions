# Write a function
#     def middle(string)
# that returns a string containing the middle character in  string if the length of  string is
# odd, or the two middle characters if the length is even. For example,  middle("middle")
# returns  "dd"

# FUNCTIONS
def middle(string):
    result = ""
    posMiddle = int(len(string) / 2)
    if len(string) % 2 == 0:
        result = string[posMiddle - 1] + string[posMiddle]

    else:
        result = string[posMiddle]

    return result

def main():
    string = str(input("Enter a string: "))
    print("Middle:", middle(string))

# PROGRAM RUN
main()