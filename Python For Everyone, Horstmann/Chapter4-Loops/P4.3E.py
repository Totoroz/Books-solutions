# Write programs that read a line of input as a string and print
#     a.  Only the uppercase letters in the string.
#     b.  Every second letter of the string.
#     c.  The string, with all vowels replaced by an underscore.
#     d.  The number of digits in the string.
#     e.  The positions of all vowels in the string.

inputString = str(input("Enter a string: "))
positions = ""
# saving time writing long statements
vowels = ('a','e','i','o','u','A','E','I','O','U')

for i in range(len(inputString)):
    if inputString[i] in vowels:
            positions += str(i) + "-"


# fix for the last dash in the positions string
positions = positions[:-1]
print(positions)