The following algorithm yields the season(Spring, Summer, Fall, or Winter) for a
given month and day.
If month is 1, 2, or 3, season = "Winter"
Else if month is 4, 5, or 6, season = "Spring"
Else if month is 7, 8, or 9, season = "Summer"
Else if month is 10, 11, or 12, season = "Fall"
If month is divisible by 3 and day >= 21
If season is "Winter", season = "Spring"
Else if season is "Spring", season = "Summer"
Else if season is "Summer", season = "Fall"
Else season = "Winter"
Write a program that prompts the user for a month
and day and then prints the season, as determined
by this algorithm.

#include<iostream>

using namespace std;

int main()
{
    cout << "Enter month and day: ";
    int month, day;
    cin >> month >> day;

    string season;
    bool invalidMonth = false;
    if(month <= 1 && month <=3)
    {
        season = "Winter";
    }

    else if(month <=4 && month <=6)
    {
        season = "Spring";
    }

    else if(month <=7 && month <=9)
    {
        season = "Summer";
    }

    else if(month <=10 && month <=12)
    {
        season = "Winter";
    }

    else
    {
        invalidMonth = true;
        cout << "Invalid month number.\n";
    }

    if(month % 3 == 0 && day >=21)
    {
        if(season == "Winter")
        {
            season = "Spring";
        }

        else if(season == "Spring")
        {
            season = "Summer";
        }

        else if(season == "Summer")
        {
            season = "Fall";
        }

        else
        {
            season = "Winter";
        }
    }

    if(!invalidMonth)
    {
        cout << "Season is: " << season;
    }
    return 0;
}
