//Mean and standard deviation.Write a program that reads a set of floating - point data
//values.Choose an appropriate mechanism for prompting for the end of the data set.
//When all values have been read, print out the count of the values, the average, and
//the standard deviation.The average of a data set{ x 1, . . ., x n } is x x n
//i
//= ?, where
//? = ++x x x
//i n 1
//… is the sum of the input values.

#include <iostream>
#include <cmath>

using namespace std;

int main()
{
   int count = 0;
   double sum = 0;
   double sum_squares = 0;

   bool more = true;

   while (more)
   {
      cout << "Value: ";
      double value;
      cin >> value;
      if (cin.fail())
      {
         more = false;
      }
      else
      {
         count++;
         sum = sum + value;
			// sum_squares will hold the first term in the numerator
			// of the std dev formula below
         sum_squares = sum_squares + value * value;
      }
   }

   if (count <= 2)
   {
      return 0;
   }

	// Calculate the average the normal way
   double average = sum / count;

	// Calculate the second term in the numerator of the std dev formula
	double std_dev_avg = (sum * sum) / count;

   double stand_dev = sqrt((sum_squares - std_dev_avg) / (count - 1));

   cout << "There are " << count << " values." << endl
      << "The average is " << average
      << " and the standard deviation is "
      << stand_dev << endl;

   return 0;
}
