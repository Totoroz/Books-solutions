//Write a program that reads a word and prints the number of syllables in the word.
//For this exercise, assume that syllables are determined as follows : Each sequence of
//vowels  a e i o u y, except for the last  e in a word, is a vowel.However, if that algo -
//rithm yields a count of 0, change it to 1. For example,
//Word Syllables
//Harry 2
//hairy 2
//hare 1
//the  1

#include <iostream>
#include <string>

using namespace std;

int main()
{
   cout << "Enter a word: ";
   string word;
   cin >> word;

   bool last_vowel = false;
   bool last_cons = false;
   bool curr_vowel = false;
   bool curr_cons = false;

   int syllable_count = 0;

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
         curr_vowel = true;
         curr_cons = false;
      }
      else
      {
         curr_vowel = false;
         curr_cons = true;
      }

      // Increment the syllable count any time we
      // transition from a vowel to a consonant
      if (curr_cons && last_vowel)
      {
         syllable_count++;
      }

      last_vowel = curr_vowel;
      last_cons = curr_cons;
   }

   // Check the last letter in word.
   string last = word.substr(word.length() - 1, 1);

   // Add one for an ending vowel that is not an "e"
   if(last == "a" || last == "i" || last == "o" ||
       last == "u" || last == "y" || last == "A" ||
       last == "I" || last == "O" || last == "U" ||
       last == "Y")
   {
      syllable_count++;
   }

   // There has to be at least one syllable
   if (syllable_count == 0)
   {
      syllable_count = 1;
   }

   cout << "There were " << syllable_count << " syllables." << endl;

   return 0;
}
