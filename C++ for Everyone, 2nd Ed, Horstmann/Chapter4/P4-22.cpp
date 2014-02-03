//Write a program that reads an integer and displays, using asterisks, a filled and
//hol low square, placed next to each other.For example if the side length is 5, the
//pro gram should display
//***** *****
//***** * *
//***** * *
//***** * *
//***** *****

#include <iostream>

using namespace std;

int main()
{
   cout << "Enter the length of the square side: ";
   int side;
   cin >> side;

   int line_num = 1;
   int dot_num = 1;

   for(int i = 0; i < side; i++)
   {
      dot_num = 1;

      // Print a line of first square
      for (int j = 0; j < side; j++)
      {
         cout << "*";
      }

      // Space between squares
      cout << " ";

      // Print a line of second square
      for(int j = 0; j < side; j++)
      {
         // If it's the first or last line, print
         // dots all the way
         if(line_num == 1 || line_num == side)
         {
            cout <<"*";
         }

         else // Dots and spaces printed
         {
            if(dot_num == 1 || dot_num == side)
            {
               cout <<  "*";
            }
            else
            {
               cout << " ";
            }
         }

         dot_num++;
      }

      line_num++;
      cout << endl;
   }

   return 0;
}
