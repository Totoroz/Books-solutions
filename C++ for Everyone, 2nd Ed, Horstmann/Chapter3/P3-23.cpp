//Roman numbers.Write a program that converts a positive integer into the Roman
//number system.The Roman number system has digits
//I 1
//V 5
//X 10
//L 50
//C 100
//D 500
//M 1, 000
//Numbers are formed according to the following rules. (1) Only numbers up to 3, 999
//are represented. (2) As in the decimal system, the thousands, hundreds, tens, and
//ones are expressed separately. (3) The num bers 1 to 9 are expressed as
//I 1
//II 2
//III  3
//IV 4
//V 5
//VI 6
//VII  7
//VIII  8
//IX  9
//As you can see, an I preceding a V or X is
//subtracted from the value, and you can
//never have more than three I’s in a row. (4)
//Tens and hundreds are done the same way,
//except that the let ters X, L, C and C, D, M
//are used instead of I, V, X, respec tively.
//Your program should take an input, such as
//1978, and convert it to Roman numerals,
//MCMLXXVIII.

#include <iostream>
#include <string>

using namespace std;

int main()
{
    cout << "Enter the whole number less than 4,000 "
        << "you wish to convert: ";
    int num;
    cin >> num;

    if (num <= 0)
    {
      cout << "Your number must be greater than zero.";
      return 1;
    }

    string roman = "";

    int digit = num / 1000;


    if (digit == 3)
    {
      roman = "MMM";
    }
    else if (digit == 2)
    {
      roman = "MM";
    }
    else if (digit == 1)
    {
      roman = "M";
    }

    num = num % 1000;
    digit = num / 100;

    if (digit == 9)
    {
      roman = roman + "CM";
    }
    else if (digit == 4)
    {
      roman = roman + "CD";
    }
    else
    {
      if (digit >= 5)
      {
         roman = roman + "D";
         digit = digit - 5;
      }
      if (digit == 3)
      {
         roman = roman + "CCC";
      }
      else if (digit == 2)
      {
         roman = roman + "CC";
      }
      else if (digit == 1)
      {
         roman = roman + "C";
      }
    }

    num = num % 100;
    digit = num / 10;

    if (digit == 9)
    {
      roman = roman + "XC";
    }
    else if (digit == 4)
    {
      roman = roman + "XL";
    }
    else
    {
      if (digit >= 5)
      {
         roman = roman + "L";
         digit = digit - 5;
      }
      if (digit == 3)
      {
         roman = roman + "XXX";
      }
      else if (digit == 2)
      {
         roman = roman + "XX";
      }
      else if (digit == 1)
      {
         roman = roman + "X";
      }
    }

    digit = num % 10;

    if (digit == 9)
    {
      roman = roman + "IX";
    }
    else if (digit == 4)
    {
      roman = roman + "IV";
    }
    else
    {
      if (digit >= 5)
      {
         roman = roman + "V";
         digit = digit - 5;
      }
      if (digit == 3)
      {
         roman = roman + "III";
      }
      else if (digit == 2)
      {
         roman = roman + "II";
      }
      else if (digit == 1)
      {
         roman = roman + "I";
      }
    }

    cout << "The roman numeral is  " << roman << endl;
    return 0;
}
