# Write a program that initializes a string variable and prints the first three characters,
# followed by three periods, and then the last three characters. For example, if the
# string is initialized to ” Mississippi ”, then print  Mis...ppi.

userInput = str(input("Enter a string: "))

print(userInput[:3] + "..." + userInput[-3:])