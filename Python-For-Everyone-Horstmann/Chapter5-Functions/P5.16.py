# Write a recursive function
#     def isPalindrome(string)
# that returns  True if  string is a palindrome, that is, a word that is the same when
# reversed. Examples of palin dromes are “deed”, “rotor”, or “aibohphobia”. Hint: A
# word is a palindrome if the first and last letters match and the remainder is also a
# palindrome.

# FUNCTIONS
def isPalindrome(string):
    if len(string) <= 1:
        return

    firstLetter = string[0]
    lastLetter = string[-1]

    if firstLetter == lastLetter:
        end = len(string) - 2 + 1
        return isPalindrome(string[1:end])

    else:
        return False

def main():
    string = str(input("Enter a string: "))
    print(string, "is", end = " ")

    if isPalindrome(string) == False:
        print("not", end = " ")

    print("a palindrome")

# PROGRAM RUN
main()