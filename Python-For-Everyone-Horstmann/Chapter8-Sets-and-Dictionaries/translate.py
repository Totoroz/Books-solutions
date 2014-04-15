# Translating Text Messages
# Problem Statement  Instant messaging (IM) and texting on portable devices
# has resulted in a set of common abbreviations useful for brief messages.
# However, some individuals may not understand these abbreviations.
# Write a program that reads a one-line text message containing common
# abbreviations and translates the message into English using a set of translations
# stored in a file. For example, if the user enters the text message
# y r u l8?
# the program should print
# why are you late?


# FUNCTIONS
def file_to_dictionary(filename):
    dictionary = {}
    opened_file = open(filename, "r")
    for line in opened_file:
        pair = line.split(":")
        dictionary[pair[0]] = pair[1].rstrip()

    opened_file.close()
    return dictionary


def translate_abbreviation(dictionary, abbreviation):
    last_character = abbreviation[-1]
    if last_character in ".?!,;:":
        abbreviation = abbreviation.rstrip(last_character)
    else:
        last_character = ""

    # translate abbreviation
    if abbreviation in dictionary:
        word = dictionary[abbreviation]
    else:
        word = abbreviation

    return word + last_character


def translate_message(dictionary, message):
    output_translation = ""
    for line in message.split():
        output_translation += translate_abbreviation(dictionary, line) + " "
    return output_translation


# main
def main():
    abbreviations_dictionary = file_to_dictionary("abbreviations.txt")
    print("Enter a message to be translated: ")
    to_be_translated = str(input())
    print("The translated text is: ")
    print(translate_message(abbreviations_dictionary, to_be_translated))


# PROGRAM RUN
if __name__ == "__main__":
    main()
