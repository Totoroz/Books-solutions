//Complete the program in How To 4.1 on page 162. Your program should read twelve
//temperature values and print the month with the highest temperature.

#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main()
{
    cout << "Enter twelve temperatures: ";
    vector<double> temperatures;

    vector<string> months = {"January", "February", "March", "April", "May", "June",
                             "July", "August", "September", "October", "Notemperaturesember", "December"};


    for(int i = 0; i < 12; i++)
    {
        double input;
        cin >> input;
        temperatures.push_back(input);

        if(cin.fail())
        {
            cout << "Stopping input.\n";
        }
    }

    double lowest = *min_element(temperatures.begin(),temperatures.end());
    double highest = *max_element(temperatures.begin(),temperatures.end());

    // http://stackoverflow.com/questions/15099707/how-to-get-position-of-a-certain-element-in-strings-vector-to-use-it-as-an-inde
    int posLowest = find(temperatures.begin(), temperatures.end(), lowest) - temperatures.begin();
    int posHighest = find(temperatures.begin(), temperatures.end(), highest) - temperatures.begin();

    cout << "Min temperature is " << lowest << " in month: " << months[posLowest] << endl;
    cout << "Max temperature is " << highest << " in month: " << months[posHighest] << endl;


    return 0;
}
