//Write a program that prompts the user for two integers and then prints
//• The sum
//• The difference
//• The product
//• The average

#include<iostream>
#include<cmath>
using namespace std;

int main()
{
    int number1;
    int number2;

    cout << "Enter number 1 and number 2\n";
    cin >> number1 >> number2;

    cout << "Type:\n 1 => sum, \n 2 => difference,\n 3 => product \n 4=> average\n";
    int user_input;
    cin >> user_input;

    double result = 0;
    switch(user_input)
        {
        case 1:
            result = number1 + number2;
            break;

        case 2:
            result = number1 - number2;
            break;

        case 3:
            result = number1 * number2;
            break;

        case 4:
            result = (number1 + number2) / 2;
            break;
        default:
            cout << "Invalid input\n";
        }

    cout << result;


    return 0;
}
