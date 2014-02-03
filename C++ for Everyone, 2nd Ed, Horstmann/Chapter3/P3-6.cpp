//Write a program that reads three numbers and prints “ all the same ” if they are all the
//same, “ all different ” if they are all different, and “ neither ” otherwise.

#include<iostream>

using namespace std;

int main()
{
    float n1, n2, n3;
    cout << "Enter three numbers to compare: ";
    cin >> n1 >> n2 >> n3;

    if (n1 == n2 && n1 == n3 && n2 == n3)
    {
        cout << "All the same.\n";
    }

    else if (n1 != n2 && n1 != n3 && n2 != n3)
    {
        cout << "All different.\n";
    }

    else
    {
        cout << "Neither.\n";
    }

    return 0;
}
