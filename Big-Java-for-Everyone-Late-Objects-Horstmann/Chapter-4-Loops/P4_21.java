/*Write a program that reads an integer and displays, using asterisks, a filled diamond
 of the given side length. For example, if the side length is 4, the program should
 display
     *
    ***
   *****
  *******
   *****
    ***
     * */

import java.util.Scanner;

public class P4_21 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Side length: ");
	int side_length = input.nextInt();
	input.close();
	int max_width = side_length * 2 - 1;
	int half_width = max_width / 2;
	int dot_num = 1;
	// top half
	for (int i = 0; i < side_length; i++) {
	    for (int j = 0; j < half_width; j++) {
		System.out.print(" ");
	    }
	    for (int j = 0; j < dot_num; j++) {
		System.out.print("*");
	    }
	    System.out.println();
	    dot_num += 2;
	    half_width -= 1;
	}
	// bottom half
	dot_num = max_width - 2;
	half_width = 1;
	for (int i = 0; i < side_length; i++) {
	    for (int j = 0; j < half_width; j++) {
		System.out.print(" ");
	    }
	    for (int j = 0; j < dot_num; j++) {
		System.out.print("*");
	    }
	    System.out.println();
	    dot_num -= 2;
	    half_width += 1;
	}
    }
}
