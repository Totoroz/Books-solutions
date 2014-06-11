//Enhance the intName method so that it works correctly for values < 1,000,000,000.

import java.util.Scanner;

public class P5_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a positive integer < 1000: ");
        int input = in.nextInt();
        System.out.println(intName(input));
        in.close();
    }

    /**
     * Turns a number into its English name.
     * 
     * @param number
     *            a positive integer < 1,000
     * @return the name of the number (e.g. "two hundred seventy four")
     */
    public static String intName(int number) {
        int part = number; // The part that still needs to be converted
        String name = ""; // The name of the number

        if (part >= 1000000) {
            name = digitName(part / 1000000) + " million";
            part %= 1000000;
        }
        
        if (part >= 1000) {
            name = digitName(part / 100) + " thousand";
            part %= 1000;
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

        return name;
    }

    /**
     * Turns a digit into its English name.
     * 
     * @param digit
     *            an integer between 1 and 9
     * @return the name of digit ("one" ... "nine")
     */
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

    /**
     * Turns a number between 10 and 19 into its English name.
     * 
     * @param number
     *            an integer between 10 and 19
     * @return the name of the given number ("ten" ... "nineteen")
     */
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

    /**
     * Gives the name of the tens part of a number between 20 and 99.
     * 
     * @param number
     *            an integer between 20 and 99
     * @return the name of the tens part of the number ("twenty" ... "ninety")
     */
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
}
