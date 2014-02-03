//Write programs with loops that compute
//a.The sum of all even numbers between 2 and 100 (inclusive).

#include<iostream>

using namespace std;

int main()
{
    int sum = 0;
    for(int i = 2; i <= 100; i += 2)
    {
        sum += i;
    }
    cout << "The sum of all even numbers between 2 and 100 is:" << sum;
    return 0;
}
