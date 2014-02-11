# Writing large letters. A large letter H can be produced like this:
# * *
# * *
# *****
# * *
# * *
# It can be declared as a string literal like this:
# LETTER_H = "* *\n* *\n*****\n* *\n* *\n"
# (The  \n escape sequence denotes a “newline” character that causes subsequent
# characters to be printed on a new line.) Do the same for the letters  E ,  L , and  O . Then
# write the message
# H
# E
# L
# L
# O
# in large letters.

LETTER_H = "*   *\n*   *\n*****\n*   *\n*   *\n"
LETTER_E = "*****\n*   \n***\n*\n*****\n"
LETTER_L = "*\n*\n*\n*\n*****\n\n"
LETTER_O = "  *\n * *\n*   *\n*   *\n * *\n  *\n"

print(LETTER_H)
print(LETTER_E)
print(LETTER_L * 2)
print(LETTER_O)
