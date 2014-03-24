# Write a program that reads in two files and prints out,
# in sorted order, all words that are common to both of them.


# IMPORTS
from pprint import pprint


# FUNCTIONS
def clean(string):
    output_string = ""
    for char in string:
        if char.isalpha():
            output_string += char
    return output_string.lower()


def file_contents_to_set(filename):
    output = set()
    opened_file = open(filename, "r")

    for line in opened_file:
        words = line.split()
        for word in words:
            word_cleaned = clean(word)
            if word_cleaned != "":
                output.add(word_cleaned)
    opened_file.close()
    return output


def common_words(set_a, set_b):
    return set_a.intersection(set_b)


# main
def main():
    file_a = str(input("Enter file a's filename: "))
    file_b = str(input("Enter file b's filename: "))

    set_a = file_contents_to_set(file_a)
    set_b = file_contents_to_set(file_b)

    pprint(common_words(set_a, set_b), indent=4)


# PROGRAM RUN
if __name__ == "__main__":
    main()
