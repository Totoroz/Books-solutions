//Write a program that asks the user to input
//• The number of gallons of gas in the tank
//• The fuel efficiency in miles per gallon
//• The price of gas per gallon
//Then print the cost per 100 miles and how far the car can go with the gas in the tank.

#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    cout << "Enter number of gallons in tank: ";
    double gallons;
    cin >> gallons;

    cout << "Enter fuel efficiency in miles per gallon: ";
    double mpg;
    cin >> mpg;

    cout << "Enter price of gas per gallon: ";
    double price_per_gal;
    cin >> price_per_gal;

    cout << fixed << setprecision(2)
      << "The cost per 100 miles is $"
      << 100 / mpg * price_per_gal <<  endl;
    cout << "You can make it " << mpg * gallons
      << " miles on that amount of gas." << endl;
    return 0;
}
