/*Translate the following pseudocode for finding the minimum value from a set of
 inputs into a Python program.
     Set a Boolean variable "first" to true.
     While another value has been read successfully
         If first is true
             Set the minimum to the value.
             Set first to false.
         Else if the value is less than the minimum
             Set the minimum to the value.
     Print the minimum.*/


import java.util.Scanner;

public class P4_06 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	boolean first = true;
	double minimum = 0;
	System.out.print("Sequence of numbers: ");
	while (input.hasNextDouble()) {
	    double value = input.nextDouble();
	    if (first) {
		minimum = value;
		first = false;
	    }
	    else if (value < minimum) {
		minimum = value;
	    }
	}
	input.close();
	System.out.println("Min value: " + minimum);
    }
}
