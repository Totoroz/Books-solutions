//Write a program that reads a number and prints all of its binary digits : Print the
//remainder  number % 2, then replace the number with  number / 2.Keep going until the
//number is 0. For example, if the user provides the input 13, the output should be
//1
//0
//1
//1

#include<iostream>

using namespace std;

int main()
{
    cout << "Enter a number: ";
    int number;
    cin >> number;

    while(number !=  0)
    {
        cout << number % 2;
        number = number / 2;
    }
    return 0;
}
