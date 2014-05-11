/*An online bank wants you to create a program that shows prospective customers
how their deposits will grow. Your program should read the initial balance and the
annual interest rate. Interest is compounded monthly. Print out the balances after the
first three months. Here is a sample run:
Initial balance: 1000
Annual interest rate in percent: 6.0
After first month: 1005.00
After second month: 1010.03
After third month: 1015.08*/


import java.util.Scanner;


public class P2_26 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Initial balance: ");
    double balance = input.nextDouble();
    System.out.print("Annual intereset in percent: ");
    double annual_interest = input.nextDouble();
    input.close();
    double monthly_interest = annual_interest / 12 / 100;
    
    double first_month = balance + balance * monthly_interest;
    System.out.printf("After first month: %.2f\n", first_month);
    double second_month = first_month + first_month * monthly_interest;
    System.out.printf("After second month: %.2f\n", second_month);
    double third_month = second_month + second_month * monthly_interest;
    System.out.printf("After third month: %.2f", third_month);
    }
}
