# Write a program that reads in a string and prints whether it
#     • contains only letters.
#     • contains only uppercase letters.
#     • contains only lowercase letters.
#     • contains only digits.
#     • contains only letters and digits.
#     • starts with an uppercase letter.
#     • ends with a period.

userInput = str(input("Enter a string: "))

if userInput.isalpha():
    print("Contains only letters.")

elif userInput.isupper():
    print("Contains only uppercase letters.")

elif userInput.islower():
    print("Contains only lowercase letters.")

elif userInput.isdigit():
    print("Contains only digits.")

elif userInput.isalnum():
    print("Contains only letters and digits.")

elif userInput[0].isupper():
    print("Contains an uppercase letter.")

elif userInput.endswith(","):
    print("Ends with a period")

else:
    print("No condition was met.")