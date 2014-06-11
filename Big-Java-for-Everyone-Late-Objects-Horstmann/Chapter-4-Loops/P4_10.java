/*Write a program that reads a word and prints the number of vowels in the word. For
this exercise, assume that  a e i o u y are vowels. For example, if the user provides
the input  "Harry" , the program prints  2 vowels.*/

import java.util.Scanner;

public class P4_10 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Word: ");
	String word = input.next();
	input.close();
	int n_vowels = 0;
	for (int i = 0; i < word.length(); i++) {
	    char current_letter = Character.toLowerCase(word.charAt(i));
	    if (current_letter == 'a' || current_letter == 'e' || current_letter == 'o'
                || current_letter == 'i' || current_letter == 'u' || current_letter == 'y') {
		n_vowels += 1;
	    }
	}
	System.out.println("Number of vowels: " + n_vowels);
    }
}
