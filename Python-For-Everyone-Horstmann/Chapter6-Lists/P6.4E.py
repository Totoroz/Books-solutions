# Write list functions that carry out the following tasks for a list of integers. For each
# function, provide a test program.
#     e.	 Remove the middle element if the list length is odd, or the middle two elements
#     if the length is even.

# FUNCTIONS
def removeMidElement(list):
    lenList = len(list)
    halfLen = lenList // 2

    if lenList % 2 == 0:
        list.pop(halfLen - 1)
        list.pop(halfLen)

    else:
        list.pop(halfLen)

    return list

# main
def main():
    exampleList = [ 5, 10, 20, 11, -2, -56, 1 ]
    print("Before")
    print(exampleList)

    print("After removing the middle element(s)")
    removeMidElement(exampleList)
    print(exampleList)

# PROGRAM RUN
main()