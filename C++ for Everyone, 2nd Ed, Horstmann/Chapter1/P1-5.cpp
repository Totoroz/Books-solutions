//Write a program that prints the product of the first ten positive integers, 1 × 2 × … × 10.
//(Use  * for multiplication in C++.)

#include<iostream>

using namespace std;

int main()
{
    int sum = 1;
    for (int i = 1; i <= 10; i++)
    {
        sum *= i;
    }

    cout << sum << "\n";

    return 0;
}
