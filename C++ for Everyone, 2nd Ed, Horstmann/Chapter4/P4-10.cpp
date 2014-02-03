//Translate the following pseudocode for randomly permuting the characters in a
//string into a C++ program.
//Read a word.
//Repeat word.length() times
//Pick a random position i in the word.
//Pick a random position j > i in the word.
//Swap the letters at positions j and i.
//Print the word.

#include<iostream>
#include<ctime>
#include<cstdlib>

using namespace std;

int main()
{
    cout << "Enter a word: ";
    string word;
    cin >> word;

    srand(time(0));

    string first;
    string middle;
    string last;

    for(int i = 0; i < word.length(); i++)
    {
        int a = rand() % word.length();

        int b = (a + 1) + rand() % (word.length() - (a + 1) + 1);

        if(a == 0)
        {
            first = "";
        }

        else
        {
            first = word.substr(0, a);
        }

        if(a == b - 1)
        {
            middle = "";
        }

        else
        {
            middle = word.substr(a + 1, b - (a + 1));
        }

        if(b == word.length())
        {
            last = "";
        }

        else
        {
            last = word.substr(b + 1, word.length() - b - 1);
        }


        word = first + word.substr(b, 1) + middle + word.substr(a, 1) + last;
    }

    cout << "\n" << word;

    return 0;
}
