/*Write Java code for a loop that simultaneously computes both the maximum and
minimum of an array.*/

public class R6_05 {
    public static void main(String[] args) {
        int[] numbers = { 2, 1, 5, 4, 3, 6, 7, 10, 9 };
        int min = numbers[0];
        int max = numbers[0];
        for (int i : numbers) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
