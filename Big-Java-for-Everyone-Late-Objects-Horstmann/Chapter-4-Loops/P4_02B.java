/*Write programs that read a sequence of integer inputs and print
    a.  The smallest and largest of the inputs.
    b.  The number of even and odd inputs.
    c.  Cumulative totals. For example, if the input is 1 7 2 9, the program should print
    1 8 10 19.
    d.  All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the
    program should print 3 5 6.*/

import java.util.Scanner;

public class P4_02B {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int odd_numbers = 0;
	int even_numbers = 0;
	System.out.print("Number: ");
	while (input.hasNextDouble()) {
	    double input_number = input.nextDouble();
	    if (input_number % 2 == 0) {
		even_numbers += 1;
	    }
	    else {
		odd_numbers += 1;
	    }
	    System.out.print("Number: ");
	}
	input.close();
	System.out.println("Odd numbers: " + odd_numbers);
	System.out.println("Even numbers: " + even_numbers);
    }
}
