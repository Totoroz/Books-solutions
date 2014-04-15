# This program builds the index of a book from terms and page numbers.


# FUNCTIONS
def extract_records(file):
    for line in file:
        fields = line.split(":")
        page = int(fields[0])
        term = fields[1].rstrip()
        return (page, term)
    else:
        return ()


def add_words(entries_dictionary, term, page):
    if term in entries_dictionary:
        page_set = entries_dictionary[term]
        page_set.add(page)
    else:
        page_set = set([page])
        entries_dictionary[term] = page_set


def print_index(entries_dictionary):
    for key in sorted(entries_dictionary):
        print(key, end=' ')
        page_set = entries_dictionary[key]
        is_first = True
        for page in sorted(page_set):
            if is_first:
                print(page, end='')
                is_first = False
            else:
                print(",", page, end=' ')
        print()


# main
def main():
    index_entries = {}
    opened_file = open("indexdata.txt", "r")
    fields = extract_records(opened_file)

    while len(fields) > 0:
        add_words(index_entries, fields[1], fields[0])
        fields = extract_records(opened_file)
    opened_file.close()

    print_index(index_entries)


# PROGRAM RUN
if __name__ == "__main__":
    main()
