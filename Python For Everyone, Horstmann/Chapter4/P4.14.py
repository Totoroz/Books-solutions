# Mean and standard deviation. Write a program that reads a set of floating-point data
# values. Choose an appropriate mechanism for prompting for the end of the data set.
# When all values have been read, print out the count of the values, the aver age, and
# the standard deviation.

# imports
from sys import exit
from math import sqrt

count = 0
sum = 0
sumSquares = 0

stop = False

while not stop:
    try:
        inputN = float(input("Value: "))

    except ValueError:
        stop = True
        break

    count += 1
    sum  += inputN
    sumSquares += inputN * inputN


if count <= 2:
    exit()

# calculate average
average = sum / count

# second term in the numerator
stdDevAvg = (sum * sum) / count
standDev = sqrt((sumSquares - stdDevAvg) / (count - 1))

print("There are %d value" % count )
print("The average is %f and the standard deviation is %f" % (average, standDev))