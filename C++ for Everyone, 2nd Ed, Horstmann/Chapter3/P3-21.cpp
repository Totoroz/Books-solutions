//Unit conversion.Write a unit conversion program that asks the users from which
//unit they want to convert(fl.oz, gal, oz, lb, in, ft, mi) and to which unit they want to
//convert(ml, l, g, kg, mm, cm, m, km).Reject incompatible conversions(such as gal
//? km).Ask for the value to be converted, then display the result :
//Convert from ? gal
//Convert to ? ml
//Value ? 2.5
//2.5 gal = 9462.5 ml

#include <iostream>
#include <string>

using namespace std;

int main()
{
    const double FLUID_OUNCE_TO_LITER = 0.029586;
    const double GALLON_TO_LITER = 3.758;
    const double OUNCE_TO_GRAM = 28.3495;
    const double POUND_TO_GRAM = 453.6;
    const double INCH_TO_METER = 0.00254;
    const double FOOT_TO_METER = 0.305;
    const double MILE_TO_METER = 1609.0;

    cout <<  "Convert from? (fl.oz, gal, oz, lb, in, ft, mi) ";
    string from;
    cin >> from;

    cout <<  "Convert to? (ml, l, g, kg, mm, cm, m, km) ";
    string to;
    cin >> to;

    cout <<  "Value?: ";
    double value;
    cin >> value;

    double cfactor = 0.0;

    if (from == "fl.oz")
    {
      if (to == "ml")
      {
         cfactor = FLUID_OUNCE_TO_LITER * 1000;
      }
      else if (to == "l")
      {
         cfactor = FLUID_OUNCE_TO_LITER;
      }
    }
    else if (from == "gal")
    {
      if (to == "ml")
      {
         cfactor = GALLON_TO_LITER * 1000;
      }
      else if (to == "l")
      {
         cfactor = GALLON_TO_LITER;
      }
    }
    else if (from == "oz")
    {
      if (to == "g")
      {
         cfactor = OUNCE_TO_GRAM;
      }
      else if (to == "kg")
      {
         cfactor = OUNCE_TO_GRAM / 1000;
      }
    }
    else if (from == "lb")
    {
      if (to == "g")
      {
         cfactor = POUND_TO_GRAM;
      }
      else if (to == "kg")
      {
         cfactor = POUND_TO_GRAM / 1000;
      }
    }
    else if (from == "in")
    {
      if (to == "mm")
      {
         cfactor = INCH_TO_METER * 1000;
      }
      if (to == "cm")
      {
         cfactor = INCH_TO_METER * 100;
      }
      else if (to == "m")
      {
         cfactor = INCH_TO_METER;
      }
      else if (to == "km")
      {
         cfactor = INCH_TO_METER / 1000;
      }
    }
    else if (from == "ft")
    {
      if (to == "mm")
      {
         cfactor = FOOT_TO_METER * 1000;
      }
      if (to == "cm")
      {
         cfactor = FOOT_TO_METER * 100;
      }
      else if (to == "m")
      {
         cfactor = FOOT_TO_METER;
      }
      else if (to == "km")
      {
         cfactor = FOOT_TO_METER / 1000;
      }
    }
    else if (from == "mi")
    {
      if (to == "mm")
      {
         cfactor = MILE_TO_METER * 1000;
      }
      if (to == "cm")
      {
         cfactor = MILE_TO_METER * 100;
      }
      else if (to == "m")
      {
         cfactor = MILE_TO_METER;
      }
      else if (to == "km")
      {
         cfactor = MILE_TO_METER / 1000;
      }
    }

    if (cfactor == 0.0)
    {
      cout << "Requested conversion " << from << " -> "
         << to << " is not available.\n";
    }
    else
    {
      double converted = value * cfactor;
      cout <<  value << " " << from
         << " = " << converted << " " << to << "\n";
    }

    return 0;
}
