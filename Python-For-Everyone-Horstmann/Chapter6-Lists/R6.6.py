# Write Python code for a loop that simultaneously computes both the maximum and
# minimum of a list.


NUMBERS = [ 15, 11, 3, 6, 1, 2, 7, -5, 0, 17 ]

minList = NUMBERS[0]
maxList = NUMBERS[0]

lenList = len(NUMBERS)

for i in range(lenList):
    if NUMBERS[i] < minList:
        minList = NUMBERS[i]

    if NUMBERS[i] > maxList:
        maxList = NUMBERS[i]


print("Max value:", maxList)
print("Min value:", minList)