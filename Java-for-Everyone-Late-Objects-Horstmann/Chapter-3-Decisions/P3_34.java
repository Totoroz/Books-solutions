/*A supermarket awards coupons depending on how much a customer spends on
groceries. For example, if you spend $50, you will get a coupon worth eight percent
of that amount. The following table shows the percent used to calculate the coupon
awarded for different amounts spent. Write a program that calculates and prints the
value of the coupon a person can receive based on groceries purchased.
Here is a sample run:
Please enter the cost of your groceries: 14
You win a discount coupon of $ 1.12. (8% of your purchase)*/

import java.util.Scanner;

public class P3_34 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Cost of your groceries: ");
	double groceries_cost = input.nextDouble();
	input.close();
	double discount = (groceries_cost < 10)? 0:
	    		  (groceries_cost < 61)? groceries_cost * 0.08:
	    		  (groceries_cost < 151)? groceries_cost * 0.10:
	    		  (groceries_cost < 211)? groceries_cost * 0.12:
	    		   groceries_cost * 0.14;
	System.out.println("Your discount is " + discount);
    }
}
