/*Write programs that read a line of input as a string and print
a.  Only the uppercase letters in the string.
b.  Every second letter of the string.
c.  The string, with all vowels replaced by an underscore.
d.  The number of digits in the string.
e.  The positions of all vowels in the string.*/

import java.util.Scanner;

public class P3_03B {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("String: ");
	String input_string = input.next();
	input.close();
	String output = "";
	for (int i = 0; i < input_string.length(); i += 2) {
	    output += input_string.charAt(i);
	    }
	System.out.println(output);
    }
}
