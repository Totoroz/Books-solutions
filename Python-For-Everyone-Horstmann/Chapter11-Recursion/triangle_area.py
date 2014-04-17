# Calculates triangle area with given side length


# FUNCTIONS
def triangle_area(side_length):
    if side_length <= 0:
        return 0
    smaller_side_length = side_length - 1
    smaller_area = triangle_area(smaller_side_length)
    return smaller_area + side_length


# main
def main():
    print(triangle_area(4))


# PROGRAM RUN
if __name__ == "__main__":
    main()
