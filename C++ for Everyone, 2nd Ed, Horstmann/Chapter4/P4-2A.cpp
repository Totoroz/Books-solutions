//Write programs that read a sequence of integer inputs and print
//a.The smallest and largest of the inputs

#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main()
{
    cout << "Enter integer numbers. If you enter a non-digit it stops!";
    vector<int> numbers;

    bool exit = false;

    while(!exit)
    {
        int input;
        cin >> input;
        numbers.push_back(input);

        if(cin.fail())
        {
            exit = true;
            cout << "Stopping input.";
        }
    }

    // fucking magical code a.k.a C++11. To understand it:
    // http://stackoverflow.com/questions/10158756/using-stdmax-element-on-a-vectordouble
    auto smallest = *min_element(begin(numbers), end(numbers));
    auto biggest =  *max_element(begin(numbers), end(numbers));


    cout << "The smallest input is: " << smallest << "\n";
    cout << "The largest input is: " << biggest << "\n";
    return 0;
}
