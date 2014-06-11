/*Write a program that reads in three floating­point numbers and prints the largest of
 the three inputs without using the  max function. For example:
     Enter a number: 4
     Enter a number: 9
     Enter a number: 2.5
     The largest number is 9.0*/

import java.util.Scanner;

public class P3_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers seperating them by a space: ");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		input.close();
		double largest;
		
		if (n1 >= n2 && n1 > n3) {
			largest = n1;
		} else if (n2 > n1 && n2 >= n3){
			largest = n2;
		} else {
			largest = n3;
		}
		System.out.println("Largest number: " + largest);
	}
}
