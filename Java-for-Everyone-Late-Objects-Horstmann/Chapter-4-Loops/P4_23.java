/*The Drunkard’s Walk. A drunkard in a grid of streets randomly picks one of four
directions and stumbles to the next intersection, then again randomly picks one of
four directions, and so on. You might think that on average the drunkard doesn’t
move very far because the choices cancel each other out, but that is actually not the
case.
Represent locations as integer pairs (x, y). Implement the drunkard’s walk over 100
intersections, starting at (0, 0), and print the ending location.*/

import java.util.Scanner;

public class P4_23 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Initial location X: ");
	int loc_x = input.nextInt();
	System.out.print("Initial location Y: ");
	int loc_y = input.nextInt();
	System.out.printf("Initial location is (%d, %d)\n", loc_x, loc_y);
		
	System.out.print("Number of steps: ");
	int number_of_steps = input.nextInt();
	input.close();
	for (int i = 0; i < number_of_steps; i++) {
	    int direction = (int) (Math.random() * 4);
	    if (direction == 0) {
		loc_x += 1;
		System.out.println("Moved east");
	    }
	    else if (direction == 1) {
		loc_x -= 1;
		System.out.println("Moved west");
	    }
	    else if (direction == 2) {
		loc_y += 1;
		System.out.println("Moved north");
	    }
	    else if (direction == 3) {
		loc_y -= 1;
		System.out.println("Moved south");
	    }
	}
	System.out.printf("Final location: (%d, %d)", loc_x, loc_y);
    }
}
