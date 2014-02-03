//Write a program that reads a temperature value and the letter C for Celsius or F for
//Fahrenheit.Print whether water is liquid, solid, or gaseous at the given temperature
//at sea level.

#include<iostream>

using namespace std;

int main()
{
    char type;
    int temperature;

    cout << "Enter the type of temperature C for celsius or F for fahrenheit.\n";
    cin >> type;

    cout << "Enter the temperature.\n";
    cin >> temperature;

    // celsius
    if(type == 'C')
    {
        if(temperature >= 0 && temperature < 100)
        {
            cout << "Water is liquid.\n";
        }
        else if(temperature >= 100)
            cout << "Water is gaseous.\n";
                    {
        }
        else
        {
            cout << "Water is solid.\n";
        }

    }

    else if(type == 'F')
    {
        if(temperature >= 32 && temperature < 132)
        {
            cout << "Water is liquid.\n";
        }
        else if(temperature >= 132)
        {
            cout << "Water is gaseous.\n";
        }
        else
        {
            cout << "Water is solid.\n";
        }
    }

    return 0;
}
