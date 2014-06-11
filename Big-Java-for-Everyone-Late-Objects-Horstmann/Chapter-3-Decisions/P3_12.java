/*Write a program that translates a letter grade into a number grade. Letter grades are
 A, B, C, D, and F, possibly followed by + or –. Their numeric values are 4, 3, 2, 1, and
 0. There is no F+ or F–. A + increases the numeric value by 0.3, a – decreases it by 0.3.
 However, an A+ has value 4.0.
     Enter a letter grade: B-
     The numeric value is 2.7.*/

import java.util.Scanner;

public class P3_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double A_GRADE = 4.0;
		final double B_GRADE = 3.0;
		final double C_GRADE = 2.0;
		final double D_GRADE = 1.0;
		final double F_GRADE = 0.0;
		final double PLUS_MINUS_ADJUSTMENT = 0.3;
		System.out.print("Letter grade: ");
		String grade = input.next();
		input.close();
		double numeric_grade = F_GRADE;
		if (grade.charAt(0) == 'A') {
			numeric_grade = A_GRADE;
		} else if (grade.charAt(0) == 'B') {
			numeric_grade = B_GRADE;
		} else if (grade.charAt(0) == 'C') {
			numeric_grade = C_GRADE;
		} else if (grade.charAt(0) == 'D') {
			numeric_grade = D_GRADE;
		} else if (grade.charAt(0) == 'F') {
		} else {
			System.out.println("Invalid letter grade.");
			return;
		}

		if (grade.charAt(1) == '+') {
			numeric_grade += PLUS_MINUS_ADJUSTMENT;
		} else if (grade.charAt(1) == '-') {
			numeric_grade -= PLUS_MINUS_ADJUSTMENT;
		} else {
			System.out.println("Invalid letter grade");
			return;
		}
		System.out.printf("\nLetter grade %s = %f", grade, numeric_grade);
	}
}
