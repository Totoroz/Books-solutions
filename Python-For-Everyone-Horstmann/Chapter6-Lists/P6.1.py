# Write a program that initializes a list with ten random integers
#  and then prints four
# lines of output, containing
# •	 Every element at an even index.
# •	 Every even element.
# •	 All elements in reverse order.
# •	 Only the first and last element.

# IMPORTS
from random import randint

# PROGRAM RUN
list = []
for i in range(10):
    randomN = randint(-99, 99)
    list.append(randomN)


print("Elements at an even index")
for i in range(0, len(list), 2):
    print(list[i])

print("Every even element")
for element in list:
    if element % 2 == 0:
        print(element)

print("All elements in reversed order")
for i in range(len(list) - 1, -1, -1):
    print(list[i])

print("Only the first and last element")
print(list[0], list[-1])
