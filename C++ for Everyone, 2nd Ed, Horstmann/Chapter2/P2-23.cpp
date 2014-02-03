//Write a program that transforms numbers  1, 2, 3, …, 12
//into the corresponding month names  January, February,
//March, …, December.Hint: Make a very long string  "January
//February March ..." , in which you add spaces such that
//each month name has the same length.Then use  substr to
//extract the month you want.

#include<iostream>

using namespace std;

int main()
{
    const string months = "January  February March    April    May      June     "
                          "July     August   SeptemberOctober  November December ";



    cout << "Enter a month's number(1-12): ";
    int input;
    cin >> input;

    string output = months.substr((input-1) * 9, 9);

    cout << "The month's name: " << output;

    return 0;
}
