/*Write an application to pre-sell a limited number of cinema tickets. Each buyer can
buy as many as 4 tickets. No more than 100 tickets can be sold. Implement a pro-
gram called TicketSeller that prompts the user for the desired number of tickets and
then displays the number of remaining tickets. Repeat until all tickets have been
sold, and then display the total number of buyers.*/

import java.util.Scanner;

public class P4_30 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int available_tickets = 100;
	int n_buyers = 0;
	do {
	    System.out.print("Tickets to buy: ");
	    int tickets_to_buy = input.nextInt();
	    if (tickets_to_buy < 5 && tickets_to_buy > 0) {
		System.out.println("Bought " + tickets_to_buy + " ticket" + ((tickets_to_buy > 1)? "s": ""));
		available_tickets -= tickets_to_buy;
		n_buyers += 1;
	    }
	    else {
		System.out.println("Each buyer can buy not more than 4 tickets.");
	    }
	    System.out.println("Available tickets: " + available_tickets);
	} while (available_tickets > 0);	
	input.close();
	System.out.println("Tickets sold out!");
	System.out.println("Total buyers: " + n_buyers);
    }
}
