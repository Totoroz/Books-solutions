# Write programs that read a sequence of integer inputs and print
#    a.  The smallest and largest of the inputs.
#    b.  The number of even and odd inputs.
#    c.  Cumulative totals. For example, if the input is 1 7 2 9, the program should print
#    1 8 10 19.
#    d.  All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the
#    program should print 3 5 6.

stop = False
sum = 0

print("Enter a series of number(Stop/stop to stop)")

while not stop:
    inputN = str(input("Input: "))

    if inputN == "stop" or inputN == "Stop":
        stop = True

    elif inputN.isdigit():
        inputN = int(inputN)
        sum += inputN
        print("Output:", sum)