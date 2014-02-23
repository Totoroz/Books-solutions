# Write a program that reads a sequence of input values and displays a bar chart of the
# values, using asterisks, like this:
# **********************
# ****************************************
# ****************************
# **************************
# **************
# You may assume that all values are positive. First figure out the maximum value.
# That value’s bar should be drawn with 40 asterisks. Shorter bars should use propor-
# tionally fewer asterisks.


# FUNCTIONS
def inputSequence(list):
    print("Enter positive numbers(-1 to stop): ")

    inputN = 0

    while inputN > -1:
        inputN = int(input())
        list.append(inputN)

    return list

def displayCharts(list):
    maxElement = max(list)

    for i in range(len(list)):
        times = int((list[i] / maxElement) * 40)
        print("*" * times)

# main
def main():
    inputList = []
    inputList = inputSequence(inputList)
    print("List", inputList)

    print("\nBars")
    displayCharts(inputList)

# PROGRAM RUN
main()