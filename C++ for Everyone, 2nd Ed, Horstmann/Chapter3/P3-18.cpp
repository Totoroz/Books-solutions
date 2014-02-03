//Write a program that computes taxes

#include<iostream>

using namespace std;

int main()
{
    cout << "Are you single or married?: ";
    string status;
    cin >> status;


    if(status == "married" || status == "single")
    {
        cout << "Enter your income: $";
        double rawIncome;
        cin >> rawIncome;
        double tax;

        if(status == "single")
        {
            if(rawIncome > 0 && rawIncome <= 8000)
            {
                tax = rawIncome * 0.10;
            }

            else if(rawIncome > 8000 && rawIncome <= 32000)
            {
                tax = (rawIncome * 0.15) + 800;
            }

            else if(rawIncome > 32000)
            {
                tax = (rawIncome * 0.25) + 4400;
            }

            else
            {
                cout << "Invalid income input\n";
            }
        }

        else
        {
            if(rawIncome > 0 && rawIncome <= 16000)
            {
                tax = rawIncome * 0.10;
            }

            else if(rawIncome > 16000 && rawIncome <= 64000)
            {
                tax = (rawIncome * 0.15) + 1600;
            }

            else if(rawIncome > 64000)
            {
                tax = (rawIncome * 0.25) + 8800;
            }

            else
            {
                cout << "Invalid income input\n";
            }

        }

        if(rawIncome > 0)
            {
                cout << "Your tax is: $" << tax;
            }
    }

    else
    {
        cout << "Invalid input.\n";
    }

    return 0;
}
