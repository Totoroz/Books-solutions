# Improve the program of Exercise P6.23 to work correctly when the data set contains
# negative values.

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

def displayCharts(list):
    maxElement = max(list)

    for i in range(len(list)):
        if list[i] < 0:
            list[i] *= -1

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