# Write a program that counts how often each word occurs in a text file.


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
    output_dictionary = {}
    with open(filename, "r") as file:
        for line in file:
            words = line.split()
            word_times = 1
            for word in words:
                word = clean(word)
                if word in output_dictionary:
                    word_times += 1
                output_dictionary[word] = word_times

    return output_dictionary


def print_dictionary(dictionary):
    for key in sorted(dictionary):
        print("{}: {}".format(key, dictionary[key]))


# main
def main():
    words = count_words(argv[1])
    print_dictionary(words)


# PROGRAM RUN
if __name__ == "__main__":
    main()
