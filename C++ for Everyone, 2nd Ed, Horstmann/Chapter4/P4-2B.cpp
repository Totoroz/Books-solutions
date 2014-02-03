//Write programs that read a sequence of integer inputs and print
//b.The number of even and odd inputs.

#include<iostream>
#include<vector>

using namespace std;

int main()
{
    cout << "Enter numbers: ";
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
            // removes the faulty input so it doesn't get added to the odd/even counting
            numbers.pop_back();
        }
    }

    int odd = 0;
    int even = 0;

    for(int i = 0; i < numbers.size(); i++)
    {
        if(numbers[i] % 2 == 0)
        {
            even++;
        }

        else
        {
            odd++;
        }
    }


    // sugar-coating, not mandatory but looks better!
    if(odd != 1)
    {
        cout << "There are " << odd << " odd numbers\n";
    }

    else
    {
        cout << "There is " << odd << " odd number\n";
    }

    if(even != 1)
    {
        cout << "There are " << even << " even numbers\n";
    }

    else
    {
        cout << "There is " << even << " even number\n";
    }

    return 0;
}
