/*Write a program that reads a word and prints the number of syllables in the word.
 For this exercise, assume that syllables are determined as follows: Each sequence of
 adjacent vowels  a e i o u y , except for the last  e in a word, is a syllable. However, if
 that algorithm yields a count of 0, change it to 1. For example,
     Word Syllables
     Harry 2
     hairy 2
     hare 1
     the  1*/

import java.util.Scanner;

public class P4_11 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Word: ");
	String word = input.next();
	input.close();
	int n_syllables = 0;
	boolean syllable = false;
	for (int i = 0; i < word.length(); i++) {
	    char current_letter = Character.toLowerCase(word.charAt(i));
	    if (current_letter == 'a' || (current_letter == 'e' && i != word.length() - 1)
		|| current_letter == 'i' || current_letter == 'o' || current_letter == 'u'
		|| current_letter == 'y') {
		if (!syllable) {
		   n_syllables += 1;
		   syllable = true;
		}
		else {
		    syllable = false;
		}
	    }
	}
	n_syllables = (n_syllables > 0)? n_syllables: 1;
	System.out.printf("%d syllable%s", n_syllables, (n_syllables > 1)? "s" : "");
    }
}
