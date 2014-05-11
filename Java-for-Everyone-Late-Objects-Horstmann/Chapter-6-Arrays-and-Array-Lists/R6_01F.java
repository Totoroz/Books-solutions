import java.util.Arrays;

/*Write code that fills an array values with each set of numbers below.
f.0   1   0   1   0   1   0   1   0   1*/

public class R6_01F {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i % 2;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
