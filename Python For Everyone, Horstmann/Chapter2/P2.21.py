# Easter Sunday is the first Sun day after the first full moon of spring. To compute
# the date, you can use this algorithm, invented by the mathe matician Carl Friedrich
# Gauss in 1800:
# 1.  Let  y be the year (such as 1800 or 2001).
# 2.  Divide  y by  19 and call the remainder  a . Ignore the quotient.
# 3.  Divide  y by  100 to get a quotient  b and a remainder  c .
# 4.  Divide  b by  4 to get a quotient  d and a remainder  e .
# 5.  Divide  8 * b + 13 by  25 to get a quotient  g . Ignore the remainder.
# 6.  Divide  19 * a + b - d - g + 15 by  30 to get a remainder  h . Ignore the quotient.
# 7.  Divide  c by  4 to get a quotient  j and a remainder  k .
# 8.  Divide  a + 11 * h by  319 to get a quotient  m . Ignore the remainder.
# 9.  Divide  2 * e + 2 * j - k - h + m + 32 by  7 to get a remainder  r . Ignore the
# quotient.
# 10.  Divide  h - m + r + 90 by  25 to get a quotient  n . Ignore the remainder.
# 11.  Divide  h - m + r + n + 19 by  32 to get a remainder  p . Ignore the quotient.
# Then Easter falls on day  p of month  n . For example, if  y is  2001 :
# a = 6  h = 18  n = 4
# b = 20, c = 1  j = 0, k = 1  p = 15
# d = 5, e = 0  m = 0
# g = 6  r = 6
# Therefore, in 2001, Easter Sun day fell on April 15. Write a program that prompts the
# user for a year and prints out the month and day of Easter Sunday.

# year input
y = int(input("Enter a year: "))

# 2.  Divide  y by  19 and call the remainder  a . Ignore the quotient.
a = y % 19
# 3.  Divide  y by  100 to get a quotient  b and a remainder  c .
b = y / 100
c = y % 100
# 4.  Divide  b by  4 to get a quotient  d and a remainder  e .
d = b / 4
e = b % 4
# 5.  Divide  8 * b + 13 by  25 to get a quotient  g . Ignore the remainder.
g = int((8 * b + 13) / 25)
# 6.  Divide  19 * a + b - d - g + 15 by  30 to get a remainder  h . Ignore the quotient.
h = int((19 * a + b - d - g + 15) % 30)
# 7.  Divide  c by  4 to get a quotient  j and a remainder  k.
j = c / 4
k = c % 4
# 8.  Divide  a + 11 * h by  319 to get a quotient  m . Ignore the remainder.
m = int((a + 11 * h) / 319)
# 9.  Divide  2 * e + 2 * j - k - h + m + 32 by  7 to get a remainder  r . Ignore the quotient.
r = int((2 * e + 2 * j - k - h + m + 32) % 7)
# 10.  Divide  h - m + r + 90 by  25 to get a quotient  n . Ignore the remainder.
n = int((h - m + r + 90) / 25)
# 11.  Divide  h - m + r + n + 19 by  32 to get a remainder  p . Ignore the quotient.
p = int((h - m + r + n + 19) % 32)


print("Easter falls %d.%d.%dy" % (n, p, y))