/*Write a program that reads a number and displays the square, cube, and fourth
power. Use the  Math.pow method only for the fourth power.*/


import java.util.Scanner;


public class P2_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number: ");
		double number = input.nextDouble();
		input.close();
		double square_number = number * number;
		double cube_number = square_number * number;
		double fourth_power_of_number = cube_number * number;
		
		System.out.printf("Square: %.2f, Cube: %.2f, Fourth power: %.2f", square_number, cube_number, fourth_power_of_number);
		
	}

}
