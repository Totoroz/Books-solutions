# DOCUMENTATION

# IMPORTS
from os.path import join
from re import split


# FUNCTIONS
def read_words(filename):
    word_set = set()
    input_file = open(filename, "r")

    for line in input_file:
        line = line.strip()
        parts = split("[^a-zA-Z]+", line)
        for word in parts:
            if len(word) > 0:
                word_set.add(word.lower())
    return word_set


def misspelled_words(dictionary, document_words):
    misspelled_words = document_words.difference(dictionary)
    return "\n".join(misspelled_words)


# main
def main():
    dictionary_name = str(input("Enter dictionary to load(american-english or british-english): "))
    dictionary = read_words(join("/usr/share/dict/", dictionary_name))

    document_filename = str(input("Enter file to open for spell checking: "))
    document_words = read_words(document_filename)
    print(misspelled_words(dictionary, document_words))


# PROGRAM RUN
if __name__ == "__main__":
    main()
