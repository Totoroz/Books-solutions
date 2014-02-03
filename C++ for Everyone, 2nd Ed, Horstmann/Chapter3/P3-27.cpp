//Write a program that prompts the user for a wavelength value and prints a descrip -
//tion of the corresponding part of the electromagnetic spectrum.

#include<iostream>

using namespace std;

int main()
{
    const double RADIO_WAVES = 1E-1;
    const double MICRO_WAVES = 1E-3;
    const double INFRARED = 7E-7;
    const double VISIBLE_LIGHT = 4E-7;
    const double ULTRAVIOLET = 1E-8;
    const double X_RAYS = 1E-11;

    cout << "Wavelength value: ";
    double wavelength;
    cin >> wavelength;

    if(wavelength > RADIO_WAVES)
    {
        cout << "Radio waves";
    }

    else if(wavelength > MICRO_WAVES)
    {
        cout << "Micro waves";
    }

    else if(wavelength > INFRARED)
    {
        cout << "Infrared";
    }

    else if(wavelength > VISIBLE_LIGHT)
    {
        cout << "Visible light";
    }

    else if(wavelength > ULTRAVIOLET)
    {
        cout << "Ultra violet";
    }

    else if(wavelength > X_RAYS)
    {
        cout << "X-rays";
    }

    else
    {
        cout << "Gamma rays";
    }

    return 0;
}
