# Using the mechanism described in Special Topic 7.4,
# write a program that reads all data from a web page and writes
# them to a file. Prompt the user for the web page URL and the file.

# IMPORTS
from urllib.request import urlopen
from sys import argv


# FUNCTIONS
def read_from_url():
    web_address = ""
    try:
        web_address = argv[1]
    except IndexError:
        print("No arguments given.")
        web_address = str(
            input("Enter the web address without the protocol: "))

    web_address = "http://" + web_address
    web_page = urlopen(web_address)
    encoding = "utf-8"

    output = []
    for line in web_page:
        key = "http://"
        line = str(line, encoding)
        if key in line:
            start = line.index(key) + len(key)
            last = line.index('"', start)
            output.append(line[start:last])
    web_page.close()

    return "\n".join(output)


def write_to_file(contents):
    filename = ""
    try:
        filename = argv[2]
    except IndexError:
        print("No arguments given.")
        filename = str(input("Enter file name to save to: "))

    file = open(filename, "w")
    file.write(contents)
    file.close()


# main
def main():
    contents = read_from_url()
    write_to_file(contents)


# PROGRAM RUN
if __name__ == "__main__":
    main()
