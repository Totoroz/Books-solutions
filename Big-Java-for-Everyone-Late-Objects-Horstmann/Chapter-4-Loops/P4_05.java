/*Write a program that reads a set of floating-point values. Ask the user to enter the
values, then print
     • the average of the values.
     • the smallest of the values.
     • the largest of the values.
     • the range, that is the difference between the smallest and largest.*/

import java.util.Scanner;

public class P4_05 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Sequence of numbers: ");
	boolean first = true;
	double min = 0;
	double max = 0;
	double sum = 0;
	int total_numbers = 0;
	while (input.hasNextDouble()) {
	    double number = input.nextDouble();
	    sum += number;
	    total_numbers += 1;
	    if (first) {
		min = number;
		max = number;
		first = false;
	    }
	    else {
		if (number > max) {
		    max = number;
		}
		if (number < min) {
		    min = number;
		}
	    }
	}
	input.close();
	double average = sum / total_numbers;
	double difference = Math.abs(max - min);
	System.out.println("Average: " + average);
	System.out.println("Smallest: " + min);
	System.out.println("Largest: " + max);
	System.out.println("Difference: " + difference);
    }
}
