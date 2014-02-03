//Giving change.Implement a program that directs a cashier
//how to give change.The program has two inputs : the
//amount due and the amount received from the customer.
//Display the dollars, quarters, dimes, nickels, and pennies
//that the customer should receive in return.

#include <iostream>

using namespace std;

int main()
{
    cout << "Enter the amount due: ";
    double amt_due;
    cin >> amt_due;

    cout << "Enter the amount received: ";
    double amt_rcvd;
    cin >> amt_rcvd;

    double change = amt_rcvd - amt_due;
    int change_as_cents = change * 100 + 0.5;
    cout << "The change is: " << endl;

    int dollars = (change_as_cents / 100);
    cout << "Dollars: " << dollars << endl;
    change_as_cents = change_as_cents - dollars * 100;

    int quarters = (change_as_cents / 25);
    cout << "Quarters: " << quarters << endl;
    change_as_cents = change_as_cents - quarters * 25;

    int dimes = (change_as_cents / 10);
    cout << "Dimes: " << dimes << endl;
    change_as_cents = change_as_cents - dimes * 10;

    int nickels = (change_as_cents / 5);
    cout << "Nickels: " << nickels << endl;
    change_as_cents = change_as_cents - nickels * 5;

    cout << "Pennies: " << change_as_cents;
    return 0;
}
