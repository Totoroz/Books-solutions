/*Write a program that reads in a bar code (with : denoting half bars and | denoting
full bars) and prints out the zip code it represents. Print an error message if the bar
code is not correct.*/

import java.util.Scanner;

public class P5_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a bar code: ");
        String barcode = input.next();
        input.close();
        if (barcode.length() != 32) {
            System.out.println("Barcode is invalid.");
        } else {
            int sum = 0;
            int zip = 0;
            for (int i = 0; i < 5; i++) {
                int digit = barcodeToZip(barcode.substring(i + i * 5, 7 + i * 5));
                if (digit == -1) {
                    System.out.println("Encountered an invalid barcode digit.");
                    return;
                }
                zip = digit + 10 * zip;
                sum += digit;
            }
            int checkDigit = barcodeToZip(barcode.substring(1 + 5 * 5, 7 + 5 * 5));
            if ((checkDigit + sum) % 10 != 0) {
                System.out.println("Error checkdigit mismatch.");
            } else {
                System.out.println(zip);
            }
        }
    }

    public static int barcodeToZip(String barCode) {
        if (barCode.equals("||:::")) {
            return 0;
        }
        int digit = 0;
        if (barCode.charAt(0) == '|') {
            digit += 7;
        }
        if (barCode.charAt(1) == '|') {
            digit += 4;
        }
        if (barCode.charAt(2) == '|') {
            digit += 2;
        }
        if (barCode.charAt(3) == '|') {
            digit += 1;
        }
        if ((digit == 1 || digit == 2 || digit == 4 || digit == 7) && barCode.charAt(4) != '|') {
            return -1;
        } else if (digit < 1 || digit > 9) {
            return -1;
        } else {
            return digit;
        }
    }
}
