# DOCUMENTATION


# FUNCTIONS
def clean(string):
    output_string = ""
    for char in string:
        if char.isalpha():
            output_string += char
    return output_string.lower()


# main
def main():
    unique_words_set = set()
    filename = ""
    filename = str(input("File to open(default: nurseryrhyme.txt): "))

    if filename == "":
        filename = "nurseryrhyme.txt"
    try:
        document_file = open(filename, "r")
        for line in document_file:
            words = line.split()
            for word in words:
                word_cleaned = clean(word)
                if word_cleaned != "":
                    unique_words_set.add(word_cleaned)

        unique_words_count = len(unique_words_set)
        print("Number of unique words:", unique_words_count)
    except IOError:
        print("Error: File not found!")


# PROGRAM RUN
if __name__ == "__main__":
    main()
