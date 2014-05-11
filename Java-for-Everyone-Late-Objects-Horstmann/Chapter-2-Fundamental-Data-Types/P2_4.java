import java.util.Scanner;

/*Write a program that prompts the user for two integers and then prints
 • The sum
 • The difference
 • The product
 • The average
 • The distance (absolute value of the difference)
 • The maximum (the larger of the two)
 • The minimum (the smaller of the two)
 Hint: The max and min functions are declared in the Math class.*/


public class P2_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number a: ");
		double number_a = input.nextDouble();
		System.out.print("Number b: ");
		double number_b = input.nextDouble();
		input.close();
		double sum = number_a + number_b;
		double difference = number_a - number_b;
		double product = number_a * number_b;
		double average = (number_a + number_b) / 2;
		double distance = Math.abs(difference);
		double maximum = Math.max(number_a, number_b);
		double minimum = Math.min(number_a, number_b);
		System.out.printf("The sum: %.2f\n"
				+ 		  "The difference: %.2f\n"
				+         "The product: %.2f\n"
				+         "The average: %.2f\n"
				+         "The distance: %.2f\n"
				+         "The maximum: %.2f\n"
				+  		  "The minimum: %.2f", sum, difference, product, average, distance, maximum, minimum);
	}

}
