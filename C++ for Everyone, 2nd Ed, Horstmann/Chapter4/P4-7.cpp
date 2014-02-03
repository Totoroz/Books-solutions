//Write a program that first asks the user to type in today’s exchange rate between U.S.
//dollars and Japanese yen, then reads U.S.dollar values and converts each to Japanese
//yen.Use 0 as the sentinel value to denote the end of dollar inputs.Then the program
//reads a sequence of yen amounts and converts them to dollars.The second sequence
//is terminated by another zero value.

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
        cout << "Amount of dollars you want to convert to yen: ";
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
    cout << "Stopping dollar input\n";

    exit = false;
    while(!exit)
    {
        cout << "Enter 0 to stop.\n";
        cout << "Amount of yen you want to convert to dollars: ";
        double yen;
        cin >> yen;

        if(yen == 0)
        {
            exit = true;
            break;
        }

        double dollars = yen / rate;

        cout << yen << "JPY = $" << dollars << "\n";
    }

    cout << "Exitting the program... ";
    return 0;
}
