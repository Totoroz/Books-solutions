//Write a program that reads in three strings and sorts them lexicographically.
//Enter three strings : Charlie Able Baker
//Able
//Baker
//Charlie

#include<iostream>

using namespace std;

int main()
{
    string s1, s2, s3;

    cout << "Enter three strings: ";
    cin >> s1 >> s2 >> s3;

    if(s1 < s2 && s1 < s3)
    {
        cout << s1 << "\n";

        if(s2 < s3)
        {
            cout << s2 << "\n";
            cout << s3 << "\n";
        }
        else
        {
            cout << s3 << "\n";
            cout << s2 << "\n";
        }
    }

    else if(s1 > s2 && s2 < s3)
    {
        cout << s2 << "\n";

        if(s1 < s3)
        {
            cout << s1 << "\n";
            cout << s3 << "\n";
        }

        else
        {
            cout << s3 << "\n";
            cout << s1 << "\n";
        }
    }

    else
    {
        cout << s3 << "\n";

        if(s1 < s2)
        {
            cout << s1 << "\n";
            cout << s2 << "\n";
        }

        else
        {
            cout << s2 << "\n";
            cout << s1 << "\n";
        }
    }

    return 0;
}
