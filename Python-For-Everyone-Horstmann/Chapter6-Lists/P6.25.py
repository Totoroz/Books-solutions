# Improve the program of Exercise P6.23 by adding captions for each bar. Prompt the
# user for the captions and data values. The output should look like this:
# Egypt **********************
# France ****************************************
# Japan ****************************
# Uruguay **************************
# Switzerland **************

# FUNCTIONS
def inputSequence(list):
    print("Enter positive numbers(S to stop): ")

    inputN = ""

    while inputN != "S" and inputN != "s":
        try:
            inputN = int(input())
            list.append(inputN)
        except ValueError:
            break

    return list

def inputLabels(list):
    print("Enter labels(strings) (0 to stop): ")

    inputN = ""

    while inputN != "0":
        inputN = str(input())
        list.append(inputN)

    # clears the 0 from the list
    list.pop()
    return list

def displayCharts(list, labels):
    maxElement = max(list)


    longest = len(labels[0])
    for i in range(1, len(labels)):
        if len(labels[i]) > longest:
            longest = len(labels[i])

    for i in range(len(list)):
        if list[i] < 0:
            list[i] *= -1

        times = int((list[i] / maxElement) * 40)

        # align labels and bars
        for j in range(longest - len(labels[i])):
            print(end = " ")

        # print caption
        print(labels[i], end = " ")

        # print bar
        print("*" * times)

# main
def main():
    inputList = []
    inputList = inputSequence(inputList)
    labelsList = []
    labelsList = inputLabels(labelsList)
    print("List", inputList)
    print("Labels", labelsList)

    print("\nBars")
    displayCharts(inputList, labelsList)

# PROGRAM RUN
main()