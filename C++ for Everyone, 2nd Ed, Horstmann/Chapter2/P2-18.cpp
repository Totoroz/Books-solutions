//Write a program that reads a number between 1, 000 and 999, 999 from the user,
//where the user enters a comma in the input.Then print the number without a
//comma.Here is a sample dialog; the user input is in color :
//Please enter an integer between 1, 000 and 999, 999 : 23, 456
//23456
//Hint : Read the input as a string.Measure the length of the string.Suppose it contains
//	   n characters.Then extract substrings consisting of the first n – 4 characters and the
//	   last three characters.

#include <iostream>
#include <string>

using namespace std;

int main()
{
    cout << "Please enter an integer between 1,000 and 999,999 "
         << "using a comma after the thousands: ";
    string num;
    cin >> num;

    string first_part = num.substr(0, num.length() - 4);
    string second_part = num.substr(num.length() - 3, num.length());

    cout << first_part << second_part;

    return 0;
}
