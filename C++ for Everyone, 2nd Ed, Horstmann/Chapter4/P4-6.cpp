//Currency conversion.Write a program that first asks the user to type today’s ex -
//change rate between U.S.dollars and Japanese yen, then reads U.S.dollar values and
//converts each to yen.Use 0 as a sentinel.

#include<iostream>

using namespace std;

int main()
{
    cout << "Today's exchange rate between USD and JPY(usually 1USD = 105.1700 JPY): ";
    double rate;
    cin >> rate;

    bool exit = false;

    while(!exit)
    {
        cout << "Enter 0 to stop.\n";
        cout << "Amount of dollars you want to convert: ";
        double dollars;
        cin >> dollars;

        if(dollars == 0)
        {
            exit = true;
            break;
        }

        double yen = dollars * rate;

        cout << "$" << dollars << " = " << yen << "yen\n";
    }

    cout << "Exitting...";
    return 0;
}
