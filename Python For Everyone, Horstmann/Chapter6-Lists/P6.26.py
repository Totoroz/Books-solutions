# A theater seating chart is implemented as a table of ticket prices, like this:
# 10 10 10 10 10 10 10 10 10 10
# 10 10 10 10 10 10 10 10 10 10
# 10 10 10 10 10 10 10 10 10 10
# 10 10 20 20 20 20 20 20 10 10
# 10 10 20 20 20 20 20 20 10 10
# 10 10 20 20 20 20 20 20 10 10
# 20 20 30 30 40 40 30 30 20 20
# 20 30 30 40 50 50 40 30 30 20
# 30 40 50 50 50 50 50 50 40 30
#
# Write a program that prompts users to
# pick either a seat or a price. Mark sold
# seats by changing the price to 0. When
# a user specifies a seat, make sure it is
# available. When a user specifies a price,
# find any seat with that price.

# FUNCTIONS
def printSeats(seats):
    for i in range(len(seats[0]) - 1):
        print(seats[i])

def findSeat(seats, pickChoice):
    if pickChoice.lower() == "p":
        price = int(input("\nEnter the price(10, 20, 30, 40 or 50): "))

        seatFound = False

        for i in range(len(seats)):
            for j in range(len(seats[0])):
                if seats[i][j] == price and not seatFound:
                    seatFound = True
                    seats[i][j] = 0
                    print("\nYour seat is in row %d and seat %d" % (i + 1, j + 1))

    else:
        totalRows = int(len(seats)) - 1
        row = int(input("\nEnter the row (1 through %d): " % totalRows))
        totalCols = int(len(seats[0])) - 1
        col = int(input(("\nEnter the seat(column) (1 through %d): " % totalCols)))

        if seats[row-1][col-1] == 0:
            print("\nSorry the seat is unavailable")

        else:
            seats[row-1][col-1] = 0
            print("\nYour seat is in row %d and seat %d" % (row, col))

# main
def main():
    seats = [ [ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 ], [ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 ],
              [ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 ], [ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 ],
              [ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 ], [ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 ],
              [ 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 ], [ 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 ],
              [ 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 ] ]

    pickChoice = str(input("Pick seat by price or location(Enter P or L): "))
    printSeats(seats)
    findSeat(seats, pickChoice)
    printSeats(seats)

# PROGRAM RUN
main()