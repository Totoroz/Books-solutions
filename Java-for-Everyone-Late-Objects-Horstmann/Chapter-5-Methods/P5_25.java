/*Postal bar codes. For faster sorting of letters, the United States Postal Service encour-
ages companies that send large volumes of mail to use a bar code denoting the zip
code (see Figure 6).
The encoding scheme for a five-digit zip code is shown in Figure 7. There are
full-height frame bars on each side. The five encoded digits are followed by a check
digit, which is computed as follows: Add up all digits, and choose the check digit to
make the sum a multiple of 10. For example, the zip code 95014 has a sum of 19, so
the check digit is 1 to make the sum equal to 20.
Each digit of the zip code, and the check digit, is encoded.
The digit can be easily computed from the bar code using the column weights 7, 4, 2,
1, 0. For example, 01100 is 0 × 7 + 1 × 4 + 1 × 2 + 0 × 1 + 0 × 0 = 6. The only exception
is 0, which would yield 11 according to the weight formula.
Write a program that asks the user for a zip code and prints the bar code. Use : for
half bars, | for full bars. For example, 95014 becomes
    ||:|:::|:|:||::::::||:|::|:::|||
Provide these methods:
    public static void printDigit(int d)
    public static void printBarCode(int zipCode)*/

import java.util.Scanner;

public class P5_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a zip code: ");
        int zip = input.nextInt();
        input.close();
        int checkDigit = checkDigit(zip);

        String barcode = "|";
        barcode = digitToBarCode(checkDigit) + barcode;
        for (int i = 0; i < 5; i++) {
            barcode = digitToBarCode(checkDigit) + barcode;
            zip /= 10;
        }
        barcode = "|" + barcode;
        System.out.println(barcode);
    }

    public static int checkDigit(int zip) {
        int remaining = zip;
        int sum = 0;
        while (remaining > 0) {
            sum += remaining % 10;
            remaining /= 10;
        }
        return 10 - (sum % 10);
    }

    public static String digitToBarCode(int digit) {
        if (digit == 1) {
            return ":::||";
        }
        if (digit == 2) {
            return "::|:|";
        }
        if (digit == 3) {
            return "::||:";
        }
        if (digit == 4) {
            return ":|::|";
        }
        if (digit == 5) {
            return ":|:|:";
        }
        if (digit == 6) {
            return ":||::";
        }
        if (digit == 7) {
            return "|:::|";
        }
        if (digit == 8) {
            return "|::|:";
        }
        if (digit == 9) {
            return "|:|::";
        }
        return "||:::";
    }
}
