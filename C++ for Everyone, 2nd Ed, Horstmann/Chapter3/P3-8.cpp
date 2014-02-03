//Repeat Exercise P3.7, but before reading the numbers, ask the user whether increas -
//ing / decreasing should be “strict” or “lenient”.In lenient mode, the sequence 3 4 4 is
//increasing and the sequence 4 4 4 is both increasing and decreasing.

#include<iostream>

using namespace std;

int main()
{
    cout << "Enter three numbers: ";
    float n1, n2, n3;
    cin >> n1 >> n2 >> n3;

    cout << "Should increasing/decreasing be \"strict\" or \"lenient\"?: ";
    string order;
    cin >> order;

    if(order == "strict")
    {
        if (n1 < n2 && n2 < n3 )
        {
            cout << "Increasing order.\n";
        }

        else if (n1 > n2 && n2 > n3)
        {
            cout << "Decreasing order.\n";
        }

        else
        {
            cout << "Neither.\n";
        }
    }

    if(order == "lenient")
    {
        if (n1 < n2 && (n2 < n3 || n2 == n3))
        {
            cout << "Increasing order.\n";
        }

        else if (n1 > n2 && (n2 > n3 || n2 == n3))
        {
            cout << "Decreasing order.\n";
        }

        else if (n1 == n2 && n2 == n3)
        {
            cout << "Both increasing and decreasing.\n";
        }
    }

    return 0;
}
