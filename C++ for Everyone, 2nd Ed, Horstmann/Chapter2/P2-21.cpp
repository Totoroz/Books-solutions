//Write a program that reads two times in military format(0900, 1730) and prints the
//number of hours and minutes between the two times.Here is a sample run.User
//input is in color.
//Please enter the first time : 0900
//Please enter the second time : 1730
//8 hours 30 minutes
//Extra credit if you can deal with the case where the first time is later than the second :
//Please enter the first time : 1730
//Please enter the second time : 0900
//15 hours 30 minutes

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

    // convert time(incl. hours) to minutes
    int hours1 = time1 / 100;
    int minutes1 = (time1 % 100) + (hours1 * 60);

    int hours2 = time2 / 100;
    int minutes2 = (time2 % 100) + (hours2 * 60);

    // answer
    int difference = (minutes2 - minutes1 + 1440) % 1440;

    // Minutes back to hours::minutes
    int hours3 = difference / 60;
    int minutes3 = difference % 60;

    cout << "Differencne is: " << hours3 << " hours and " << minutes3 << " minutes";

    return 0;
}
