Write a program that prompts for the day and month of the user’s birthday and then
prints a horoscope.Make up fortunes for programmers, like this:
Please enter your birthday(month and day) : 6 16
Gemini are experts at figuring out the behavior of complicated programs.
You feel where bugs are coming from and then stay one step ahead.Tonight,
your style wins approval from a tough critic.
Each fortune should contain the name of the astrological sign. (You will find the
names and date ranges of the signs at a distressingly large number of sites on the
Internet.)

#include<iostream>


/*
I use http://mistupid.com/zodiac/ to get the ranges.
But I didn't include any fortunes.However it's functional!
*/
using namespace std;

int main()
{
    cout << "Please enter your birthday(month and day): ";
    int month, day;
    cin >> month >> day;

    if(month > 12 || day > 31)
    {
        cout << "Invalid input\n";
        return 0;
    }

    if (( month == 1 && day >= 20) || ( month == 2 && day <=18))
    {
         cout<<"Your zodiac sign is AQUARIUS\n";

    }
    else if (( month == 2 && day >= 19) || ( month == 3 && day <= 20))
    {
         cout<<"Your zodiac sign is PISCES\n";
    }
    else if (( month == 3 && day >= 21) || ( month == 4 && day <= 19))
    {
         cout<<"Your zodiac sign is ARIES\n";
    }
    else if (( month == 4 && day >= 20) || ( month == 5 && day <= 20))
    {
         cout<<"Your zodiac sign is TAURUS\n";
    }
    else if (( month == 5 && day >= 21 ) || ( month == 6 && day <= 20 ))
    {
         cout<<"Your zodiac sign is GEMINI\n";
    }
    else if (( month == 6 && day >= 21 ) || ( month == 7 && day <= 22 ))
    {
         cout<<"Your zodiac sign is CANCER\n";
    }
    else if (( month == 7 && day <= 23 ) || ( month == 8 && day <= 22))
    {
         cout<<"Your zodiac sign is LEO\n";
    }
    else if (( month == 8 && day >= 23 ) || ( month == 9 && day <= 22 ))
    {
         cout<<"Your zodiac sign is VIRGO\n";
    }
    else if (( month == 9 && day >= 23 ) || ( month == 10 && day <= 22))
    {
         cout<<"Your zodiac sign is LIBRA\n";
    }
    else if (( month == 10 && day >= 23 ) || ( month == 11 && day <= 21))
    {
         cout<<"Your zodiac sign is SCORPIO\n";
    }
    else if (( month == 11 && day >= 22 ) || ( month == 12 && day <= 21))
    {
         cout<<"Your zodiac sign is SAGUITTARIUS\n";
    }
    else if (( month == 12 && day >= 22 ) || ( month == 1 && day <= 19 ))
    {
         cout<<"Your zodiac sign is CAPRICORN\n";
    }

    return 0;
}
