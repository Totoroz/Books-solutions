# The following pseudocode describes how a bookstore computes the price of an
# order from the total price and the number of the books that were ordered.
#     Read the total book price and the number of books.
#     Compute the tax (7.5 percent of the total book price).
#     Compute the shipping charge ($2 per book).
#     The price of the order is the sum of the total book price, the tax, and the shipping charge.
#     Print the price of the order.
# Translate this pseudocode into a Python program.

totalBookPrice = float(input("Enter the book price: "))
numberOfBooks = int(input("Enter the number of books you like to buy: "))
totalBookPrice *= numberOfBooks

tax = (7.5 / 100 ) * totalBookPrice
shippingCharge =  2 * numberOfBooks
totalPrice = totalBookPrice + tax + shippingCharge

print("-" * 30)
print("Order price: ", totalPrice)