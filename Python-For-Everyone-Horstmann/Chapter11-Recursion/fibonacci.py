# Calculates recursively fibonacci


# FUNCTIONS
def fibonacci(number):
    if number <= 0:
        return 0
    if number == 1:
        return 1
    return fibonacci(number - 1) + fibonacci(number - 2)


# main
def main():
    print(fibonacci(5))


# PROGRAM RUN
if __name__ == "__main__":
    main()
