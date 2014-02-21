# Write a loop that reads ten numbers and a second loop that displays them in the
# opposite order from which they were entered.


list = []

# input
print("Enter numbers. Type (S) to stop.")
userInput = ""

while userInput.upper() != "S":
    userInput = input()

    if userInput.isdigit():
        list.append(userInput)


# output
for element in list:
    print(element)