//Improve the program discussed in the How To 2.1 to allow input of quarters in
//addition to bills.

#include <iostream>
#include <iomanip>

using namespace std;
int main()
{
   const int PENNIES_PER_DOLLAR = 100;
   const int PENNIES_PER_QUARTER = 25;

   cout << "Enter value "
      << "(0.25 = quarter, 1.25 = $1.25, 5 = $5 bill, etc.): ";
   double cash_value;
   cin >> cash_value;

   cout << "Enter item price in pennies: ";
   int item_price;
   cin >> item_price;

   int amount_due = PENNIES_PER_DOLLAR * cash_value - item_price;
   int dollar_coins = amount_due / PENNIES_PER_DOLLAR;
   amount_due = amount_due % PENNIES_PER_DOLLAR;
   int quarters = amount_due / PENNIES_PER_QUARTER;
   cout << "Dollar coins: " << setw(6) << dollar_coins << endl
      << "Quarters:     " << setw(6) << quarters << endl;
   return 0;
}
