//Repeat Exercise P3.27, modifying the program so that it prompts for the frequency
//instead.

#include<iostream>

using namespace std;

int main()
{
    const double RADIO_WAVES = 3E-9;
    const double MICRO_WAVES = 3E-11;
    const double INFRARED = 4E-14;
    const double VISIBLE_LIGHT = 7.5E-14;
    const double ULTRAVIOLET = 3E-16;
    const double X_RAYS = 3E-19;

    cout << "Frequency value: ";
    double frequency;
    cin >> frequency;

    if(frequency < RADIO_WAVES)
    {
        cout << "Radio waves";
    }

    else if(frequency < MICRO_WAVES)
    {
        cout << "Micro waves";
    }

    else if(frequency < INFRARED)
    {
        cout << "Infrared";
    }

    else if(frequency < VISIBLE_LIGHT)
    {
        cout << "Visible light";
    }

    else if(frequency < ULTRAVIOLET)
    {
        cout << "Ultra violet";
    }

    else if(frequency < X_RAYS)
    {
        cout << "X-rays";
    }

    else
    {
        cout << "Gamma rays";
    }

    return 0;
}
