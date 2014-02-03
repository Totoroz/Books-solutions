//Write a program that displays the dimensions of a letter - size(8.5 × 11 inches) sheet
//of paper in millimeters.There are 25.4 millimeters per inch.Use con stants and com -
//ments in your program

#include <iostream>

using namespace std;

int main()
{
    double nX;
    double nY;

    cout << "Enter the dimensions of the sheet in inches\n";
    cin >> nX >> nY;

    double milimetersPerInch = 25.4;

    double dX = nX * milimetersPerInch;
    double dY = nY * milimetersPerInch;
    cout << "The dimensions in milimeters are "
        << dX << " x " << dY;

    return 0;
}
