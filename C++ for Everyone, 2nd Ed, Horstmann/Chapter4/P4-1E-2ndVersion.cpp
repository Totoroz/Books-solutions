//Write programs with loops that compute
//e.The sum of all odd digits of an input. (For example, if the input is 32677, the
//sum would be 3 + 7 + 7 = 17.)

#include<iostream>

using namespace std;

int main()
{
    cout << "Int number: ";
    int number;
    cin >> number;

    int sum = 0;
    int digit;

    while(number > 0)
    {
        digit = number % 10;
        // Only add digits that are odd
        if(digit % 2 == 1)
        {
            sum += digit;
        }
        number /= 10;

    }

    cout << "The result is: " << sum;

    return 0;
}
