/*Write a program that prompts the user for a radius and then prints
 • The area and circumference of a circle with that radius
 • The volume and surface area of a sphere with that radius*/


import java.util.Scanner;


public class P2_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Radius: ");
		double radius = input.nextDouble();
		input.close();
		System.out.println("Area of circle: " + (Math.PI * Math.pow(radius, 2)));
		System.out.println("Circumference of circle: " + (2 * Math.PI * radius));
		System.out.println("Volume of sphere: " + (4.0 / 3.0 * Math.PI * Math.pow(radius, 3)));
		System.out.println("Surface area of sphere: "+ (4.0 * Math.PI * Math.pow(radius, 2)));
	}
}
