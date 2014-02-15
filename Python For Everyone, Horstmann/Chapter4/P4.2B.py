# Write programs that read a sequence of integer inputs and print
#    a.  The smallest and largest of the inputs.
#    b.  The number of even and odd inputs.
#    c.  Cumulative totals. For example, if the input is 1 7 2 9, the program should print
#    1 8 10 19.
#    d.  All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the
#    program should print 3 5 6.

numEven = 0
numOdd = 0

stop = False

while not stop:
    inputN = str(input("Enter a number:(Stop/stop to stop): "))

    if inputN == "Stop" or inputN == "stop":
        stop = True

    elif inputN.isdigit():
        inputN = int(inputN)
        if inputN % 2 == 0:
            numEven += 1
        else:
            numOdd += 1

print("Number of even numbers:", numEven)
print("Number of odd numbers:", numOdd)