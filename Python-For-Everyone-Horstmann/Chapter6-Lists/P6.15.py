# Write a program that marks only the longest run, like this:
#     1 2 5 5 3 1 2 4 3 (2 2 2 2) 3 6 5 5 6 3 1
# If there is more than one run of maximum length, mark the first one.

# IMPORTS
from random import randint

# FUNCTIONS
# main
def main():
    exampleList = [ ]
    for i in range(20):
        randN = randint(1, 6)
        exampleList.append(randN)

    max_count = 0
    max_start = 0
    run_count = 1
    run_start = 0

    inRun = False

    # find max run
    for i in range(20):
        if i != 19:
            if exampleList[i] == exampleList[i + 1]:
                run_count += 1
                if inRun == False:
                    inRun == True
                    run_start = i

            else:
                inRun = False
                if run_count > max_count:
                    max_count = run_count
                    max_start = run_start
                run_count = 1

    # print sequence
    for i in range(20):
        if i == max_start:
            print("(", exampleList[i], end = " ")

        elif i == max_start + max_count - 1:
            print(exampleList[i], ")", end = " ")

        else:
            print(exampleList[i], end = " ")

# PROGRAM RUN
main()