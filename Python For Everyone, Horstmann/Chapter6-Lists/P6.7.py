# Write a function removeMin that removes the minimum value from a list without using
# the min function or remove method.

# FUNCTIONS
def removeMin(list):
    minElement = list[0]
    minElement_position = 0

    # find min element
    for i in range(len(list)):
        if list[i] < minElement:
            minElement = list[i]
            minElement_position = i

    # replace and re-arrange the elements
    for i in range(minElement_position, len(list) - 1):
        list[i] = list[i + 1]

    return list

# main
def main():
    exampleList = [ 6, 5, 2, 1, 5, 7 ]
    print("List", exampleList)

    print("List without min element")
    print(removeMin(exampleList))

# PROGRAM RUN
main()