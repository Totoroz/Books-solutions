/*Write programs that read a line of input as a string and print
a.  Only the uppercase letters in the string.
b.  Every second letter of the string.
c.  The string, with all vowels replaced by an underscore.
d.  The number of digits in the string.
e.  The positions of all vowels in the string.*/

import java.util.Scanner;

public class P3_03A {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("String: ");
	String user_input = input.next();
	input.close();
	String output = "";
	for (int i = 0; i < user_input.length(); i++) {
	    char current_letter = user_input.charAt(i);
	    if (Character.isUpperCase(current_letter)) {
		output += current_letter;
	    }
	}
	System.out.println(output);
    }
}
