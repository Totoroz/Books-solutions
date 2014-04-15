# Write a function sumWithoutSmallest that computes the sum of a list of values, except
# for the smallest one, in a single loop. In the loop, update the sum and the smallest
# value. After the loop, return the difference.

# FUNCTIONS
def sum_without_smallest(list):
    sumOutput = 0
    smallest = min(list)
    for element in list:
        sumOutput += element

    sumOutput -= smallest
    return sumOutput

# main
def main():
    exampleList = [ 1, 2, 3, 4, 5, 6, 7, 8, 9 ]
    print("List", exampleList)
    # unneeded but makes it easier to check the output
    print("Smallest:", min(exampleList))
    print("Sum w/ smallest:", sum(exampleList))
    print("Sum w/o  smallest:", sum_without_smallest(exampleList))

# PROGRAM RUN
main()