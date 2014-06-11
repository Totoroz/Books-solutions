/*Add error handling to Exercise P3.10. If the user provides an invalid unit for the
altitude, print an error message and end the program.*/

import java.util.Scanner;

public class P3_11 {
	public static void main(String[] args) {
		final int FREEZE_CELSIUS = 0;
		final int FREEZE_FAHRENHEIT = 32;
		double boil_celsius = 100;
		double boil_fahrenheit = 212;

		Scanner input = new Scanner(System.in);
		System.out.print("Temperature type (C/F): ");
		String temp_type = input.next();
		System.out.print("Temperature value: ");
		double temp_value = input.nextDouble();
		System.out.print("Altitude type (M/F): ");
		String alt_type = input.next();
		System.out.print("Altitude value: ");
		double alt_value = input.nextDouble();
		input.close();

		if (temp_type.equals("C")) {
			if (alt_type.equals("M")) {
				boil_celsius -= alt_value / 300;
			} else if (alt_type.equals("F")) {
				boil_celsius -= alt_value / 1000;
			} else {
				System.out.println("Invalid unit for altitude.");
				return;
			}
			if (temp_value <= FREEZE_CELSIUS) {
				System.out.println("Solid");
			} else if (temp_value >= boil_celsius) {
				System.out.println("Gas");
			} else {
				System.out.println("Liquid");
			}
		} else if (temp_type.equals("F")) {
			if (alt_type.equals("M")) {
				boil_fahrenheit -= alt_value / 300;
			} else if (alt_type.equals("F")) {
				boil_fahrenheit -= alt_value / 1000;
			} else {
				System.out.println("Invalid unit for altitude.");
				return;
			}
			if (temp_value <= FREEZE_FAHRENHEIT) {
				System.out.println("Solid");
			} else if (temp_value >= boil_fahrenheit) {
				System.out.println("Gas");
			} else {
				System.out.println("Solid");
			}
		} else {
			System.out.println("Invalid temperature unit.");
			return;
		}
	}
}
