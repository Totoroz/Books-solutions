/*Write a program that reads a word and prints the word in reverse. For example, if the
 user provides the input  "Harry" , the program prints
     yrraH*/

import java.util.Scanner;

public class P4_09 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Word: ");
	String word = input.next();
	input.close();
	StringBuilder new_word = new StringBuilder(word);
	word = new_word.reverse().toString();
	System.out.println("Reverse: " + word);
    }
}
