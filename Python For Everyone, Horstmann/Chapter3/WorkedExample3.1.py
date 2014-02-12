# Your task is to extract a string containing the middle character from
# a given string. For example, if the string is  "crate" , the result is the string  "a" . However, if the
# string has an even number of letters, extract the middle two characters. If the string is  "crates" ,
# the result is  "at"

userInput = str(input("Enter a string: "))

position = len(userInput) // 2

if len(userInput) % 2 == 1 :
    result = userInput[position]
else:
    result = userInput[position - 1 ] + userInput[position]

print("The middle character(s) is/are:", result)