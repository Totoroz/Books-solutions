/*Roman numbers. Write a program that converts a positive integer into the Roman
 number system. The Roman number system has digits
     I 1
     V 5
     X 10
     L 50
     C 100
     D 500
     M 1,000
 Numbers are formed according to the following rules:
     a.  Only numbers up to 3,999 are represented.
     b.  As in the decimal system, the thousands, hundreds, tens, and ones are ex­
     pressed separately.
     c.  The numbers 1 to 9 are expressed as
         I  1
         II  2
         III  3
         IV  4
         V  5
         VI  6
         VII  7
         VIII  8
         IX  9
         As you can see, an I preceding a V or X is subtracted from the value, and you
         can never have more than three I’s in a row.
     d.  Tens and hundreds are done the same way, except that the letters X, L, C and C,
         D, M are used instead of I, V, X, respectively.
 Your program should take an input, such as 1978, and convert it to Roman numerals,
 MCMLXXVIII.
*/

import java.util.Scanner;

public class P3_26 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Integer number (1-4000): ");
	int number = input.nextInt();
	input.close();
	String roman = "";
	
	if (number < 1) {
	    System.out.println("Number must be an integer between 1 and 4000");
	    return;
	}
	int digit = number / 1000;
	
	if (digit == 3) {
	    roman = "MMM";
	}
	else if (digit == 2) {
	    roman = "MM";
	}
	else if (digit == 1) {
	    roman = "M";
	}
	digit = (number % 1000) / 100;
	
	if (digit == 9) {
	    roman += "CM";
	}
	else if (digit == 4) {
	    roman += "CD";
	}
	else {	    
	    if (digit >= 5) {
    	    	roman += "D";
    	    	digit -= 5;
	    }
	    if (digit == 3) {
    	    	roman += "CCC";
	    }
	    else if (digit == 2) {
        	roman += "CC";
	    }
	    else if (digit == 1) {
        	roman += "C";
	    }
	}
	digit = (number % 100) / 10;
	if (digit == 9) {
	    roman += "XC";
	}
	else if (digit == 4) {
	    roman += "XL";
	}
	else {
	    if (digit >= 5) {
		roman += "L";
		digit -= 5;
	    }
	    if (digit == 3) {
		roman += "XXX";
	    }
	    else if (digit == 2) {
		roman += "XX";
	    }
	    else if (digit == 1){
		roman += "X";
	    }
	}
	digit = number % 10;
	
	if (digit == 9) {
	    roman += "IX";
	}
	else if (digit == 4) {
	    roman += "IV";
	}
	else {
	    if (digit >= 5) {
		roman += "V";
		digit -= 5;
	    }
	    if (digit == 3) {
		roman += "III";
	    }
	    else if (digit == 2) {
		roman += "II";
	    }
	    else if (digit == 1) {
		roman += "I";
	    }
	}
	System.out.println("Roman numeral: " + roman);
    }

}
