/*Write a program that translates a number between 0 and 4 into the closest letter
grade. For example, the number 2.8 (which might have been the average of several
grades) would be converted to B–. Break ties in favor of the better grade; 
for example 2.85 should be a B.*/

import java.util.Scanner;

public class P3_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Numeric grade (0.0 - 4.0): ");
		double numeric_grade = input.nextDouble();
		input.close();
		String letter_grade = "F";
		if (numeric_grade > 4 || numeric_grade < 0) {
			System.out.println("Invalid grade. Grade must be between 0.0 and 4.0.");
			return;
		} else if (numeric_grade == 4 || numeric_grade >= 3.85) {
			letter_grade = "A";
		} else if (numeric_grade > 3.7) {
			letter_grade = "A-";
		} else if (numeric_grade > 3) {
			letter_grade = "B+";
		} else if (numeric_grade >= 2.85) {
			letter_grade = "B";
		} else if (numeric_grade >= 2.7) {
			letter_grade = "B-";
		} else if (numeric_grade > 2) {
			letter_grade = "C+";
		} else if (numeric_grade >= 1.85) {
			letter_grade = "C";
		} else if (numeric_grade >= 1.7) {
			letter_grade = "C-";
		} else if (numeric_grade > 1) {
			letter_grade = "D+";
		} else if (numeric_grade >= 0.85) {
			letter_grade = "D";
		} else if (numeric_grade >= 0.7) {
			letter_grade = "D-";
		} else {
			letter_grade = "F";
		}
		System.out.println("Your grade is: " + letter_grade);
	}
}
