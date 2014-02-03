//Write a program that helps a person decide whether to buy a hybrid car.Your
//pro gram’s inputs should be :
//• The cost of a new car
//• The estimated miles driven per year
//• The estimated gas price
//• The estimated resale value after 5 years
//Compute the total cost of owning the car
//for 5 years. (For simplic ity, we will not take
//	the cost of financing into account.) Obtain
//	realistic prices for a new and used hybrid and
//	a comparable car from the Web.Run your
//	program twice, using today’s gas price and 15, 000 miles per year.Include pseudo -
//	code and the program runs with your assignment.

#include <iostream>
#include <iomanip>

using namespace std;
int main()
{
   cout << "Enter the cost of the car: ";
   double cost;
   cin >> cost;

   cout << "Enter number of miles driven per year: ";
   int miles;
   cin >> miles;

   cout << "Enter estimated gas price: ";
   double gas_price;
   cin >> gas_price;

   cout << "Estimated resale value after 5 years: ";
   double resale;
   cin >> resale;

   double cost_to_own = cost + (5 * miles * gas_price);

   cout << setprecision(2) << fixed
      << "Total cost to own for 5 years is $"
      << cost_to_own << "." << endl;
   cout << "Cost after resale is $"
      << (cost_to_own - resale) << "." << endl;

   return 0;
}
