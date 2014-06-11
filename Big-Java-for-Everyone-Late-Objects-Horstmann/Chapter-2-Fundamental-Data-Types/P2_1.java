/*Write a program that displays the dimensions of a letter­size (8.5 × 11 inch) sheet of paper in millimeters. 
There are 25.4 millimeters per inch. Use con stants and comments in your program.*/


import java.util.Scanner;


public class P2_1 {
	public static void main(String[] args) {
		final double MILIMETERS_PER_INCH = 25.4;
		Scanner input = new Scanner(System.in);
		System.out.print("X: ");	
		double inch_dimensions_x = input.nextDouble();
		System.out.print("Y: ");
		double inch_dimensions_y = input.nextDouble();
		input.close();
		double milimeters_dimensions_x = inch_dimensions_x * MILIMETERS_PER_INCH;
		double milimeters_dimensions_y = inch_dimensions_y * MILIMETERS_PER_INCH;
		
		System.out.printf("Dimensions in milimeters: %.2f, %.2f", milimeters_dimensions_x, milimeters_dimensions_y);
	}
}
