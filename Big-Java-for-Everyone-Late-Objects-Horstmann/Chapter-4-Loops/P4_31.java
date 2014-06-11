/*You need to control the number of people who can be in an oyster bar at the same
time. Groups of people can always leave the bar, but a group cannot enter the bar
if they would make the number of people in the bar exceed the maximum of 100
occupants. Write a program that reads the sizes of the groups that arrive or depart.
Use negative numbers for departures. After each input, display the current number
of occupants. As soon as the bar holds the maximum number of people, report that
the bar is full and exit the program.*/

import java.util.Scanner;

public class P4_31 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	final int MAXIMUM_PEOPLE = 100;
	int current_people = 0;
	do {
	    System.out.print("Size of group entering: ");
	    int entering_people = input.nextInt();
	    if (current_people + entering_people <= MAXIMUM_PEOPLE) {
		System.out.println("Welcome in !");
		current_people += entering_people;
	    }
	    else {
		System.out.println("Group exceeds bar capacity.");
	    }
	    System.out.println("~~~Currently " + current_people + " in the oyster bar");
	} while (current_people < MAXIMUM_PEOPLE);
	input.close();
	System.out.println("Oyster bar is full.");
    }
}
