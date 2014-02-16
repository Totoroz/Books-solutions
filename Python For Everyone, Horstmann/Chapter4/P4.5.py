# Write a program that reads a set of floating-point values. Ask the user to enter the
# values, then print
#     • the average of the values.
#     • the smallest of the values.
#     • the largest of the values.
#     • the range, that is the difference between the smallest and largest.

inputN = float(input("Enter a number(0 to stop): "))
total = 0
count = 0
min = inputN
max = inputN

while inputN != 0.0:
    total += inputN
    count += 1

    if inputN < min:
        min = inputN

    if inputN > max:
        max = inputN

    inputN = float(input("Enter a number(0 to stop): "))


if count == 0:
    print("No numbers entered")

else:
    average = total / count
    print("Average", average)
    print("Smallest:", min)
    print("Biggest:", max)
    range = max - min
    print("Range between smallest and biggest:", range)