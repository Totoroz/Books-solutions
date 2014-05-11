import java.util.Arrays;

/*Write a program that generates a sequence of 20 random values between 0 and 99 in
 an array, prints the sequence, sorts it, and prints the sorted sequence. Use the sort
 method from the standard Java library.*/

public class P6_14 {
    public static int[] generateSequence(int n) {
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = (int) (Math.random() * 99 + 1);
        }
        return seq;
    }

    public static void printArray(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
