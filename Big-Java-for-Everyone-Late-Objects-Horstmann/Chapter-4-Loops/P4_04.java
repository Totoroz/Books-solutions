/*Complete the program in How To 4.1 on page 182. Your program should read twelve
# temperature values and print the month with the highest temperature.*/

import java.util.Scanner;

public class P4_04 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double max_temperature = 0;
	int max_temperature_month = 1;
	for (int i = 1; i <= 12; i++) {
	    System.out.printf("Month %d: ", i);
	    double input_temperature = input.nextDouble();
	    if (input_temperature > max_temperature) {
		max_temperature = input_temperature;
		max_temperature_month = i;
	    }
	}
	input.close();
	System.out.println("Max temperature month: " + max_temperature_month);
	System.out.println("Max temperature: " + max_temperature);
    }
}
