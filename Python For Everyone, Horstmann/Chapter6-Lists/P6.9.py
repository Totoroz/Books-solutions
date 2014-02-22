# Write a function that reverses the sequence of elements in a list. For example, if you
#     call the function with the list
#     1  4  9  16  9  7  4  9  11
#     then the list is changed to
#     11  9  4  7  9  16  9  4  1

# FUNCTIONS
def reverse(list):
    # http://stackoverflow.com/a/3705676
    return list[::-1]

# main
def main():
    exampleList = [ 1, 4, 9, 16, 9, 7, 4, 9, 11 ]
    print("List", exampleList)
    print("Reversed", reverse(exampleList))

# PROGRAM RUN
main()