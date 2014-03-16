# DOCUMENTATION

# IMPORTS


# FUNCTIONS
def find_names(contacts_dictionary, number):
    output_list = []
    for name in contacts_dictionary:
        if contacts_dictionary[name] == number:
            output_list.append(name)
    return " ".join(output_list)


def print_contacts(contacts_dictionary):
    for name in sorted(contacts_dictionary):
        number = str(contacts_dictionary[name])
        number = "{}-{}".format(number[:3], number[3:])
        print("%-10s %s" % (name, number))


# main
def main():
    my_contacts = {"Fred": 7235591, "Mary": 3841212, "Bob": 3841212,
                   "Sarah": 2213278}

    if "Mary" in my_contacts:
        print("Mary:", my_contacts["Mary"])

    print(find_names(my_contacts, 3841212))
    print("All contacts:")
    print_contacts(my_contacts)

# PROGRAM RUN
if __name__ == "__main__":
    main()
