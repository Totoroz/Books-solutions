/*When two points in time are compared, each given as hours (in military time, 
 * ranging from 0 and 23) and minutes, the following pseudocode determines which
 * comes first. */

import java.util.Scanner;

public class P3_17 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Time one: ");
	int time1 = input.nextInt();
	System.out.print("Time two: ");
	int time2 = input.nextInt();
	input.close();
	int hours1 = time1 / 100;
	int minutes1 = time1 % 100 + hours1 * 60;

	int hours2 = time2 / 100;
	int minutes2 = time2 % 100 + hours2 * 60;

	if (hours1 < hours2) {
	    System.out.println(time1);
	}
	else if (hours1 == hours2) {
	    if (minutes1 < minutes2) {
		System.out.println(time1);
	    }
	    else if (minutes1 == minutes2) {
		System.out.println(time1);
	    }
	    else {

	    }
	}
	else {
	    System.out.println(time2);
	}
    }
}
