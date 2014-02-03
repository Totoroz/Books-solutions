//Write programs with loops that compute
//e.The sum of all odd digits of an input. (For example, if the input is 32677, the
//sum would be 3 + 7 + 7 = 17.)

#include<iostream>

using namespace std;

int main()
{
    cout << "Enter a number: ";
    int number;
    cin >> number;

    cout <<

    int sum = 0;
    // stops when i = 0
    while(number)
    {
        sum += (number & 1) * (number % 10);
        number /= 10;
    }

    cout <<"The sum of all odd digits is "<< sum;

    return 0;
}
