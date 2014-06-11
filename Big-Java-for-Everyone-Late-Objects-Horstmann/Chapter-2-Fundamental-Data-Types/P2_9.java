//Improve the program discussed in How To 2.1 to allow input of quarters in addition to bills


import java.util.Scanner;


public class P2_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;
        System.out.print("Enter bill value (1 = $1 bill, 5 = $5 bill, etc.): ");
        int bill_value = input.nextInt();
        
        System.out.print("Enter quarter value (1 = $.25, 2 = $.50, etc.):");
        int quarter_value = input.nextInt();
        
        System.out.print("Enter item price in pennies: ");
        int item_price = input.nextInt();
        input.close();
        
        int amount_due = PENNIES_PER_DOLLAR * bill_value + PENNIES_PER_QUARTER * quarter_value - item_price;
        int dollar_coins = amount_due / PENNIES_PER_DOLLAR;
        amount_due = amount_due % PENNIES_PER_DOLLAR;
        int quarters = amount_due / PENNIES_PER_QUARTER;
        System.out.printf("Dollar coins: %d\n", dollar_coins);
        System.out.printf("Quarters: %d\n", quarters);
    }

}
