When two points in time are compared, each given as hours(in military time,
	rang ing from 0 and 23) and minutes, the following pseudocode determines which
	comes first.
	If hour1 < hour2
	time1 comes first.
	Else if hour1 and hour2 are the same
	If minute1 < minute2
	time1 comes first.
	Else if minute1 and minute2 are the same
	time1 and time2 are the same.
	Else
	time2 comes first.
	Else
	time2 comes first.
	Write a program that prompts the user for two points in time and prints the time that
	comes first, then the other time.

#include<iostream>

using namespace std;

int main()
{
    cout << "Please enter the first time: ";
    int time1;
    cin >> time1;

    cout << "Please enter the second time: ";
    int time2;
    cin >> time2;

    int hour1 = time1 / 100;
    int hour2 =  time2 / 100;
    int minute1 = time1 % 100;
    int minute2 = time2 % 100;

    if(hour1 < hour2)
    {
        cout << "time1 comes first\n";
    }

    else if(hour1 == hour2)
    {
        if(minute1 < minute2)
        {
            cout << "time1 comes first\n";
        }

        else if(minute1 == minute2)
        {
            cout << "time1 and time2 are the same.\n";

        }

        else
        {
            cout << "time2 comes first.\n";
        }
    }

    else
    {
        cout << "time2 comes first.";
    }

    return 0;
}
