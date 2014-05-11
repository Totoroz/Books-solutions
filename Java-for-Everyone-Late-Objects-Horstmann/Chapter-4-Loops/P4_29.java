/*Your company has shares of stock it would like to sell when their value exceeds a
certain target price. Write a program that reads the target price and then reads the
current stock price until it is at least the target price. Your program should read
a sequence of floating-point values from standard input. Once the minimum is
reached, the program should report that the stock price exceeds the target price.*/

import java.util.Scanner;

public class P4_29 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Target price: ");
	double target_price = input.nextDouble();
	System.out.print("Stock price: ");
	double stock_price = 0;
	while (stock_price < target_price) {
	    stock_price = input.nextDouble();
	    if (stock_price >= target_price) {
		System.out.println("Minimum reached. Stock price exceeds target price");
		break;
	    }
	    System.out.print("Stock price: ");
	}
	input.close();
    }
}
