//The following pseudocode describes how a bookstore computes the price of an
//order from the total price and the number of the books that were ordered.
//Read the total book price and the number of books.
//Compute the tax(7.5% of the total book price).
//Compute the shipping charge($ 2 per book).
//The price of the order is the sum of the total book price, the tax, and the shipping charge.
//Print the price of the order.
//Translate this pseudocode into a C++ program

#include<iostream>

using namespace std;

int main()
{
    double dPrice = 13.54;
    double dAmount = 3;

    cout << "You're buying " << dAmount << " books costing " << dPrice << "\n";

    double dTax = (7.5/100) * dPrice;
    double dShipping = 2 * dAmount;
    double dTotal = dTax + dShipping + dAmount * dPrice;

    cout << "Total price is " << dTotal << " including Tax(" << dTax << ")" <<
            " and Shipping (" << dShipping << ")\n";


    return 0;
}
