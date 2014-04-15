# Write programs that read a line of input as a string and print
#     a.  Only the uppercase letters in the string.
#     b.  Every second letter of the string.
#     c.  The string, with all vowels replaced by an underscore.
#     d.  The number of digits in the string.
#     e.  The positions of all vowels in the string.

inputString = str(input("Enter a string: "))
result = ""

for i in range(0, len(inputString), 2):
    result += inputString[i]

print(result)