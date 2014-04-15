# Write list functions that carry out the following tasks for a list of integers. For each
# function, provide a test program.
#     b.	 Shift all elements by one to the right and move the last element into the first
# position. For example, 1 4 9 16 25 would be transformed into 25 1 4 9 16

# FUNCTIONS
def shift(list):
    replace = 1
    for i in range(len(list)):
        tempSwap = list[i]
        list[i] = list[i - replace]
        list[i - replace] = tempSwap
        replace += 1


# main
def main():
    exampleList = [ 1, 4, 9, 16, 25 ]

    shift(exampleList)

    print(exampleList)

# PROGRAM RUN
main()