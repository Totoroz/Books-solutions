Write a program to simulate a bank transaction.There are two bank accounts : check -
ing and savings.First, ask for the initial balances of the bank accounts; reject negative
balances.Then ask for the transactions; options are deposit, withdrawal, and trans -
fer.Then ask for the account; options are checking and savings.Then ask for the
amount; reject transactions that overdraw an account.At the end, print the balances
of both accounts.

#include<iostream>

using namespace std;

// function prototypes
void initialBalance(double &account);
void depositSum(double &account);
void withdrawSum(double &account);


int main()
{
    cout << "Initial balances of the bank accounts(checkings & savings):";
    double dCheckings;
    double dSavings;

    initialBalance(dCheckings);
    initialBalance(dSavings);

    cout << "Choose a transaction. 1) Deposit, 2) Withdrawal, 3) Transfer: ";
    int choice;
    cin >> choice;

    switch(choice)
    {
        case 1:
            {
                cout << "To which account?(Checkings or Savings): ";
                string choice1;
                cin >> choice1;

                if(choice1 == "Savings")
                {
                    depositSum(dSavings);
                }

                else if(choice1 == "Checkings")
                {
                    depositSum(dCheckings);
                }

                else
                {
                    cout << "Invalid choice\n";
                }
                break;
            }

        case 2:
            {
                cout << "From which account?(Checkings or Savings): ";
                string choice2;
                cin >> choice2;

                if(choice2 == "Savings")
                {
                    withdrawSum(dSavings);
                }

                else if(choice2 == "Checkings")
                {
                    withdrawSum(dCheckings);
                }

                else
                {
                    cout << "Invalid choice\n";
                }
                break;
            }

        case 3:
            {
                cout << "From which account?(Checkings or Savings):";
                string choice3;
                cin >> choice3;

                if(choice3 == "Savings")
                {
                    dCheckings += dSavings;
                }

                else if(choice3 == "Checkings")
                {
                    dSavings += dCheckings;
                }

                else
                {
                    cout << "Invalid choice\n";
                }
                break;
            }

        default:
            cout << "Invalid choice.\n";

    }

    cout << "Balance of Checkings: " << dCheckings << "\n";
    cout << "Balance of Savings: " << dSavings << "\n";

    return 0;
}

void initialBalance(double &account)
{
    double amount;

    do
    {
        cin >> amount;
    } while (amount < 0);

    account = amount;
}

void depositSum(double &account)
{
    cout << "How much?(less than 0 is invalid): ";
    double amount;
    do
    {
        cin >> amount;
    } while (amount < 0);

    account += amount;
}
void withdrawSum(double &account)
{
    cout << "How much?(less than 0 is invalid): ";
    double amount;

    do
    {
        cin >> amount;
    } while (amount < 0);

    if(amount > account)
    {
        cout << "Overdraw!";
        return;
    }

    else
    {
        account -= amount;
    }
}
