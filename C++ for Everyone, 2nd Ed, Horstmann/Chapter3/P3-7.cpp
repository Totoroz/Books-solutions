//Write a program that reads three numbers and prints “ increasing ” if they are in
//increasing order, “ decreasing ” if they are in decreasing order, and “ neither ” other -
//wise.Here, “increasing” means “strictly increasing”, with each value larger than its
//pre decessor.The sequence 3 4 4 would not be considered increasing.

#include<iostream>

using namespace std;

int main()
{
    cout << "Enter three numbers: ";
    float n1, n2, n3;
    cin >> n1 >> n2 >> n3;

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

    return 0;
}
