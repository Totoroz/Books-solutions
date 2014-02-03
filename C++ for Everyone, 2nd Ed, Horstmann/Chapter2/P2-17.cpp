//Write a program that reads a number between 1, 000 and 999, 999 from the user and
//prints it with a comma separating the thousands.Here is a sample dialog; the user
//input is in color :
//Please enter an integer between 1000 and 999999 : 23456
//23, 456

#include<iostream>

using namespace std;

int main()
{
    cout << "Enter input between 1,000 and 999,999\n";
    string input;
    getline(cin, input);

    int n1 = input.length();
    string firstHalf = input.substr(0, n1-3);
    int n2 = firstHalf.length();
    string secondHalf = input.substr(n2, 3);

    string answer = firstHalf + "," + secondHalf;

    cout << answer;

    return 0;
}
