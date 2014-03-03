# In order to read a web page (Special Topic 7.4), you need to know its character
# encoding (Special Topic 7.3). Write a program that has the URL of a web page as a
# command-line argument and that fetches the page contents in the proper encoding.
# Determine the encoding as follows:
#     1.   After calling urlopen , call input.headers["content-type"] . 
#     You may get a string such as "text/html; charset=windows-1251" . If so, 
#     use the value of the charset attribute as the encoding.
#     2.   Read the first line using the "latin_1" encoding. If the first two bytes
#     of the file are 254 255 or 255 254, the encoding is "utf-16" . If the first
#     three bytes of the file are 239 187 191, the encoding is "utf-8".
#     3.   Continue reading the page using the "latin_1" encoding and look for a string 
#     of the form 
#         encoding=...
#         or
#         charset=...

# If you found a match, extract the character encoding (discarding any surrounding
# quotation marks) and re-read the document with that encoding.
# If none of these applies, write an error message that the encoding could not be
# determined.

# IMPORTS
from sys import argv
from urllib.request import urlopen

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
    
    print(input.headers["content-type"])
    webPage.close()
    
# PROGRAM RUN
if __name__ == "__main__":
    main()
