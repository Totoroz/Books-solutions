/*Write the following methods.
a.	 int firstDigit(int n) , returning the first digit of the argument
b.	 int lastDigit(int n) , returning the last digit of the argument
c.	 int digits(int n) , returning the number of digits of the argument
For example, firstDigit(1729) is 1, lastDigit(1729) is 9, and digits(1729) is 4.
Provide a program that tests your methods.*/

public class P5_03 {
    public static int firstDigit(int number) {
	char firstDigit = Integer.toString(number).charAt(0);
	return Character.getNumericValue(firstDigit);
    }
    public static int lastDigit(int number) {
	return number % 10;
    }
    public static int digits(int number) {
	return Integer.toString(number).length();
    }
}
