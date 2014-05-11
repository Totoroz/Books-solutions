/*Computes volume of cubes*/

import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Side length: ");
	double side_length = input.nextDouble();
	input.close();
	System.out.println("Cube volume: " + cube_volume(side_length));
    }
    
    /**
     * Computes volume of a cube
     * @param side_length the side length of the cube
     * @return the volume	
     */
    public static double cube_volume(double side_length) {
	return side_length * side_length * side_length;
    }
}
