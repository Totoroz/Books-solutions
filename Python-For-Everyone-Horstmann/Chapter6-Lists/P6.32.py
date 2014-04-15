# A supermarket wants to reward its best customer of each day, showing the custom-
# er’s name on a screen in the supermarket. For that purpose, the customer’s purchase
# amount is stored in a list and the customer’s name is stored in a corresponding list.
# Implement a function
#     def nameOfBestCustomer(sales, customers)
# that returns the name of the customer with the largest sale.
# Write a program that prompts the cashier to enter all prices and names, adds them to
# two lists, calls the function that you implemented, and displays the result. Use a
# price of 0 as a sentinel.

# FUNCTIONS
def enterPurchases(list):
    inputN = 1
    print("Enter prices(0 to stop): ")

    while inputN != 0:
        inputN = int(input())
        list.append(inputN)

    return list

def enterNames(list):
    inputSTR = ""
    print("Enter customer names(0 to stop): ")

    while inputSTR != "0":
        inputSTR = input()
        list.append(inputSTR)

    return list


def bestCustomer(purchases, customers):
    maxPurchase = max(purchases)
    maxPurchase = purchases.index(maxPurchase)

    print("Best customer:", customers[maxPurchase], "with purchase worth ", purchases[maxPurchase])
# main
def main():
    listPurchases = [ ]
    listPurchases = enterPurchases(listPurchases)

    listCustomers = [ ]
    listCustomers = enterNames(listCustomers)

    bestCustomer(listPurchases, listCustomers)

# PROGRAM RUN
main()