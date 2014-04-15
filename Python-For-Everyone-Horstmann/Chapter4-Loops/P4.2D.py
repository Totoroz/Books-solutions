# Write programs that read a sequence of integer inputs and print
#    a.  The smallest and largest of the inputs.
#    b.  The number of even and odd inputs.
#    c.  Cumulative totals. For example, if the input is 1 7 2 9, the program should print
#    1 8 10 19.
#    d.  All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the
#    program should print 3 5 6.

stop = False

print("Enter a series of number(Stop/stop to stop): ")
inputN = 0
previous = int(input("Input: "))

while not stop:
    inputN = int(input("Input: "))

    if inputN == previous:
        print("Output:", previous)

    previous = inputN