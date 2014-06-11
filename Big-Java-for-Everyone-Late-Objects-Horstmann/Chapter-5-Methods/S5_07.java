/*Provide an alternative implementation of the body of cubeVolume method by
 * calling the Math.pow method*/

import java.util.Scanner;

public class S5_07 {
    public static void main(String[] args) {
	System.out.print("Side length: ");
	Scanner input = new Scanner(System.in);
	double sideLength = input.nextDouble();
	input.close();
	System.out.println("Cube volume: " + cubeVolume(sideLength));
    }
    public static double cubeVolume(double sideLength) {
	return Math.pow(sideLength, 3);
    }
}
