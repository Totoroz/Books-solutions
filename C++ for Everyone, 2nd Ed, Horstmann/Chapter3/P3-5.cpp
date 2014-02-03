//Write a program that reads an integer and prints how many digits the number has, by
//checking whether the number is ? 10, ? 100, and so on. (Assume that all integers are
//less than ten billion.) If the number is negative, first multiply it with –1.

#include<iostream>

using namespace std;

int main()
{
    int input;
    cout << "Enter an integer: ";
    cin >> input;

    // avoid checking if it's >=0 && <= 10
    int digits = 1;

    if(input < 0)
    {
        input *= -1;
    }

    if(input >= 10 && input < 100 )
    {
        digits = 2;
    }

    else if(input >= 100 && input < 1000)
    {
        digits = 3;
    }

    else if(input >= 1000 && input < 10000)
    {
        digits = 4;
    }

    else if(input >= 10000 && input < 100000)
    {
        digits = 5;
    }

    else if(input >= 100000 && input < 1000000)
    {
        digits = 6;
    }

    else if(input >= 1000000 && input < 10000000)
    {
        digits = 7;
    }

    else if(input >= 10000000 && input < 100000000)
    {
        digits = 8;
    }

    else if(input >= 100000000 && input < 1000000000)
    {
        digits = 9;
    }

    else if(input >= 1000000000 && input < 10000000000)
    {
        digits = 10;
    }

    else if(input >= 10000000000 && input < 100000000000)
    {
        digits = 11;
    }

    else
    {
        cout << "Input is greater than 10 billion.";
        return 0;
    }

    cout << "Your input has " << digits << "\n";

    return 0;
}
