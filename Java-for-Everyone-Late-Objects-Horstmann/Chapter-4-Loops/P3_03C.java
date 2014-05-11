/*Write programs that read a line of input as a string and print
a.  Only the uppercase letters in the string.
b.  Every second letter of the string.
c.  The string, with all vowels replaced by an underscore.
d.  The number of digits in the string.
e.  The positions of all vowels in the string.*/

import java.util.Scanner;

public class P3_03C {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("String: ");
	String input_string = input.next();
	for (int i = 0; i < input_string.length(); i++) {
	    char current_letter = input_string.charAt(i);
	    char lower_letter = Character.toLowerCase(current_letter);
	    if (lower_letter == 'a' || lower_letter == 'e' || lower_letter == 'o'
		|| lower_letter == 'u' || lower_letter == 'i') {
		StringBuilder modified_string = new StringBuilder(input_string);
		modified_string.setCharAt(i, '_');
		input_string = modified_string.toString();
	    }
	}
	input.close();
	System.out.println(input_string);
    }
}
