# Write a  while loop that prints
#     a.  All squares less than  n . For example, if  n is 100, print 0 1 4 9 16 25 36 49 64 81.
#     b.  All positive numbers that are divisible by 10 and less than  n . For example, if  n is
#     100, print 10 20 30 40 50 60 70 80 90
#     c.  All powers of two less than  n . For example, if  n is 100, print 1 2 4 8 16 32 64.

n = float(input("Enter a number(positive): "))

powers = 1.0
while powers < n:
    print(powers)
    powers *= 2