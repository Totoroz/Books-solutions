//Translate the following pseudocode for finding the minimum value from a set of
//inputs into a C++ program.
//Set a Boolean variable "first" to true.
//While another value has been read successfully
//If first is true
//Set the minimum to the value.
//Set first to false.
//Else if the value is less than the minimum
//Set the minimum to the value.
//Print the minimum.

#include<iostream>

using namespace std;

int main()
{
    bool first = true;

    cout << "Enter numbers: ";
    double input;


    double minimum;

    while(cin >> input)
    {
        if(first == true)
        {
            minimum = input;
            first = false;
        }

        else if(input < minimum)
        {
            minimum = input;
        }

    }
    cout << "Minimum: " << minimum;-0

    return 0;
}
