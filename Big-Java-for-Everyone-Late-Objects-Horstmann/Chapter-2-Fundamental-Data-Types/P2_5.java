import java.util.Scanner;

//Enhance the output of P2_4.java so that the numbers are properly aligned.


public class P2_5 {

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
		System.out.printf("The sum: %10.2f\n"
				+ 		  "The difference: %10.2f\n"
				+         "The product: %10.2f\n"
				+         "The average: %10.2f\n"
				+         "The distance: %10.2f\n"
				+         "The maximum: %10.2f\n"
				+  		  "The minimum: %10.2f", sum, difference, product, average, distance, maximum, minimum);
	}

}
