# Write list functions that carry out the following tasks for a list of integers. For each
# function, provide a test program.
#     g.	 Return the second-largest element in the list.

# FUNCTIONS
def secondLargest(list):
    largestElement = max(list)

    # fixes cases where largest element appears multiple times
    while largestElement in list:
        list.remove(largestElement)

    return max(list)

# main
def main():
    exampleList = [ 10, 15, -5, 60, -84, 60, 60, 25 ]
    print("List")
    print(exampleList)

    print("Second largest:", secondLargest(exampleList))

# PROGRAM RUN
main()