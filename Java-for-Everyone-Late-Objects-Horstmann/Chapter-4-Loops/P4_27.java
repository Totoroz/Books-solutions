/*Currency conversion. Write a program
that first asks the user to type today’s
price for one dollar in Japanese yen,
then reads U.S. dollar values and
converts each to yen. Use 0 as a sentinel.*/

import java.util.Scanner;

public class P4_27 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Today's price for one USD to JPY: ");
	double exchange_rate = input.nextDouble();
	System.out.print("USD: ");
	while (input.hasNextDouble()) {
	   double dollars = input.nextDouble();
	   if (dollars == 0) {
	       break;
	   }
	   System.out.println("Japanese yen: " + (dollars * exchange_rate));
	}
	input.close();
    }
}
