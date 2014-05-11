/*Write code that fills an array values with each set of numbers below.
 a.1     2   3   4   5   6   7   8   9   10*/

import java.util.Arrays;

public class R6_01A {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
