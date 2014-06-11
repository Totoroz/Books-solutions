/*Write a program that first asks the user
to type in today’s price of one dollar
in Jap­anese yen, then reads U.S. dollar
values and converts each to Japanese
yen. Use 0 as the sentinel value to denote the end of dollar inputs. Then the program
reads a sequence of yen amounts and converts them to dollars. The second sequence
is ter­minated by another zero value.*/

import java.util.Scanner;

public class P4_28 {
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
	   System.out.print("USD: ");
	}
	System.out.print("JPY: ");
	while (input.hasNextDouble()) {
	    double yen = input.nextDouble();
	    if (yen == 0) {
		break;
	    }
	    System.out.printf("United states dollars: %.2f\n", (yen / exchange_rate));
	    System.out.print("JPY: ");
	}
	input.close();
    }
}
