/*Calculating the tip when you go to a restaurant is not difficult, but your restaurant
wants to suggest a tip according to the service diners receive. Write a program that
calculates a tip according to the diner’s satisfaction as follows:
•	 Ask for the diners’ satisfaction level using these ratings: 1 = Totally satisfied, 2
= Satisfied, 3 = Dissatisfied.
•	 If the diner is totally satisfied, calculate a 20 percent tip.
•	 If the diner is satisfied, calculate a 15 percent tip.
•	 If the diner is dissatisfied, calculate a 10 percent tip.
•	 Report the satisfaction level and tip in dollars and cents.*/

import java.util.Scanner;

public class P3_33 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Dinner satisfaction - 1)Totally satisfied, 2)Satisfied, 3)Dissatisfied");
	int dinner_satisfaction = input.nextInt();
	input.close();
	int tip = 0;
	switch (dinner_satisfaction) {
	case 1:
	    tip = 20;
	    break;
	case 2:
	    tip = 15;
	    break;
	
	case 3:
	    tip = 10;
	    break;
	    
	default:
	    System.out.println("Unknown number entered.");
	}
	System.out.printf("Your tip is %d percent", tip);
    }
}
