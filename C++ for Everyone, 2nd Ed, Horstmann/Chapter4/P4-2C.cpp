//Write programs that read a sequence of integer inputs and print
//c.Cumulative totals.For example, if the input is 1 7 2 9, the program should print
//1 8 10 19.

#include<iostream>

using namespace std;

int main()
{
    cout << "Enter a series of numbers, then type Q to process: ";
    double input;
    double sum = 0.0;

    while(cin >> input)
    {
        sum += input;
        cout << sum << " ";
    }

    return 0;
}
