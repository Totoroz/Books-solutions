# Compute the alternating sum of all elements in a list. For example, if your pro­gram
#     reads the input
#     1  4  9  16  9  7  4  9  11
#
#     then it computes
#     1 – 4 + 9 – 16 + 9 – 7 + 4 – 9 + 11 = –2

# FUNCTIONS
def alternatingSum(list):
    outputSum = 0

    for i in range(len(list)):
        if i % 2 == 0:
            outputSum += list[i]

        else:
            outputSum -= list[i]

    return outputSum

# main
def main():
    exampleList = [ 1, 4, 9, 16, 9, 7, 4, 9, 11 ]
    print("List", exampleList)

    print("Alternating sum, expected -2:", alternatingSum(exampleList))

# PROGRAM RUN
main()