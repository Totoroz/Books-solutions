/*Write a program to simulate a bank transaction. There are two bank accounts:
checking and savings. First, ask for the initial balances of the bank accounts; reject
negative balances. Then ask for the transaction; options are deposit, withdrawal, and
transfer. Then ask for the account; options are checking and savings. Then ask for the
amount; reject transactions that overdraw an account. At the end, print the balances
of both accounts*/

import java.util.Scanner;

public class P3_30 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Savings balance: ");
	double savings = input.nextDouble();
	System.out.print("Checkings balance: ");
	double checkings = input.nextDouble();
	
	if (savings < 1 || checkings < 1) {
	    System.out.println("Balances must be greater than 0.");
	    input.close();
	    return;
	}
	System.out.print("Choose an operation: 1) Deposit, 2) Withdraw, 3) Transfer: ");
	int operation_choice = input.nextInt();

	if (operation_choice == 1) {
	    System.out.print("To 1) Savings, 2) Checkings ?: ");
	    int account_choice = input.nextInt();
	    if (account_choice == 1) {
		System.out.print("Amount: ");
		double amount = input.nextDouble();
		savings += amount;
	    }
	    else if (account_choice == 2) {
		System.out.print("Amount: ");
		double amount = input.nextDouble();
		checkings += amount;
	    }
	    else {
		System.out.print("Unknown account number.");
		input.close();
		return;
	    }
	}
	else if (operation_choice == 2) {
	    System.out.print("From 1) Savings, 2) Checkings ?: ");
	    int account_choice = input.nextInt();
	    if (account_choice == 1) {
		System.out.print("Amount: ");
		double amount = input.nextDouble();
		if (savings - amount < 0) {
		    System.out.println("Withdraw amount exceeds savings balance.");
		    input.close();
		    return;
		}
		savings -= amount;
	    }
	    else if (account_choice == 2) {
		System.out.print("Amount: ");
		double amount = input.nextDouble();
		if (savings - amount < 0) {
		    System.out.println("Withdraw amount exceeds savings balance.");
		    input.close();
		    return;
		}
		checkings -= amount;
	    }
	    else {
		System.out.print("Unknown account number.");
		input.close();
		return;
	    }
	}
	else if (operation_choice == 3) {
	    System.out.print("From 1) Savings, 2) Checkings ?: ");
	    int from_choice = input.nextInt();
	    System.out.print("To 1) Savings, 2) Checkings ?: ");
	    int to_choice = input.nextInt();

	    if (from_choice == to_choice) {
		System.out.println("Same account to transfer from and to");
		input.close();
		return;
	    }
	    else if (from_choice == 1) {
		System.out.print("Amount: ");
		double amount = input.nextDouble();
		if (savings - amount < 0) {
		    System.out.print("Transfer amount exceeds balance");
		    input.close();
		    return;
		}
		savings -= amount;
		checkings += amount;
	    }
	    else if (from_choice == 2) {
		System.out.print("Amount: ");
		double amount = input.nextDouble();
		if (checkings - amount < 0) {
		    System.out.print("Transfer amount exceeds balance");
		    input.close();
		    return;
		}
		checkings -= amount;
		savings += amount;
	    }
	    else {
		System.out.println("Unknown accounts chosen");
		input.close();
		return;
	    }
	}
	else {
	    System.out.println("Invalid operation choice");
	    input.close();
	    return;
	}
	input.close();
	System.out.println("Savings balance: " + savings);
	System.out.println("Checkings balance: " + checkings);
    }
}
