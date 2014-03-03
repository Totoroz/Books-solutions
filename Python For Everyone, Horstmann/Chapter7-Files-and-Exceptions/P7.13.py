# Write a program that asks the user to input a set of floating-point
# values. When the user enters a value that is not a number, 
# give the user a second chance to enter the value. After two chances, 
# quit reading input. Add all correctly specified values and
# print the sum when the user is done entering data. Use exception 
# handling to detect improper inputs.

# IMPORTS

# FUNCTIONS

# main
def main():
    inputList = []

    tries = 1

    while tries < 3:	
	    try:
	    	inputN = int(input("Enter a number: "))
	    	inputList.append(inputN)

	    except ValueError:
	    	print("Not a number! Enter a number to continue")
	    	print("or enter a character to quit")
	    	tries += 1

    print("Sum: %d" % sum(inputList))

# PROGRAM RUN
if __name__ == "__main__":
    main()
