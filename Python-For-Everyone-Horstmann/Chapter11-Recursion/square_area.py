# Calculates square area with given side length


# FUNCTIONS
def square_area(side_length):
    if side_length <= 0:
        return 0
    smaller_side_length = side_length - 1
    smaller_area = square_area(smaller_side_length)
    return smaller_area + side_length + smaller_side_length


# main
def main():
    print(square_area(1))


# PROGRAM RUN
if __name__ == "__main__":
    main()
