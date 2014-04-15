# Write list functions that carry out the following tasks for a list of integers. For each
# function, provide a test program.
#     c.	 Replace all even elements with 0.

# FUNCTIONS
def replaceEven_with_Null(list):
    for i in range(len(list)):
        if list[i] % 2 == 0:
            list[i] = 0

    return list

# main
def main():
    exampleList = [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    replaceEven_with_Null(exampleList)
    print("Even numbers replaced with 0")
    print(exampleList)

# PROGRAM RUN
main()