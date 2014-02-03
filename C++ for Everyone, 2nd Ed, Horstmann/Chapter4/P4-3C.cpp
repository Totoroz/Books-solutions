//Write programs that read a line of input as a string and print
//c.The string, with all vowels replaced by an underscore.

#include<iostream>
#include<vector>

using namespace std;

int main()
{
    cout << "Enter a string: ";
    string input;
    getline(cin, input);

    vector<char> inputCstyle (input.length() + 1);
    copy(input.begin(), input.end(), inputCstyle.begin());

    for(int i = 0; i < input.length() + 1; i++)
    {
        if(inputCstyle[i] == 'A' || inputCstyle[i] == 'a' || inputCstyle[i] == 'E' || inputCstyle[i] == 'e' || inputCstyle[i] == 'O' || inputCstyle[i] == 'o' || inputCstyle[i] == 'U' || inputCstyle[i] == 'u' || inputCstyle[i] == 'I' || inputCstyle[i] == 'i')
        {
            inputCstyle[i] = '_';
        }
    }

    for(int j = 0; j < input.length() + 1; j++)
    {
        cout << inputCstyle[j];
    }

    return 0;
}
