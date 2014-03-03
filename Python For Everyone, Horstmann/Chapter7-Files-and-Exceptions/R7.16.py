# What is the purpose of the finally clause used with a try/except block?
# Give an example of how it can be used.

# FUNCTIONS

# main
def main():
    n = int(input("Enter a number: "))

    result = 0
    try:
        result = n / 0

    except ZeroDivisionError:
        print("Error: You attemped to divide %d by zero" % n)

    finally:
        print("You still have to obey math rules. Division by zero isn't possible.")
    
# PROGRAM RUN
if __name__ == "__main__":
    main()
