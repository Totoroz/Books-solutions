/*Declare a method squareArea that computes the area of a square of a given side length*/

import java.util.Scanner;

public class S5_08 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Side length: ");
	double sideLength = input.nextDouble();
	input.close();
	System.out.println("Square area: " + squareArea(sideLength));
    }
    public static double squareArea(double sideLength) {
	return sideLength * sideLength;
    }
}
