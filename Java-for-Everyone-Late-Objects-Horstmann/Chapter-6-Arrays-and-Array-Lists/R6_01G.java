import java.util.Arrays;

/*Write code that fills an array values with each set of numbers below.
g.0   1   2   3  4   0   1   2   3    4*/

public class R6_01G {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i % 5;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
