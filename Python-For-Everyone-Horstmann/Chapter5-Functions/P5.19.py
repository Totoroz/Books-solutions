# Use recursion to compute a n , where n is a positive integer. Hint: If n is 1, then
# a n = a. If n is even, then a n = (a n/2 ) 2 . Otherwise, a n = a × a n–1 .

# FUNCTIONS
def exponent(number, exp):
    if number <= 1:
        return number

    elif number % 2 == 0:
        return exponent(number, exp // 2) ** 2

    else:
        return number * exponent(number, exp - 1)

# main
def main():
    inputN = int(input("Enter a number: "))
    inputE = int(input("Enter exponent: "))

    print("Result:", print(exponent(inputN, inputE)))

# PROGRAM RUN
main()