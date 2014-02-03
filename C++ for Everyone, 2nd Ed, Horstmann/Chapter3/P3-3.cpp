//Write a program that reads in three floating - point numbers and prints the largest of
//the three inputs.For example :
//Please enter three numbers : 4 9 2.5
//The largest number is 9.

#include<iostream>

using namespace std;

int main()
{
    float number1, number2, number3;

    cout << "Enter three numbers: ";
    cin >> number1 >> number2 >> number3;

    float largest;

    if(number1 > number2 && number1 > number3)
    {
        largest = number1;
    }

    else if(number1 < number2 && number2 > number3)
    {
        largest = number2;
    }

    else
    {
        largest = number3;
    }

    cout << "The largest number is: " << largest;

    return 0;
}
