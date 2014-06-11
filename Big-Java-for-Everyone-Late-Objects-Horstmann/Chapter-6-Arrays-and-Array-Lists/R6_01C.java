import java.util.Arrays;

/*Write code that fills an array values with each set of numbers below.
 c.1   4   9   16   25   36   49   64   81   100*/

public class R6_01C {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            int k = i + 1;
            numbers[i] = k * k;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
