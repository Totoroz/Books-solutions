//Write a program that prints the sum of the first ten positive integers, 1 + 2 + … + 10.

#include<iostream>

using namespace std;

int main()
{
    int sum = 0;
    for (int i = 1; i <= 10; i++)
    {
        sum += i;
    }

    cout << sum << "\n";

    return 0;
}
