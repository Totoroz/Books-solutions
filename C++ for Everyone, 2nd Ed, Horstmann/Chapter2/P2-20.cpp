//Write a program that reads an integer and breaks it into a sequence of individual
//digits.For example, the input 16384 is displayed as
//1 6 3 8 4
//You may assume that the input has no more than five digits and is not negative.

#include<iostream>

using namespace std;

int main()
{
    cout << "Enter a 5 digit number\n";
    int number;
    cin >> number;

    cout << number / 10000 << " ";
    number = number % 10000;

    cout << number / 1000 << " ";
    number = number % 1000;

    cout << number / 100 << " ";
    number = number % 100;

    cout << number / 10 << " ";
    number = number % 10;
    cout << number;

    return 0;
}
