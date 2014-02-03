//Write a program that asks the user to enter a month(1 for January, 2 for February,
//	and so on) and then prints the number of days in the month.For February, print “28
//	or 29 days”.
//	Enter a month : 5
//	30 days
//	Do not use a separate  if / else branch for each month.Use Boolean operators.

#include<iostream>

using namespace std;

int main()
{
    cout << "Enter a month(1-12): ";
    int month;
    cin >> month;

    if(month >= 0 || month > 12)
    {
        cout << "Invalid input. Month less than 1 or greater than 12";
        return 1;
    }

    int days;
    if(month == 4 || month == 6 || month == 9 || month == 1)
    {
        days = 30;
    }

    else if(month == 2)
    {
        days = 28;
    }

    else
    {
        days = 31;
    }

    cout << "There are " << days << " days";

    return 0;
}
