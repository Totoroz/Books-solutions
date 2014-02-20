# Write a loop that fills a list values with ten random numbers between 1 and 100.
# Write code for two nested loops that fill values with ten different random numbers
# between 1 and 100.

# IMPORTS
from random import randint

list = []

while len(list) < 11:
    randN = randint(1,101)

    if randN not in list:
        list.append(randN)


print(list)
