//Write a program that reads a word and prints the number of vowels in the word.For
//this exercise, assume that  a e i o u y are vowels.For example, if the user pro vides the
//input  "Harry", the program prints  2 vowels

#include <iostream>
#include <string>

using namespace std;

int main()
{
   int count = 0;

   cout << "Enter a word: ";
   string word;
   cin >> word;

   for(int i = 0; i < word.length(); i++)
   {
      string letter = word.substr(i, 1);

      if(letter == "a" || letter == "e" ||
          letter == "i" || letter == "o" ||
          letter == "u" || letter == "y" ||
          letter == "A" || letter == "E" ||
          letter == "I" || letter == "O" ||
          letter == "U" || letter == "Y")
      {
         count++;
      }
   }

   cout << "There were " << count << " vowels." << endl;

   return 0;
}
