# What happens if you try to open a file for writing, 
# but the file or device is write-
# protected (sometimes called read-only)? Try it out 
# with a short test program.

# IMPORTS
from sys import argv

# FUNCTIONS

# main
def main():
    filename = argv[1]
    file = open(filename, "w")
    file.close()
    
# PROGRAM RUN
if __name__ == "__main__":
    main()
