Write a program that reads in two floating - point numbers and tests whether they are
the same up to two decimal places.Here are two sample runs.
Enter two floating - point numbers : 2.0 1.99998
They are the same up to two decimal places.
Enter two floating - point numbers : 2.0 1.98999
They are different.

#include<iostream>
#include<cmath>

using namespace std;

int main()
{
    cout << "Enter two floating-point numbers: ";
    float n1, n2;
    cin >> n1 >> n2;

    if(abs(n1 - n2) <= 0.01)
    {
        cout << "They're the same.";
    }

    else
    {
        cout << "They're different.";
    }

    return 0;
}
