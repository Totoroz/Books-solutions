# Leap years. Write a function
#     def isLeapYear(year)
# that tests whether a year is a leap year: that is, a year with 366 days. Exercise P3.27
# describes how to test whether a year is a leap year. In this exercise, use multiple  if
# statements and  return statements to return the result as soon as you know it.

# FUNCTIONS
def isLeapYear(year):
    if (year % 100 != 0 and year % 4 == 0) or year % 400 == 0:
        return True

    else:
        return False

# main
def main():
    inputYear = int(input("Enter a year: "))
    print("Is it a leap year:", isLeapYear(inputYear))

# PROGRAM RUN
main()