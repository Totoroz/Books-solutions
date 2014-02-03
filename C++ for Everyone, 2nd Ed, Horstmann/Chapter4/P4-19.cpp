//Factoring of integers.Write a program that asks the user for an integer and then
//prints out all its factors.For example, when the user enters 150, the program should
//print
//2
//3
//5
//5

#include <iostream>

using namespace std;

int main()
{
   cout << "Enter an integer: ";
   int num;
   cin >> num; // 65

   int i = 2;

   while (i <= num) // 2 <= 65 y
   {
      if (num % i == 0) // % = 1
      {
         cout << i << endl;
         num = num / i;
      }
      else
      {
         i++;
      }
   }

   return 0;
}
