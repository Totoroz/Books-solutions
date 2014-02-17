# Write the following functions.
#     a.  def firstDigit(n) (returning the first digit of the argument)
#     b.  def lastDigit(n) (returning the last digit of the argument)
#     c.  def digits(n) (returning the number of digits of the argument)
# For example,  firstDigit(1729) is 1,  lastDigit(1729) is 9, and  digits(1729) is 4. Provide a
# program that tests your functions.

# FUNCTIONS
def digits(n):
    numDigits = 1
    while n >= 10:
        numDigits += 1
        n /= 10

    return numDigits

def firstDigit(n):
    numDigits = digits(n)
    for i in range(numDigits - 1):
        n /= 10

    return int(n)

def lastDigit(n):
    return n % 10

def main():
    n = int(input("Enter n: "))

    print("First digit:", firstDigit(n))
    print("Last digit:", lastDigit(n))
    print("Total digits:", digits(n))

# PROGRAM RUN
main()

