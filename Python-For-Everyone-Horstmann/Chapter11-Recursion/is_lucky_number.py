# Find if number is lucky


# FUNCTIONS
def is_lucky(number):
    if number < 8:
        return False

    last_digit = number % 10
    if last_digit == 8:
        return True
    return is_lucky(number // 10)


# main
def main():
    print(is_lucky(8))


# PROGRAM RUN
if __name__ == '__main__':
    main()
