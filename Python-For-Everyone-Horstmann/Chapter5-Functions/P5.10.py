# Write a function
#     def readFloat(prompt)
# that displays the prompt string, followed by a space, reads a floating-point number
# in, and returns it. Here is a typical usage:
#     salary = readFloat("Please enter your salary:")
#     percentageRaise = readFloat("What percentage raise would you like?")

# FUNCTIONS
def readFloat(prompt):
    return input(prompt + " ")

def main():
    salary = readFloat("Please enter your salary:")
    percentageRaise = readFloat("What percentage raise would you like?")

    # tests
    print("Salary entered?", salary)
    print("Percentage raise entered?", percentageRaise)

# PROGRAM RUN
main()