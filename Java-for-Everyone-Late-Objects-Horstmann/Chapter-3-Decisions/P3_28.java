/*A year with 366 days is called a leap year. Leap years are necessary to keep the calendar
synchronized with the sun because the earth revolves around the sun once
every 365.25 days. Actually, that figure is not entirely precise, and for all dates after
1582 the Gregorian correction applies. Usually years that are divisible by 4 are leap
years, for example 1996. However, years that are divisible by 100 (for example, 1900)
are not leap years, but years that are divisible by 400 are leap years (for exam ple,
2000). Write a program that asks the user for a year and computes whether that year
is a leap year. Use a single  if statement and Boolean operators.*/

import java.util.Scanner;

public class P3_28 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Year: ");
	int year = input.nextInt();
	input.close();
	boolean leap_year = false;
	if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
	    leap_year = true;
	}
	System.out.printf("Is %d a leap year: %b", year, leap_year);
    }
}
