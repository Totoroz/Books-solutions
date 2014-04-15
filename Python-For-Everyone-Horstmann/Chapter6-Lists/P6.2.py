# Write a program that reads numbers and adds them to a list if they aren’t already
# contained in the list. When the list contains ten numbers, the program displays the
# contents and quits.

# PROGRAM RUN

list = []

print("Enter numbers: ")
while len(list) < 11:
    try:
        inputN = float(input())
        if inputN not in list:
            list.append(inputN)

    except ValueError:
        print("Not a number")


print("List contents")
for element in list:
    print(element)