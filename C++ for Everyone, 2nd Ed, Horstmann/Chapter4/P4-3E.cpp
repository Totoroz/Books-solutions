//Write programs that read a line of input as a string and print
//e.The positions of all vowels in the string.

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

    int nVowels = 0;
    for(int i = 0; i < input.length(); i++)
    {
        if(inputCstyle[i] == 'A' || inputCstyle[i] == 'a' || inputCstyle[i] == 'E' || inputCstyle[i] == 'e' || inputCstyle[i] == 'O' || inputCstyle[i] == 'o' || inputCstyle[i] == 'U' || inputCstyle[i] == 'u' || inputCstyle[i] == 'I' || inputCstyle[i] == 'i')
        {
            cout << "Vowel at [" << i << "]" << "\n";
        }
    }
    return 0;
}
