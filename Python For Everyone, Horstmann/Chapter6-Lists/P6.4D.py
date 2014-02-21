# Write list functions that carry out the following tasks for a list of integers. For each
# function, provide a test program.
#     d.	 Replace each element except the first and last by the larger of its two neighbors.

# FUNCTIONS
def replaceList_exceptFirstLast(list):
    for i in range(1, len(list) - 1):
        larger = list[i - 1]
        if larger < list[i + 1]:
            larger = list[i + 1]

        list[i] = larger

    return list

# main
def main():
    exampleList = [ 5, 10, 15, 20, 31, -5, 1, 2 ]
    print("List before")
    print(exampleList)

    replaceList_exceptFirstLast(exampleList)
    print("List after replacing")
    print(exampleList)

# PROGRAM RUN
main()