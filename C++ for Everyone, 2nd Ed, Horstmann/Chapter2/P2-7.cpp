//Write a program that prompts the user for a radius and then prints
//• The area and circumference of a circle with that radius
//• The volume and surface area of a sphere with that radius

#include<iostream>
#include<cmath>

using namespace std;

int main()
{
    cout << "Radius: ";
    double dRadius;
    cin >> dRadius;

    const double Pi = 3.14159265359;

    double dAreaCircle = (dRadius * dRadius) * Pi;
    cout << "Area of a circle with radius " << dRadius << " = " << dAreaCircle << "\n";

    double dDiameter = 2 * dRadius;
    cout << "Diameter of a circle with radius " << dRadius << " = " << dDiameter << "\n";

    double dCircumference = Pi * dDiameter;
    cout << "Circumference of a circle with radius " << dRadius << " = " << dCircumference << "\n";

    double dVolume = (4/3) * Pi * pow(dRadius,3);
    cout << "Volume of a sphere with radius " << dRadius << " = " << dVolume << "\n";

    double dAreaSphere =  4 * Pi * pow(dRadius,2);
    cout << "Surface area of a sphere with radius " << dRadius << " = " << dAreaSphere << "\n";

    return 0;
}
