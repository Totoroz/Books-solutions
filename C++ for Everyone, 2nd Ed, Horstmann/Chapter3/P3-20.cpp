//The  tax.cpp program uses a simplified version of the 2008 U.S.income tax schedule.
//Look up the tax brackets and rates for the current year, for both single and married
//filers, and implement a program that computes the actual income tax.

#include <iostream>
#include <string>

using namespace std;

int main()
{
   const double RATE1 = 0.10;
   const double RATE2 = 0.15;
   const double RATE3 = 0.25;
   const double RATE4 = 0.28;
   const double RATE5 = 0.33;
   const double RATE6 = 0.35;

   const double RATE1_SINGLE_LIMIT = 8375;
   const double RATE2_SINGLE_LIMIT = 34000;
   const double RATE3_SINGLE_LIMIT = 82400;
   const double RATE4_SINGLE_LIMIT = 171850;
   const double RATE5_SINGLE_LIMIT = 373650;

   const double RATE1_MARRIED_LIMIT = 16750;
   const double RATE2_MARRIED_LIMIT = 68000;
   const double RATE3_MARRIED_LIMIT = 137300;
   const double RATE4_MARRIED_LIMIT = 209250;
   const double RATE5_MARRIED_LIMIT = 373650;

   double tax1 = 0;
   double tax2 = 0;
   double tax3 = 0;
   double tax4 = 0;
   double tax5 = 0;
   double tax6 = 0;

   double income;
   cout << "Please enter your income: ";
   cin >> income;

   cout << "Please enter s for single, m for married: ";
   string marital_status;
   cin >> marital_status;

   if (marital_status == "s")
   {
      if (income <= RATE1_SINGLE_LIMIT)
      {
         tax1 = RATE1 * income;
      }
      else if (income <= RATE2_SINGLE_LIMIT)
      {
         tax1 = RATE1 * RATE1_SINGLE_LIMIT;
         tax2 = RATE2 * (income - RATE1_SINGLE_LIMIT);
      }
      else if (income <= RATE3_SINGLE_LIMIT)
      {
         tax1 = RATE1 * RATE1_SINGLE_LIMIT;
         tax2 = RATE2 * (RATE2_SINGLE_LIMIT - RATE1_SINGLE_LIMIT);
         tax3 = RATE3 * (income - RATE2_SINGLE_LIMIT);
      }
      else if (income <= RATE4_SINGLE_LIMIT)
      {
         tax1 = RATE1 * RATE1_SINGLE_LIMIT;
         tax2 = RATE2 * (RATE2_SINGLE_LIMIT - RATE1_SINGLE_LIMIT);
         tax3 = RATE3 * (RATE3_SINGLE_LIMIT - RATE2_SINGLE_LIMIT);
         tax4 = RATE4 * (income - RATE3_SINGLE_LIMIT);
      }
      else if (income <= RATE5_SINGLE_LIMIT)
      {
         tax1 = RATE1 * RATE1_SINGLE_LIMIT;
         tax2 = RATE2 * (RATE2_SINGLE_LIMIT - RATE1_SINGLE_LIMIT);
         tax3 = RATE3 * (RATE3_SINGLE_LIMIT - RATE2_SINGLE_LIMIT);
         tax4 = RATE4 * (RATE4_SINGLE_LIMIT - RATE3_SINGLE_LIMIT);
         tax5 = RATE5 * (income - RATE4_SINGLE_LIMIT);
      }
      else
      {
         tax1 = RATE1 * RATE1_SINGLE_LIMIT;
         tax2 = RATE2 * (RATE2_SINGLE_LIMIT - RATE1_SINGLE_LIMIT);
         tax3 = RATE3 * (RATE3_SINGLE_LIMIT - RATE2_SINGLE_LIMIT);
         tax4 = RATE4 * (RATE4_SINGLE_LIMIT - RATE3_SINGLE_LIMIT);
         tax5 = RATE5 * (RATE5_SINGLE_LIMIT - RATE4_SINGLE_LIMIT);
         tax6 = RATE6 * (income - RATE5_SINGLE_LIMIT);
      }
   }
   else
   {
      if (income <= RATE1_MARRIED_LIMIT)
      {
         tax1 = RATE1 * income;
      }
      else if (income <= RATE2_MARRIED_LIMIT)
      {
         tax1 = RATE1 * RATE1_MARRIED_LIMIT;
         tax2 = RATE2 * (income - RATE1_MARRIED_LIMIT);
      }
      else if (income <= RATE3_MARRIED_LIMIT)
      {
         tax1 = RATE1 * RATE1_MARRIED_LIMIT;
         tax2 = RATE2 * (RATE2_MARRIED_LIMIT - RATE1_MARRIED_LIMIT);
         tax3 = RATE3 * (income - RATE2_MARRIED_LIMIT);
      }
      else if (income <= RATE4_MARRIED_LIMIT)
      {
         tax1 = RATE1 * RATE1_MARRIED_LIMIT;
         tax2 = RATE2 * (RATE2_MARRIED_LIMIT - RATE1_MARRIED_LIMIT);
         tax3 = RATE3 * (RATE3_MARRIED_LIMIT - RATE2_MARRIED_LIMIT);
         tax4 = RATE4 * (income - RATE3_MARRIED_LIMIT);
      }
      else if (income <= RATE5_MARRIED_LIMIT)
      {
         tax1 = RATE1 * RATE1_MARRIED_LIMIT;
         tax2 = RATE2 * (RATE2_MARRIED_LIMIT - RATE1_MARRIED_LIMIT);
         tax3 = RATE3 * (RATE3_MARRIED_LIMIT - RATE2_MARRIED_LIMIT);
         tax4 = RATE4 * (RATE4_MARRIED_LIMIT - RATE3_MARRIED_LIMIT);
         tax5 = RATE5 * (income - RATE4_MARRIED_LIMIT);
      }
      else
      {
         tax1 = RATE1 * RATE1_MARRIED_LIMIT;
         tax2 = RATE2 * (RATE2_MARRIED_LIMIT - RATE1_MARRIED_LIMIT);
         tax3 = RATE3 * (RATE3_MARRIED_LIMIT - RATE2_MARRIED_LIMIT);
         tax4 = RATE4 * (RATE4_MARRIED_LIMIT - RATE3_MARRIED_LIMIT);
         tax5 = RATE5 * (RATE5_MARRIED_LIMIT - RATE4_MARRIED_LIMIT);
         tax6 = RATE6 * (income - RATE5_MARRIED_LIMIT);
      }
   }

   double total_tax = tax1 + tax2 + tax3 + tax4 + tax5 + tax6;
   cout << "The tax is $" << total_tax << endl;

   return 0;
}

