# Given the list values = [] , write code that fills the list with each set of numbers below.
# c.1   4   9   16   25   36   49   64   81   100

list = []

for i in range(1, 11):
    list.append(i * i)

print(list)