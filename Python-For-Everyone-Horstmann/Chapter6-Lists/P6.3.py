# Write a program that adds all numbers from 2 to 10,000 to a list.
# Then remove the multiples of 2 (but not 2), multiples of 3 (but not 3),
# and so on, up to the multiples of 100. Print the remaining values.

# FUNCTIONS
def fillList(list):
    for i in range(2, 10001):
        list.append(i)

    return list

def removeMultiples(list):
    # for i in range(len(list) - 1, -1, -1):
    #     number = list[i]
    #     pop = False
    #     for j in range(100, 1, -1):
    #         if number != j:
    #             pop = True
    #             break
    #
    #     if pop == True:
    #         list.remove(number)

    for i in range(10000, 1, -1):
        remove = False
        for j in range(100, 1, -1):
            if i != j and i % j == 0:
                remove = True
        if remove == True:
            list.remove(i)

    return list

# main
def main():
    exampleList = []
    exampleList = fillList(exampleList)

    print("Before")
    print(exampleList)

    print("After")
    print(removeMultiples(exampleList))

# PROGRAM RUN
main()