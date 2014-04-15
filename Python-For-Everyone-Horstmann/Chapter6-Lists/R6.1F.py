# Given the list values = [] , write code that fills the list with each set of numbers below.
# f.0   1   0   1   0   1   0   1   0   1

list = []

for i in range(11):
    if i % 2 == 0:
        list.append(1)

    else:
        list.append(0)

print(list)