# Write a function
#     def repeat(string, n, delim)
# that returns the string  string repeated  n times, separated by the string  delim . For
# example,  repeat("ho", 3, ", ") returns  "ho, ho, ho"

# FUNCTIONS
def repeat(string, n, delim):
    result = ""
    for i in range(n):
        result += string + delim

    # doesn't add a delimiter after the last string repetition
    lenDelim = len(delim)
    return result[:-lenDelim]

def main():
    string = str(input("Enter a string: "))
    n = int(input("How many times to repeat the string: "))
    delim = str(input("Delimiter: "))
    print(repeat(string, n, delim))

# PROGRAM RUN
main()