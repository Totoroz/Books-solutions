//Write a program that reads a word and prints all substrings, sorted by length.For
//example, if the user provides the input  "rum", the program prints
//r
//u
//m
//ru
//um
//rum

#include <iostream>
#include <string>

using namespace std;

int main()
{
   cout << "Enter a word: ";
   string word;
   cin >> word;

   int word_len = word.length();

   int sub_len = 1;
   int start = 0;

   for (int i = 0; i < word_len; i++)
   {
      start = 0;

      while (start + sub_len <= word_len)
      {
         cout << word.substr(start, sub_len) << endl;
         start++;
      }
      sub_len++;
   }

   return 0;
}
