# Write programs with loops that compute
#     a.  The sum of all even numbers between 2 and 100 (inclusive).
#     b.  The sum of all squares between 1 and 100 (inclusive).
#     c.  All powers of 2 from 2 0 up to 2 20 .
#     d.  The sum of all odd numbers between  a and  b (inclusive), where  a and  b are
#     inputs.
#     e.  The sum of all odd digits of an input. (For example, if the input is 32677, the
#     sum would be 3 + 7 + 7 = 17.)

sum = 0.0

a = int(input("Enter a: "))
b = int(input("Enter b:"))

for i in range(a, b):
    sum += i

print(sum)