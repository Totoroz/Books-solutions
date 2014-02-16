# Write a program that prompts the user to provide a single character from the alpha­
# bet. Print Vowel or Consonant, depending on the user input. If the user input is
# not a letter (between a and z or A and Z), or is a string of length > 1, print an error
# message.

from sys import exit

character = str(input("Enter a character: "))

if len(character) == 1 and character.isalpha():
    if character == 'a' or character == 'A' or character == 'e' or character == 'E' or character == 'i'\
    or character == 'I' or character == 'o' or character == 'O' or character == 'u' or character == 'U':
        print("The character is a vowel.")

    else:
        print("The character is a consonant")

else:
    exit("Invalid input. Not a character or more than 1 character.")