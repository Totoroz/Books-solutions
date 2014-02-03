//Repeat Exercise P3.27, modifying the program so that it first asks the user whether
//the input will be a wavelength or a frequency.

#include<iostream>
#include<ostream>

using namespace std;

int main()
{
    cout << "wavelength or frequency?: ";
    string choice;
    cin >> choice;

    if(choice == "wavelength")
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
    }

    else if(choice == "frequency")
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
    }

    else
    {
        cerr << "Invalid input";
        return 1;
    }

    return 0;
}

