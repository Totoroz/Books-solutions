//Write programs that read a line of input as a string and print
//b.Every second letter of the string.

#include<iostream>

using namespace std;

int main()
{
    cout << "Enter a string: ";
    string input;
    getline(cin, input);

    for(int i =0; i < input.length(); i += 2)
    {
        cout << input.substr(i, 1);
    }

    return 0;
}
