# Use recursion to determine the number of digits in an integer  n . Hint: If  n is < 10, it
# has one digit. Otherwise, it has one more digit than  n // 10

# FUNCTIONS
def numDigits(number):
    if number < 10:
        return 1

    else:
        return 1 + numDigits(number // 10)

# main
def main():
    inputNumber = int(input("Enter a number: "))
    print("Digits:", numDigits(52))

# PROGRAM RUN
main()