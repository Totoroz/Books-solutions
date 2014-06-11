// Implement a program returning change


import java.util.Scanner;


public class P2_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Amount due(in pennies): ");
        int amount_due = input.nextInt();
        System.out.print("Amount received(in pennies): ");
        int amount_received = input.nextInt();
        input.close();
        
        int change_left = amount_due - amount_received;
        
        int dollars = change_left / 100;
        change_left %= 100;
        int quarters = change_left / 25;
        change_left %= 25;
        int dimes = change_left / 10;
        change_left %= 10;
        int nickels = change_left / 5;
        int pennies = change_left;
        
        System.out.println("Change to give:");
        System.out.printf("Dollars: %d\n", dollars);
        System.out.printf("Quarters: %d\n", quarters);
        System.out.printf("Dimes: %d\n", dimes);
        System.out.printf("Nickels: %d\n", nickels);
        System.out.printf("Pennies: %d\n", pennies);
    }
}
