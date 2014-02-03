//Write a program that reads a number and displays the square, cube, and fourth
//power.Use the  pow function only for the fourth power.

#include<iostream>
#include<cmath>

using namespace std;

int main()
{
    double n,
        nSquare,
        nCube,
        nQuad;

    cout << "Enter a number: ";
    cin >> n;

    nSquare = n*n;
    nCube = pow(n, 3);
    nQuad = pow(n, 4;
    cout << "The square, cube and quad of "<<n<<" is "<< nSquare << ", " << nCube << ", " << nQuad;

    return 0;
}
