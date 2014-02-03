//Write a program that asks the user for the lengths of the sides of a
//rectangle and then prints
//• The area and perimeter of the rectangle
//• The length of the diagonal(use the Pythagorean theorem)

#include<iostream>
#include<cmath>

using namespace std;

int main()
{
    cout << "Rectangles sides\n";
    cout << "Rectangle side1: ";
    double side1, side2;
    cin >> side1;

    cout << "Rectangle side2: ";
    cin >> side2;

    double dArea = side1 * side2;
    cout << "Area = " << dArea << "\n";

    double dPerimeter = 2 * (side1 + side2);
    cout << "Perimeter = " << dPerimeter << "\n";

    double dDiagonal = sqrt(pow(side1, 2) + pow(side2, 2));
    cout << "Diagonal = " << dDiagonal << "\n";


    return 0;
}
