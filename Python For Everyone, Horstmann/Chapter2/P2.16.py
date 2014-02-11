# Write a program that reads a five-digit positive integer and breaks it into a sequence
# of individual digits. For example, the input 16384 is displayed as
# 1 6 3 8 4

userInput = str(int(input("Please enter a five-digit positive integer: ")))

print(userInput[0] + " " + userInput[1] + " " +  userInput[2] + " " +  userInput[3] + " " +  userInput[4])