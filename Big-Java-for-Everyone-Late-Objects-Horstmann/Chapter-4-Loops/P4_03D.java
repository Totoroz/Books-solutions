/*Write programs that read a line of input as a string and print
a.  Only the uppercase letters in the string.
b.  Every second letter of the string.
c.  The string, with all vowels replaced by an underscore.
d.  The number of digits in the string.
e.  The positions of all vowels in the string.*/

import java.util.Scanner;

public class P4_03D {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("String: ");
	String user_input = input.next();
	input.close();
	int string_digits = 0;
	for (int i = 0; i < user_input.length(); i++) {
	    char current_char = user_input.charAt(i);
	    if (Character.isDigit(current_char)) {
		string_digits += 1;
	    }
	}
	System.out.println("Number of digits: " + string_digits);
    }
}
