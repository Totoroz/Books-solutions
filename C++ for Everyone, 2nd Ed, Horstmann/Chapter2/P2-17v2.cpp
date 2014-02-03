//Write a program that reads a number between 1, 000 and 999, 999 from the user and
//prints it with a comma separating the thousands.Here is a sample dialog; the user
//input is in color :
//Please enter an integer between 1000 and 999999 : 23456
//23, 456

#include <iostream>

using namespace std;

int main()
{
    cout << "Please enter an integer between 1000 and 999999 (no commas): ";
    int num;
    cin >> num; //1054


    int first_part = num / 1000; //1

    int ones_dig = num % 10; //4

    num = num - ones_dig; //num = 1054 - 4 => 1051

    int tens_dig = num % 100 / 10; //tens_dig = 51 / 10 = 5

    num = num - tens_dig * 10; //num = 1051 - 5 * 10 = 1001

    int hund_dig = num % 1000 / 100; //hund_dig = 1 / 100 = 0

    cout << first_part << "," << hund_dig << tens_dig << ones_dig;

    return 0;
}

