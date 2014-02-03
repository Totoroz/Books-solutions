//The boiling point of water drops by about one degree centigrade for every 300
//meters(or 1, 000 feet) of altitude.Improve the program of Exercise P3.1 to allow the
//user to supply the altitude in meters or feet.

#include <iostream>
#include <string>

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

   cout << "Enter C for Celsius or F for Fahrenheit: ";
   string scale;
   cin >> scale;

   cout << "Enter the altitude above sea level: ";
   int alt;
   cin >> alt;

   cout << "Enter M for meters or F for feet: ";
   string units;
   cin >> units;

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

