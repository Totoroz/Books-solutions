# Write a program that carries out the following tasks:
#     Open a file with the name hello.txt.
#     Store the message “Hello, World!” in the file.
#     Close the file.
#     Open the same file again.
#     Read the message into a string variable and print it.

# FUNCTIONS

# main
def main():
    filename = "hello.txt"
    file = open(filename, "w")    
    file.write("Hello, World!")
    file.close()

    file = open(filename, "r")
    content = file.read()
    print(content)
    file.close()

# PROGRAM RUN
if __name__ == "__main__":
    main()
