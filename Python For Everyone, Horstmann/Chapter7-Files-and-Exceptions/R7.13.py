# Give an output statement to write a date and time in ISO 8601 format, 
# uch as
# 2011-03-01 09:35
# Assume that the date and time are given in five integer variables
# named year , month ,day , hour , minute.

# FUNCTIONS

# main
def main():
    filename = "example.txt"
    file = open(filename, "w")
    
    year = 2011
    month = 3
    day = 1
    hour = 9
    minute = 35

    file.write("%s-0%s-0%s 0%s:%s" % (year, month, day, hour, minute))
    file.close()

# PROGRAM RUN
if __name__ == "__main__":
    main()
