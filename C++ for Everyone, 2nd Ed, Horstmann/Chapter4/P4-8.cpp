//Write a program that reads a set of floating - point values.Ask the user to enter the
//values, then print
//• the average of the values.
//• the smallest of the values.
//• the largest of the values.
//• the range, that is the difference between the smallest and largest.
//Of course, you may only prompt for the values once.

#include<iostream>
#include<vector>
#include<cfloat> // for the smallest and largest value function, a float can take
#include<cmath>

using namespace std;

int main()
{
    cout << "Enter floating-point values: ";
    bool exit = false;
    float total = 0;
    int count = 0;

    float largest = FLT_MIN;
    float smallest = FLT_MAX;
    while(!exit)
    {
        float input;
        cin >> input;

        if(cin.fail())
        {
            cout << "Stopping the input.";
            exit = true;
            break;
        }

        if(input < smallest);
        {
            smallest = input;
        }

        if(input > largest)
        {
            largest = input;
        }

        total += input;
        count++;
    }

    float average = total / count;

    cout << "The average is: " << average << "\n";
    cout << "The largest is: " << largest << "\n";
    cout << "The smallest is: " << smallest << "\n";
    cout << "The range between largest and smallest is: " << abs(largest - smallest) << "\n";


    return 0;
}
