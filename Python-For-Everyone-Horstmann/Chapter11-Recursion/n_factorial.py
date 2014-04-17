# Recursive n factorial


# FUNCTIONS
def n_factorial(number):
    if number == 1:
        return 1

    return number * n_factorial(number - 1)
