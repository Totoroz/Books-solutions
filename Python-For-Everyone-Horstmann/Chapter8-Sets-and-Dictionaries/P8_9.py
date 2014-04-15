# Write a program that asks a user to type in two strings and that prints
# •    the characters that occur in both strings.
# •    the characters that occur in one string but not the other.
# •    the letters that don’t occur in either string.
# Use the set function to turn a string into a set of characters.


# FUNCTIONS
def shared_characters(string_a, string_b):
    string_a = set(string_a)
    string_b = set(string_b)
    return ", ".join(sorted(string_a.intersection(string_b)))


def unique_characters(string_a, string_b):
    string_a = set(string_a)
    string_b = set(string_b)
    return ", ".join(sorted(string_a.difference(string_b).union(string_b.difference(string_a))))


def non_occurring_letters(string_a, string_b):
    alphabet = set("abcdefghijklomnopqrstuvwxyz")
    string_a = set(string_a)
    string_b = set(string_b)
    return ", ".join(sorted(alphabet - string_a.union(string_b)))


# main
def main():
    string_a = str(input("Enter the first string: "))
    string_b = str(input("Enter the second string: "))
    print("Shared characters:")
    print(shared_characters(string_a, string_b))
    print("Unique characters")
    print(unique_characters(string_a, string_b))
    print("Non-occuring alphabet letters:")
    print(non_occurring_letters(string_a, string_b))


# PROGRAM RUN
if __name__ == "__main__":
    main()
