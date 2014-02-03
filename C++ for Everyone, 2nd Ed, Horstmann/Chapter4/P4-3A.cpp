//Write programs that read a line of input as a string and print
//a.Only the uppercase letters in the string.

#include<iostream>
#include<cstring>

using namespace std;

int main()
{
    cout << "Enter an input: ";
    string input;
    getline(cin, input);

    for(int i = 0; i < input.length(); i++)
    {
        char *cstr = new char[input.length() + 1];
        strcpy(cstr, input.c_str());

        if(cstr[i] >= 65 && cstr[i] <= 90)
        {
            cout << cstr[i] << "\n";
        }
    }
    return 0;
}
