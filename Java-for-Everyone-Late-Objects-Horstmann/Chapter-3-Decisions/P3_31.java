/*Write a program that reads in the name and salary of an employee. Here the salary
will denote an hourly wage, such as $9.25. Then ask how many hours the employee
worked in the past week. Be sure to accept fractional hours. Compute the pay. Any
overtime work (over 40 hours per week) is paid at 150 percent of the regular wage.
Print a paycheck for the employee.*/

import java.util.Scanner;

public class P3_31 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Name: ");
	String name = input.next();
	System.out.print("Hourly wage: ");
	double hourly_wage =  input.nextDouble();
	System.out.print("Hours worked: ");
	double hours = input.nextDouble();
	input.close();
	double pay = 0;
	if (hours > 40) {
	    pay = hourly_wage * hours * 1.5;
	}
	else {
	    pay = hourly_wage * hours;
	}
	System.out.println(name + ", your pay is " + pay);
    }
}
