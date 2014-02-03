//The Fibonacci numbers
//Reformulate that as
//fold1 = 1;
//fold2 = 1;
//fnew = fold1 + fold2;
//After that, discard  fold2, which is no longer needed, and set  fold2 to  fold1 and  fold1 to
//fnew.Repeat  fnew an appropriate number of times.
//Implement a program that computes the Fibonacci numbers in that way.

#include<iostream>

using namespace std;

// not the most optimal way of doing this, but this is the exercise's goal
int main()
{
    cout << "Number: ";
    int number;
    cin >> number;

    int fold1 = 1;
    int fold2 = 1;
    int fnew;
    if(number < 3 && number > 0 )
    {
        fold1 = 1;
        fold2 = 1;
        fnew = fold1;

    }

    else if(number >= 3)
    {
       for(int i = 0; i < number; i++)
        {
            fnew = fold1 + fold2;

            fold1 = fold2;
            fold2 = fnew;
        }
    }
    cout << "Fibonacci number: " << fnew;

    return 0;
}
