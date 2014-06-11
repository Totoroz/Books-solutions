/*In Exercise P3.26 you were asked to write a program to
convert a number to its rep­resentation in Roman numerals.
At the time, you did not know how to eliminate duplicate
code, and as a consequence the resulting program was rather
long. Rewrite that program by implementing and using the
following method:
    public static String romanDigit(int n, String one, String five, String ten)
That method translates one digit, using the strings specified for the one, five, and ten
values. You would call the method as follows:
    romanOnes = romanDigit(n % 10, “I”, “V”, “X”);
    n = n / 10;
    romanTens = romanDigit(n % 10, “X”, “L”, “C”);*/

public class P5_21 {
    public static String romanDigit(int number, String one, String five, String ten) {
        if (number == 1) {
            return one;
        }
        if (number == 2) {
            return one + one;
        }
        if (number == 3) {
            return one + one + one;
        }
        if (number == 4) {
            return one + five;
        }
        if (number == 5) {
            return five;
        }
        if (number == 6) {
            return five + one;
        }
        if (number == 7) {
            return five + one + one;
        }
        if (number == 8) {
            return five + one + one + one;
        }
        return one + ten;
    }
    public static String integerToRoman(int number) {
        String ones = romanDigit(number % 10, "I", "V", "X");
        number /= 10;
        String tens = romanDigit(number % 10, "X", "L", "C");
        number /= 10;
        String hundreds = romanDigit(number % 10, "C", "D", "M");
        number /= 10;
        String thousands = romanDigit(number % 10, "M", "M", "M");
        return thousands + hundreds + tens + ones;
    }
}
