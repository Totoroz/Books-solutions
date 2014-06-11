import java.util.Scanner;

/*Write a program that prompts the user for a measurement in meters and
then converts it to miles, feet, and inches.*/


public class P2_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Measurement meters: ");
		double measurement_meters = input.nextDouble();
		input.close();
		double measurement_miles = measurement_meters * 0.000621371192;
		double measurement_feet = measurement_meters * 3.2808399;
		double measurement_inches = measurement_meters * 39.3700787;
		
		System.out.printf("Measurement miles: %.4f\n"
				+ 		  "Measurement feet: %.4f\n"
				+ 		  "Measurement inches: %.4f", 
		measurement_miles, measurement_feet, measurement_inches);
	}

}
