# Give an output statement to write one line of a table 
# containing a product descrip­tion, quantity, unit price, 
# and total price in dollars and cents. You want the columns
# to line up, like this:
# Item        Qty     Price   Total
# Toaster     3      $29.95   $89.85
# Hair Dryer  19     $24.95   $24.95
# Car Vacuum  2      $19.99   $39.98

# FUNCTIONS

# main
def main():
    filename = "example.txt"
    file = open(filename, "w")

    item = ( "Toaster", "Hair Dryer", "Car Vacuum" )
    Qty = ( 3, 1, 2 )
    Price = ( "$29.95", "$24.95", "$19.99" )
    Total = ( "$89.95", "$24.95", "$39.98" )

    file.write("%10s %6s %6s %7s\n" % ("Item", "Qty", "Price", "Total"))

    for i in range(3):
        file.write("%10s %5s %8s %7s\n" % ( item[i], Qty[i], Price[i], Total[i]))
    file.close()

# PROGRAM RUN
if __name__ == "__main__":
    main()
