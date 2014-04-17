# Calculates 2 of power argument number


# FUNCTIONS
def power2(number):
    if number <= 0:
        return 1
    lesser_number = power2(number - 1)
    return lesser_number * 2


# main
def main():
    print(power2(5))


# PROGRAM RUN
if __name__ == "__main__":
    main()
