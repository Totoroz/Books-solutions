# Write a recursive function
#     def reverse(string)
# that computes the reverse of a string. For example,  reverse("flow") should return
# "wolf" . Hint: Reverse the substring starting at the second character, then add the first
# character at the end. For example, to reverse  "flow" , first reverse  "low" to  "wol" , then
# add the  "f" at the end.

# FUNCTIONS
def reverse(string):
    result = ""
    for i in range(len(string) - 1, 0, -1):
        result += string[i]
    result += string[0]
    return result

def main():
    string = str(input("Enter a string: "))
    print("Reversed:", reverse(string))

# PROGRAM RUN
main()

