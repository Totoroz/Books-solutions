//The following pseudocode describes how to extract the dollars and cents from a
//price given as a floating - point value.For example, a price 2.95 yields values 2 and 95
//for the dollars and cents.
//Assign the price to an integer variable dollars.
//Multiply the difference price - dollars by 100 and add 0.5.
//Assign the result to an integer variable cents.
//Translate this pseudocode into a C++ program.Read a price and print the dollars
//and cents.Test your program with inputs 2.95 and 4.35.

#include<iostream>

using namespace std;

int main()
{
    cout << "Enter a price: ";
    float price;
    cin >> price;

    int dollars = (int)price;
    float cents = (price - dollars) * 100;

    cout << "That is " << dollars << " dollars and " << cents << " cents.";

    return 0;
}
