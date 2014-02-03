//Write a program that prints a multiplication table, like this:
//1 2 3 4 5 6 7 8 9 10
//2 4 6 8 10 12 14 16 18 20
//3 6 9 12 15 18 21 24 27 30
//...
//10 20 30 40 50 60 70 80 90 100

#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
   for (int i = 1; i <= 10; i++)
   {
      for (int j = 1; j <= 10; j++)
      {
         // Set the width to 4 for each entry
         cout << setw(4) << i * j;
      }
      cout << endl;
   }

   return 0;
}
