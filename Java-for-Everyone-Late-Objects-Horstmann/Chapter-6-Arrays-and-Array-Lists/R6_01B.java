import java.util.Arrays;

/*Write code that fills an array values with each set of numbers below.
 b.0   2   4   6   8   10   12   14   16   18*/

public class R6_01B {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
