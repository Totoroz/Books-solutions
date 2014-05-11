/*Write a program that computes taxes for the following schedule.
 if your status is single and
 if the taxable income is over   but not over        the tax is          of the amount over
     $0                              $8,000                  10%                 $0
  $8,000                             $32,000              $800 +  15%           $8,000
  $32,000                                                 $4,400 + 25%          $32,000

 if your status is Married and
 if the taxable income is over    but not over        the tax is           of the amount over
  $0                              $16,000                  10%                     $0
  $16,000                         $64,000                 $1,600 + 15%            $16,000
  $64,000                                                  $8,800 + 25%           $64,000
 */

import java.util.Scanner;

public class P3_22 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Married or single (M/S): ");
	String status = input.next();
	System.out.print("Your income: ");
	double income = input.nextDouble();
	input.close();

	double tax = 0;
	if (status.compareTo("M") != 0 || status.compareTo("S") != 0) {
	    System.out.println("Invalid status. Please use M(arried) or S(ingle).");
	    return;
	}
	else if (income < 1) {
	    System.out.println("Income must be greater than 0!");
	    return;
	}
	else if (status.equals("S")) {
	    if (income <= 8000) {
		tax = income * 0.10;
	    }
	    else if (income <= 32000) {
		tax = (income * 0.15) + 800;
	    }
	    else {
		tax = (income * 0.25) + 4400;
	    }
	}
	else if (status.equals("M")) {
	    if (income <= 16000) {
		tax = income * 0.10;
	    }
	    else if (income <= 64000){
		tax = (income * 0.15) + 1600;
	    }
	    else {
		tax = (income * 0.25) + 8800;
	    }
	}
	System.out.println("Your tax: " + tax);
    }
}
