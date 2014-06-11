/*The following algorithm yields the season (Spring	, Summer, Fall, or Winter) for a
 given month and day.
     If month is 1, 2, or 3, season = "Winter"
     Else if month is 4, 5, or 6, season = "Spring"
     Else if month is 7, 8, or 9, season = "Summer"
     Else if month is 10, 11, or 12, season = "Fall"
     If month is divisible by 3 and day >= 21
     If season is "Winter", season = "Spring"
     Else if season is "Spring", season = "Summer"
     Else if season is "Summer", season = "Fall"
     Else season = "Winter"
 Write a program that prompts the user for a month
 and day and then prints the season, as determined
 by this algorithm.*/

import java.util.Scanner;

public class P3_18 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Month: ");
	int month = input.nextInt();
	System.out.print("Day: ");
	int day = input.nextInt();
	input.close();
	String season;
	if (month < 1 || month > 12) {
	    System.out.println("Invalid month number. Months are between 1-12");
	    return;
	}
	
	if (day < 1 || day > 31) {
	    System.out.println("Invalid day number. Days are between 1-31");
	    return;
	}
	
	else if (month <= 3) {
	    season = "Winter";
	}
	else if (month <= 6) {
	    season = "Spring";
	}
	else if (month <= 9) {
	    season = "Summer";
	}
	else {
	    season = "Winter";
	}
	System.out.println("Season is: " + season);
    }
}
