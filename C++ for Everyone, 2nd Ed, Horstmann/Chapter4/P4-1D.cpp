//Write programs with loops that compute
//d.The sum of all odd numbers between  a and  b(inclusive), where  a and  b are
//inputs.

#include<iostream>

using namespace std;

int main()
{
    cout << "Range a-b\n";
    cout << "Enter a: ";
    int a;
    cin >> a;


    cout << "Enter b: ";
    int b;
    cin >> b;

    double sum = 0;
    for(int i = a; i <= b; i++)
    {
        if(a % 2 == 1)
        {
            sum += i;
        }
    }

    cout << "Sum of all odd numbers from " << a << " to " << b << " = " << sum;

    return 0;
}
