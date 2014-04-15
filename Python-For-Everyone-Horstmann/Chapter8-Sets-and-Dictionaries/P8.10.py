# Write a program that reads in two files and prints out, in sorted order,
# all words that are common to both of them.


# IMPORTS
from sys import argv


# FUNCTIONS
def clean(string):
    output_string = ""
    for char in string:
        if char.isalpha():
            output_string += char
    return output_string.lower()


def count_words(filename):
    output_set = set()
    with open(filename, "r") as file:
        for line in file:
            words = line.split()
            for word in words:
                word = clean(word)
                output_set.add(word)
    return output_set


def common_words(set_a, set_b):
    return set_a.intersection(set_b)


def print_common_words(common_words_set):
    i = 1
    for element in sorted(common_words_set):
        print("{} - {}".format(i, element))
        i += 1


# main
def main():
    file_a = count_words(argv[1])
    file_b = count_words(argv[2])
    print_common_words(common_words(file_a, file_b))


# PROGRAM RUN
if __name__ == "__main__":
    main()
