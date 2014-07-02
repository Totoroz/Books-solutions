package bg.synd.ATM;

import java.io.IOException;
import java.util.Scanner;

import bg.synd.ATM.BankAccount.InsufficientFundsException;

public class ATMSimulator {
    public static void main(String[] args) {
        ATM theATM;
        try {
            Bank theBank = new Bank();
            theBank.readCustomers("customers.txt");
            theATM = new ATM(theBank);
        } catch (IOException e) {
            System.out.println("Error opening customers file");
            return;
        }
        
        Scanner consoleIn = new Scanner(System.in);
        while (true) {
            int state = theATM.getState();
            if (state == ATM.START_STATE) {
                System.out.println("Enter customer number: ");
                int number = consoleIn.nextInt();
                theATM.setCustomerNumber(number);
            } else if (state == ATM.PIN_STATE) {
                System.out.println("Enter PIN: ");
                int pin = consoleIn.nextInt();
                theATM.selectCustomer(pin);;
            } else if (state == ATM.ACCOUNT_STATE) {
                System.out.println("(C)heckings, (S)avings, (Q)uit: ");
                String command = consoleIn.next();
                if (command.equalsIgnoreCase("C")) {
                    theATM.selectAccount(ATM.CHECKING);
                    theATM.selectAccount(ATM.SAVINGS);
                } else if (command.equalsIgnoreCase("S")) {
                } else if (command.equalsIgnoreCase("Q")) {
                    theATM.reset();
                } else {
                    System.out.println("Unknown command.");
                }
            }
            else if (state == ATM.TRANSACT_STATE) {
                System.out.println("Balance: " + theATM.getBalance());
                System.out.println("(D)eposit, (W)ithdrawal, (C)ancel");
                String command = consoleIn.next();
                if (command.equalsIgnoreCase("D")) {
                    System.out.println("Amount: ");
                    double amount = consoleIn.nextDouble();
                    theATM.deposit(amount);
                    theATM.back();
                } else if (command.equalsIgnoreCase("W")) {
                    System.out.println("Amount: ");
                    double amount = consoleIn.nextDouble();
                    try {
                        theATM.withdraw(amount);
                    } catch (InsufficientFundsException e) {
                        System.out.println("Insufficient funds!");
                    }
                } else if (command.equalsIgnoreCase("C")) {
                    theATM.back();
                } else {
                    System.out.println("Unknown command.");
                }
            }
        }
    }
}
