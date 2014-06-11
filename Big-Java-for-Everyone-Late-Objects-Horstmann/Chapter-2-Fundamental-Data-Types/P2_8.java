/*Write a program that asks the user for the lengths of the sides of a rectangle. 
Then print:
 • The area and perimeter of the rectangle
 • The length of the diagonal*/


import java.util.Scanner;


public class P2_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Side a: ");
		double side_a = input.nextDouble();
		System.out.print("Side b: ");
		double side_b = input.nextDouble();
		input.close();
		double area =  side_a * side_b;
		double perimeter = 	2 * (side_a + side_b);
		double diagonal = Math.sqrt(side_a * side_a + side_b * side_b);
		System.out.printf("Area: %.2f\nPerimeter: %.2f\nDiagonal length: %.2f", area, perimeter, diagonal);
	}
}
