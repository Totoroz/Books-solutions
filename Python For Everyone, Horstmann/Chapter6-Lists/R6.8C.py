# Write for loops that iterate over the elements of a list without the use of the range
# function for the following tasks.
#     c.	 Counting how many elements in a list are negative.

list = [ -5, 10, 15, -20, -2, 0, -8, 94 ]

numNegativeElements = 0

for item in list:
    if item < 0:
        numNegativeElements += 1

print("Number of negative elements:", numNegativeElements)