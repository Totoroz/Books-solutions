//Write a program that reads a word and prints each character of the word on a sepa -
//rate line.For example, if the user provides the input  "Harry", the program prints
//H
//a
//r
//r
//y

#include<iostream>

using namespace std;

int main()
{
    cout << "Enter a word: ";
    string word;
    cin >> word;

    for(int i = 0; i < word.length(); i++)
    {
        cout << word.substr(i, 1) << "\n";
    }

    return 0;
}
