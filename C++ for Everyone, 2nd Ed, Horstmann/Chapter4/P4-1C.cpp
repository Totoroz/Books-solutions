//Write programs with loops that compute
//All powers of 2 from 2 0superscript up to 2 20superscript

#include<iostream>
#include<cmath>

using namespace std;

int main()
{
    for(int i = 0; i <= 20; i++)
    {
        cout << "2^" << i << " = " << pow(2,i) << "\n";
    }

    return 0;
}
