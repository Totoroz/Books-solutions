/*Write programs that read a sequence of integer inputs and print
    a.  The smallest and largest of the inputs.
    b.  The number of even and odd inputs.
    c.  Cumulative totals. For example, if the input is 1 7 2 9, the program should print
    1 8 10 19.
    d.  All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the
    program should print 3 5 6.*/

import java.util.Scanner;

public class P4_02D {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String adjacent_duplicates = "";
	System.out.print("Number: ");
	double input_number = input.nextDouble();
	double previous = input_number;
	boolean first_input = true;
	while (input.hasNextDouble()) {
	    System.out.print("Number: ");
	    input_number = input.nextDouble();
	    if (first_input != true && input_number == previous) {
		adjacent_duplicates += String.format("%s ", input_number);
	    }
	    first_input = false;
	    previous = input_number;
	}
	input.close();
	System.out.println(adjacent_duplicates);
    }
}
