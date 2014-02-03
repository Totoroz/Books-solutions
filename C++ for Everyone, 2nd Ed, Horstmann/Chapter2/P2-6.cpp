//Write a program that prompts the user for a measurement in meters and then
//con verts it to miles, feet, and inches.

#include<iostream>
#include<cmath>
#include<algorithm>


using namespace std;

int main()
{
    double measurementMeters;

    cout << "Enter the measurement in meters: ";
    cin >> measurementMeters;

    // Google sources, lol
    double measurementMiles = measurementMeters * 0.000621371192;
    double measurementFeet = measurementMeters * 3.2808399;
    double measurementInches = measurementMeters * 39.3700787;

    cout << "\nMeasurement in miles " << measurementMiles;
    cout << "\nMeasurement in feet " << measurementFeet;
    cout << "\nMeasurement in inches " << measurementInches;

    return 0;
}
