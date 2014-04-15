# Write list functions that carry out the following tasks for a list of integers. For each
# function, provide a test program.
#     f.	 Move all even elements to the front, otherwise preserving the order of the
#     elements.

# FUNCTIONS
def moveEvenToFront(list):
    start = 0
    for i in range(len(list)):
        if list[i] % 2 == 0:
            # more efficient way without using a temp variable
            list[start], list[i] = list[i], list[start]
            start += 1

    return list
# main
def main():
    exampleList = [ 5, 10, 12, -5, -3, 8, 17 ]

    print("Before")
    print(exampleList)

    print("After moving even at front")
    moveEvenToFront(exampleList)
    print(exampleList)

# PROGRAM RUN
main()