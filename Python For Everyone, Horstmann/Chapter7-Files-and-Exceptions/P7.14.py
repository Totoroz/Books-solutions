# Using the mechanism described in Special Topic 7.4,
# write a program that reads all data from a web page and writes 
# them to a file. Prompt the user for the web page URL and the file.

# IMPORTS
from urllib.request import urlopen
from sys import argv

# FUNCTIONS

# main
def main():
	webAddress = ""
	if argv[1] != "":
		webAddress = argv[1]
	else:
		webAddress = str(input("Enter the web address without the protocol: "))

	webAddress = "http://" + webAddress
	webPage = urlopen(webAddress)

	encoding = "utf-8"
	for line in webPage:
		key = "http://"
		line = str(line, encoding)
		if key in line:
			start = line.index(key) + len(key)
			last = line.index('"', start)
			print(line[start:last])

	webPage.close()


# PROGRAM RUN
if __name__ == "__main__":
    main()
