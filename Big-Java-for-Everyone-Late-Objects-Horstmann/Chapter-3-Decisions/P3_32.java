/*When you use an automated teller machine (ATM) with your bank card, you need
to use a personal identification number (PIN) to access your account. If a user fails
more than three times when entering the PIN, the machine will block the card.
Assume that the user’s PIN is “1234” and write a program that asks the user for the
PIN no more than three times, and does the following:
•	 If the user enters the right number, print a message saying, “Your PIN is
correct”, and end the program.
•	 If the user enters a wrong number, print a message saying, “Your PIN is incor­
rect” and, if you have asked for the PIN less than three times, ask for it again.
•	 If the user enters a wrong number three times, print a message saying “Your
bank card is blocked” and end the program.*/

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl;

public class P3_32 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int user_pin = 1234;
	int pin_tries = 3;
	boolean correct_pin = false;
	System.out.print("User pin: ");
	int input_pin = input.nextInt();
	while (pin_tries > 1) {
	    if (input_pin == user_pin) {
		correct_pin = true;
		break;
	    }
	    System.out.println("Invalid pin. Try again");
	    pin_tries -= 1;
	    System.out.print("User pin: ");
	    input_pin = input.nextInt();
	}
	input.close();
	if (correct_pin) {
	    System.out.print("Correct PIN code.");	    
	}
	else {
	    System.out.print("Your card has been blocked.");
	}
    }
}
