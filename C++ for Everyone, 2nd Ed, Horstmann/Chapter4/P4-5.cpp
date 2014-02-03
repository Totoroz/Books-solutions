//Credit Card Number Check.The last digit of a credit card number is the check digit,
//which protects against transcription errors such as an error in a single digit or
//switching two digits.The following method is used to verify actual credit card
//numbers but, for simplicity, we will describe it for numbers with 8 digits instead
//of 16:
//• Starting from the rightmost digit, form the sum of every other digit.For
//example, if the credit card number is 43589795, then you form the sum
//5 + 7 + 8 + 3 = 23.
//• Double each of the digits that were not included in the preceding step.Add all
//digits of the resulting numbers.For example, with the number given above,
//doubling the digits, starting with the next - to - last one, yields 18 18 10 8. Adding
//all digits in these values yields 1 + 8 + 1 + 8 + 1 + 0 + 8 = 27.
//• Add the sums of the two preceding steps.If the last digit of the result is 0, the
//number is valid.In our case, 23 + 27 = 50, so the number is valid.
//Write a program that implements this algorithm.The user should supply an 8 - digit
//number, and you should print out whether the number is valid or not.If it is not
//valid, you should print out the value of the check digit that would make the number
//valid.

#include <iostream>

using namespace std;

int main()
{
	int number;

	cout << "Please enter the 8-digit credit card number: ";
	cin >> number;

	// Pull out the individual digits of the credit card number.
	// Assume digit_0 is the left-most digit.
	int digit_7 = number % 10;  // This is the "check digit"
	number = number / 10;
	int digit_6 = number % 10;
	number = number / 10;
	int digit_5 = number % 10;
	number = number / 10;
	int digit_4 = number % 10;
	number = number / 10;
	int digit_3 = number % 10;
	number = number / 10;
	int digit_2 = number % 10;
	number = number / 10;
	int digit_1 = number % 10;
	number = number / 10;
	int digit_0 = number % 10;
	number = number / 10;

	// Process the number. Create the first part of validation.
	int first_part = digit_7 + digit_5 + digit_3 + digit_1;

	// Creating the second part. For each digit involved (the digits
	// in even locations), double it and then parse the doubled
	// number's digits
	int twice = 2 * digit_6;
	int second_part = 0;
	second_part = second_part + ((twice % 10) + (twice / 10));
	twice = 2 * digit_4;
	second_part = second_part + ((twice % 10) + (twice / 10));
	twice = 2 * digit_2;
	second_part = second_part + ((twice % 10) + (twice / 10));
	twice = 2 * digit_0;
	second_part = second_part + ((twice % 10) + (twice / 10));


	// Creating the total validation number
	int total = first_part + second_part;

	// Checking to see if the last digit of validation is 0
	int rem = total % 10;

	if (rem == 0)
	{
		cout << "Number is valid." << endl;
	}
	else
	{
		cout << "Number is invalid." << endl;

		// Determine what the check digit should have been to
		// give a remainder of 0.
		if (digit_7 - rem < 0)
		{
			cout << "Check digit should have been "
			<< digit_7 + (10 - rem) << endl;
		}
		else
		{
			cout << "Check digit should have been "
			<< digit_7 - rem << endl;
		}

	}

	return 0;
}
