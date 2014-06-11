/*Write a program that asks the user to enter a month (1 for January, 2 for February,
and so on) and then prints the number of days in the month. For February, print “28 or 29 days”.
    Enter a month: 5
     30 days
Do not use a separate  if/else branch for each month. Use Boolean operators*/

import java.util.Scanner;

public class P3_27 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Month number: ");
	int month = input.nextInt();
	input.close();
	
	if (month < 1 || month > 12) {
	    System.out.println("Invalid month number. Months are between 1 and 12");
	    return;
	}
	
	System.out.print("Days in the month: ");
	if (month == 4 || month == 6 || month == 9 || month == 11) {
	    System.out.print("30");
	}
	else if (month == 2) {
	    System.out.print("28 or 29");
	}
	else {
	    System.out.print("31");
	}
    }
}
