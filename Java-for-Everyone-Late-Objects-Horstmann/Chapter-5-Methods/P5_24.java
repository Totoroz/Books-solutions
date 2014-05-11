/*Write a program that prints a paycheck. Ask the program user for the name of the
employee, the hourly rate, and the number of hours worked. If the number of hours
exceeds 40, the employee is paid “time and a half”, that is, 150 percent of the hourly
rate on the hours exceeding 40. Your check should look similar to that in the fig-
ure below. Use fictitious names for the payer and the bank. Be sure to use stepwi­se
refinement and break your solution into several methods. Use the intName method to
print the dollar amount of the check.*/

import java.util.Scanner;

public class P5_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the employee: ");
        String name = input.nextLine();
        System.out.print("Enter the hourly rate: ");
        double hourlyRate = input.nextDouble();
        System.out.print("Enter the hours worked: ");
        double hoursWorked = input.nextDouble();
        input.close();

        printCheckHeader();
        double pay = totalPay(hourlyRate, hoursWorked);
        printPayAmount(pay);
        int dollars = (int) pay;
        int cents = (int) ((pay * 100) % 100);
        printCheckFooter(name, intName(dollars).toUpperCase(), cents);
    }

    public static String intName(int number) {
        if (number == 0) {
            return "zero";
        }
        int part = number; // The part that still needs to be converted
        String name = ""; // The name of the number

        if (part < 0) {
            name = "negative";
            part = -part;
        }
        if (part >= 100) {
            name = digitName(part / 100) + " hundred";
            part = part % 100;
        }

        if (part >= 20) {
            name = name + " " + tensName(part);
            part = part % 10;
        } else if (part >= 10) {
            name = name + " " + teenName(part);
            part = 0;
        }

        if (part > 0) {
            name = name + " " + digitName(part);
        }
        return (name.charAt(0) == ' ') ? name.substring(1) : name;
    }

    public static String digitName(int digit) {
        if (digit == 1) {
            return "one";
        }
        if (digit == 2) {
            return "two";
        }
        if (digit == 3) {
            return "three";
        }
        if (digit == 4) {
            return "four";
        }
        if (digit == 5) {
            return "five";
        }
        if (digit == 6) {
            return "six";
        }
        if (digit == 7) {
            return "seven";
        }
        if (digit == 8) {
            return "eight";
        }
        if (digit == 9) {
            return "nine";
        }
        return "";
    }

    public static String teenName(int number) {
        if (number == 10) {
            return "ten";
        }
        if (number == 11) {
            return "eleven";
        }
        if (number == 12) {
            return "twelve";
        }
        if (number == 13) {
            return "thirteen";
        }
        if (number == 14) {
            return "fourteen";
        }
        if (number == 15) {
            return "fifteen";
        }
        if (number == 16) {
            return "sixteen";
        }
        if (number == 17) {
            return "seventeen";
        }
        if (number == 18) {
            return "eighteen";
        }
        if (number == 19) {
            return "nineteen";
        }
        return "";
    }

    public static String tensName(int number) {
        if (number >= 90) {
            return "ninety";
        }
        if (number >= 80) {
            return "eighty";
        }
        if (number >= 70) {
            return "seventy";
        }
        if (number >= 60) {
            return "sixty";
        }
        if (number >= 50) {
            return "fifty";
        }
        if (number >= 40) {
            return "forty";
        }
        if (number >= 30) {
            return "thirty";
        }
        if (number >= 20) {
            return "twenty";
        }
        return "";
    }

    public static void printCheckHeader() {
        System.out.printf("Acme Corp \t\t\t\t\tBig Bank\t\t\t\tCheckNumber: " + "1234\n");
        System.out.printf("123 St. \t\t\t\t\t321 Small St.\t\t\t\t\n");
        System.out.printf("Big City, NY 012345 \t\t\t\tSmall City, AK 543210" + "\t\t\t\t\n");
        System.out.printf("\t\t\t\t\t\t\t\t\t\tDate:\t\tAmount:\n");
        System.out.printf("\t\t\t\t\t\t\t\t\t\t04/29/09\t$");
    }

    public static void printPayAmount(double amount) {
        System.out.print("***");
        if (amount < 100) {
            System.out.print("*");
        } else if (amount < 10) {
            System.out.print("*");
        }
        System.out.printf("%.2f", amount);
    }

    public static void printCheckFooter(String payee, String dollarAmount, int cents) {
        System.out.println("PAY");
        dollarAmount += " " + cents + " / 100";
        System.out.print(dollarAmount);
        for (int i = 0; i < 106 - dollarAmount.length(); i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("TO THE ORDER OF: ");
        System.out.printf("\t\t\t\t\t\t%s\n", payee);
        System.out.println("\t\t\t\t\t\t124 Fake Rd");
        System.out.println("\t\t\t\t\t\tSmall Town, NK 43251");

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t___________________");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t___________________");
        System.out.println("\t\t\t\t\t|:478108240|: 200620375\"*1301");
    }

    public static double totalPay(double hourlyRate, double hoursWorked) {
        double basePay = hourlyRate * hoursWorked;
        if (hoursWorked > 40) {
            basePay += 0.5 * hourlyRate * (hoursWorked - 40);
        }
        return basePay;
    }
}
