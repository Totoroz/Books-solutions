/*Mean and standard deviation. Write a program that reads a set of floating-point data
 values. Choose an appropriate mechanism for prompting for the end of the data set.
 When all values have been read, print out the count of the values, the aver age, and
 the standard deviation.*/

import java.util.Scanner;

public class P4_15 {
    public static void main(String[] args ) {
	Scanner input = new Scanner(System.in);
	System.out.print("Series of numbers: ");
	int count = 0;
	double sum = 0;
	double sum_squares = 0;
	while (input.hasNextDouble()) {
	    double number = input.nextDouble();
	    sum += number;
	    sum_squares += number * number;
	    count += 1;
	}
	input.close();
	System.out.println("Total count: " + count);
	System.out.println("Average: " + sum / count);
	
	double standard_deviation = Math.sqrt((sum_squares - Math.pow(sum, 2) / count) / (count-1));
	System.out.println("Standard deviation: " + standard_deviation);
    }
}
