# Write list functions that carry out the following tasks for a list of integers. For each
# function, provide a test program.
#     a.	 Swap the first and last elements in the list.

# FUNCTIONS
def swapFirst_and_Last(list):
    # bubble sort
    temp = list[0]
    list[0] = list[-1]
    list[-1] = temp

    return temp

# main
def main():
    exampleList = [ 5, 6, 7, 4]
    print("Before the swap")
    print(exampleList)

    swapFirst_and_Last(exampleList)

    print("After the swap")
    print(exampleList)

# PROGRAM RUN
main()