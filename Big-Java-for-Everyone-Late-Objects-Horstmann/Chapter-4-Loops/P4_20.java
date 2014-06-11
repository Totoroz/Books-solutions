/*Write a program that reads an integer and displays, using asterisks, a filled and hol-
 low square, placed next to each other. For example if the side length is 5, the pro gram
 should display
     *****   *****
     *****   *   *
     *****   *   *
     *****   *   *
     *****   ******/

import java.util.Scanner;

public class P4_20 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Number: ");
	int side_length = input.nextInt();
	input.close();
	for (int row = 1; row <= side_length; row++) {
	    // first square
	    for (int column = 1; column <= side_length; column++) {
		System.out.print("*");
	    }
	    System.out.print(" ");
	    // second square
	    for (int column = 1; column <= side_length; column++) {
		if (column == 1 || column == side_length || row == 1 || row == side_length) {
		    System.out.print("*");
		}
		else {
		    System.out.print(" ");
		}
	    }
	    System.out.println();
	}
    }
}
