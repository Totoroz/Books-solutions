/*Use recursion to determine the number of digits in an integer n . Hint: If n is < 10, it
has one digit. Otherwise, it has one more digit than n / 10 .*/

public class P5_18 {
    public static int numberOfDigits(int number) {
        if (number < 0) {
            return numberOfDigits(-number);
        }
        if (number < 10) {
            return 1;
        }
        else {
            return 1 + numberOfDigits(number / 10);
        }
    }
}
