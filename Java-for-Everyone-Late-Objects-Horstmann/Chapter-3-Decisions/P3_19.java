/*Write a program that reads in two floating­point numbers and tests whether they are
the same up to two decimal places. Here are two sample runs.
     Enter a floating-point number: 2.0
     Enter a floating-point number: 1.99998
     They are the same up to two decimal places.
     Enter a floating-point number: 2.0
     Enter a floating-point number: 1.98999
     They are different.*/

import java.util.Scanner;

public class P3_19 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Number one: ");
	double number1 = input.nextDouble();
	System.out.print("Number two: ");
	double number2 = input.nextDouble();
	input.close();
	
	if (Math.abs(number1 - number2) <= 0.01) {
	    System.out.println("They're the same");
	}
	else {
	    System.out.println("They're different");
	}
    }
}
