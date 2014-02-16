# Write a loop that computes
#     a.  The sum of all even numbers between 2 and 100 (inclusive).
#     b.  The sum of all squares between 1 and 100 (inclusive).
#     c.  The sum of all odd numbers between  a and  b (inclusive).
#     d.  The sum of all odd digits of  n . (For example, if  n is 32677, the sum would
#          be 3 + 7 + 7 = 17.)


sumOdd = 0.0

for i in range(1, 101, 2):
    sumOdd += i

print(sumOdd)