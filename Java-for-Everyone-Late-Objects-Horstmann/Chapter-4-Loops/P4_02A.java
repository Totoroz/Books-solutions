/*Write programs that read a sequence of integer inputs and print
    a.  The smallest and largest of the inputs.
    b.  The number of even and odd inputs.
    c.  Cumulative totals. For example, if the input is 1 7 2 9, the program should print
    1 8 10 19.
    d.  All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the
    program should print 3 5 6.*/

import java.util.Scanner;

public class P4_02A {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Number: ");
	double input_number = input.nextDouble();
	double smallest_number = input_number;
	double largest_number = input_number;
	System.out.print("Number: ");
	while (input.hasNextDouble()) {
	    System.out.print("Number: ");
	    input_number = input.nextDouble();
	    if (input_number < smallest_number) {
		smallest_number = input_number;
	    }
	    else if (input_number > largest_number) {
		largest_number = input_number;
	    }
	}
	System.out.println("Smallest number: " + smallest_number);
	System.out.println("Largest number: " + largest_number);
	input.close();
    }
}
