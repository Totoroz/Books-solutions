//Prime numbers.Write a program that prompts the user for an integer and then prints
//out all prime numbers up to that integer.For example, when the user enters 20, the
//program should print
//2
//3
//5
//7
//11
//13
//17
//19
//Recall that a number is a prime number if it is not divisible by any number except 1
//and itself.

#include <iostream>
#include <cmath>

using namespace std;

int main()
{
   cout << "Enter an integer - all prime numbers up to this number "
        << "will be displayed: ";
   int num;
   cin >> num;

   int i = 2;

   while (i <= num)
   {
      if (i == 2 || i == 3)
      {
         cout << i << endl;
      }
      else
      {
         bool prime = true;
         int limit = static_cast<int>(sqrt(static_cast<double>(i)));

         for (int j = 2; j <= limit; j++)
         {
            if (i % j == 0)
            {
               prime = false;
            }
         }

         if (prime)
         {
            cout << i << endl;
         }
      }
      i++;
   }

   return 0;
}
