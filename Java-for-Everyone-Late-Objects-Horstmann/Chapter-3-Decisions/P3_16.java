/*Write a program that reads in three strings and sorts them lexicographically.
     Enter a string: Charlie
     Enter a string: Able
     Enter a string: Baker
     Able
     Baker
     Charlie*/

import java.util.Scanner;

public class P3_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("String one: ");
		String string1 = input.next();
		System.out.print("String two: ");
		String string2 = input.next();
		System.out.print("String three: ");
		String string3 = input.next();
		input.close();
		
		if (string1.compareTo(string2) < 0 && string1.compareTo(string3) < 0) {
			System.out.println(string1);
			if (string2.compareTo(string3) < 0) {
				System.out.println(string2);
				System.out.println(string3);
			} else {
				System.out.println(string3);
				System.out.println(string2);
			}
		} else if (string1.compareTo(string2) > 0 && string2.compareTo(string3) < 0) {
			System.out.println(string2);
			if (string1.compareTo(string3) < 0) {
				System.out.println(string1);
				System.out.println(string3);
			} else {
				System.out.println(string3);
				System.out.println(string1);
			}
		} else {
			System.out.println(string3);
			if (string1.compareTo(string2) < 0) {
				System.out.println(string1);
				System.out.println(string2);
			} else {
				System.out.println(string2);
				System.out.println(string1);
			}
		}
	}
}
