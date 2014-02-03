//Write a program that prints the balance of an account that earns 5 percent interest
//per year after the first, second, and third year.

#include<iostream>

using namespace std;

int main()
{
    cout << "What's your principal?\n";
    double principal;
    cin >> principal;

    cout << "What is your interest per year? (write it in percent, ex: 5% = 5\n";
    double rate;
    cin >> rate;
    rate /= 100;

    cout << "For how much time do you want to calculate the interest?\n";
    double time;
    cin >> time;

    double interest = principal * rate  * time;
    cout << "Interest = Principal(" << principal << ") x Rate(" << rate << ") x Time(" << time << ")\n";
    cout << "Interest = " << interest << "\n";


    double returnAmount = principal + interest;
    cout << "Your must return principal(" << principal << ") + interest (" << interest << ")\n";
    cout << "Return the amount <" << returnAmount << ">";


    return 0;
}
