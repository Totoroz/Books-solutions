//Add error handling to Exercise P3.2.If the user does not enter a number when
//expected, or provides an invalid unit for the altitude, print an error message and end
//the program.

#include<iostream>
#include<string>

using namespace std;

int main()
{
    const int FREEZE_C = 0;
    const int FREEZE_F = 32;
    int boil_c = 100;
    int boil_f = 212;

    cout << "Enter the temperature in degrees: ";
    int temp;
    cin >> temp;

    if(cin.fail())
    {
        cerr << "Invalid input.";
        return 1;
    }
    cout << "Enter C for Celsius or F for Fahrenheit: ";
    string scale;
    cin >> scale;

    if(cin.fail())
    {
        cerr << "Invalid input.";
        return 1;
    }

    cout << "Enter the altitude above sea level: ";
    int alt;
    cin >> alt;

    if(cin.fail())
    {
        cerr << "Invalid input.";
        return 1;
    }

    cout << "Enter M for meters or F for feet: ";
    string units;
    cin >> units;

    if(cin.fail())
    {
        cerr << "Invalid input.";
        return 1;
    }

    if(scale == "C")
    {
      if(units == "M")
      {
         boil_c = boil_c - (alt / 300);
      }
      else
      {
         boil_c = boil_c - (alt / 1000);
      }

      if(temp <= FREEZE_C)
      {
         cout << "Solid" << endl;
      }
      else if(temp >= boil_c)
      {
         cout << "Gas" << endl;
      }
      else
      {
         cout << "Liquid" << endl;
      }
    }
    else
    {
      if(units == "M")
      {
         boil_f = boil_f - (alt / 300);
      }
      else
      {
         boil_f = boil_f - (alt / 1000);
      }

      if(temp <= FREEZE_F)
      {
         cout << "Solid" << endl;
      }
      else if(temp >= boil_f)
      {
         cout << "Gas" << endl;
      }
      else
      {
         cout << "Liquid" << endl;
      }
    }

    return 0;
}

