/*Write a program that reads a word and prints all substrings, sorted by length. For
 example, if the user provides the input  "rum" , the program prints
     r
     u
     m
     ru
     um
     rum*/

import java.util.Scanner;

public class P4_12 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Word: ");
	String word = input.next();
	input.close();
	for (int length = 1; length <= word.length(); length++) {
	    for (int pos = 0; pos <= word.length() - length; pos++) {
		System.out.println(word.substring(pos, pos + length));
	    }
	}
    }
}
