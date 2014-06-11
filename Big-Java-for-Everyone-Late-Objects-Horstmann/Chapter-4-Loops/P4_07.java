/*Translate the following pseudocode for randomly permuting the characters in a
 string into a Java program.
     Read a word.
     Repeat word.length() times
         Pick a random position i in the word, but not the last position.
         Pick a random position j > i in the word.
         Swap the letters at positions j and i.
     Print the word.
 To swap the letters, construct substrings as follows:
 Then replace the string with
 first + word.chartAt(j) + middle + word.charAt(i) + last*/

import java.util.Scanner;

public class P4_07 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a word: ");
	String word = input.next();
	for (int n = 0; n < word.length(); n++) {
	    int i = (int) (Math.random() * word.length() - 1);
	    int j = (int) (Math.random() * (word.length() - i - 1)) + i + 1;
	    String first = word.substring(0, i);
	    String middle = word.substring(i + 1, j);
	    String last = word.substring(j + 1);
	    word = first + word.charAt(j) + middle + word.charAt(i) + last;
	}
	input.close();
	System.out.println("Permuted word: " + word);
    }
}
