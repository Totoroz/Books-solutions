//Write a program that reads a word and prints the word in reverse.For example, if the
//user provides the input  "Harry", the program prints
//yrraH

#include<iostream>

using namespace std;

int main()
{
    cout << "Enter a word: ";
    string word;
    cin >> word;

    for(int i = word.length() - 1; i >= 0 ; i--)
    {
        cout << word.substr(i, 1);
    }

    return 0;
}
