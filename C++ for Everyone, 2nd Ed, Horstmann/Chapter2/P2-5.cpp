//Write a program that prompts the user for two integers and then prints
//• The distance(absolute value of the difference)
//• The maximum(the larger of the two)
//• The minimum(the smaller of the two)

#include<iostream>
#include<cmath>
#include<algorithm>


using namespace std;

int main()
{
    int n1,n2;

    cout << "Enter two integers: ";
    cin >> n1 >> n2;

    int nDifference = abs(n1-n2);

    cout << "Difference betwen " << n1 << " and " << n2 << " is " << nDifference;
    cout << "\nMax of " << n1 << " and " << n2 << " is " << max(n1,n2);
    cout << "\nMin of " << n1 << " and " << n2 << " is " << min(n1,n2);

    return 0;
}
