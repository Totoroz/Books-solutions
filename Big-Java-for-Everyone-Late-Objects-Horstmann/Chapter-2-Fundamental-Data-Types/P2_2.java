/*Write a program that computes and displays the perimeter of a letter­size (8.5 × 11 inch) 
sheet of paper and the length of its diagonal.*/


public class P2_2 {

	public static void main(String[] args) {
		final double PAPER_WIDTH_INCHES = 8.5;
		final double PAPER_LENGTH_INCHES = 11.0;
		
		double perimeter = 2 * PAPER_LENGTH_INCHES + 2 * PAPER_WIDTH_INCHES;
		double diagonal = Math.sqrt(Math.pow(PAPER_WIDTH_INCHES, 2) + Math.pow(PAPER_LENGTH_INCHES, 2));
		System.out.printf("Perimeter: %.2f; Diagonal length: %.2f", perimeter, diagonal);
	}

}
