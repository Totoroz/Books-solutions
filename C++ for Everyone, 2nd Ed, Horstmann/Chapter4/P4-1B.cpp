//Write programs with loops that compute
//b.The sum of all squares between 1 and 100 (inclusive).

#include<iostream>

using namespace std;

int main()
{
    int sum = 1;
    for(int i = 1; i <= 100; i++)
    {
        sum += i*i;
    }
    cout << "The sum of all squares between 1 and 100(inclusive) is:" << sum;
    return 0;
}
