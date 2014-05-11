/*Write a method sumWithoutSmallest that computes the sum of an array of values,
except for the smallest one, in a single loop. In the loop, update the sum and the
smallest value. After the loop, return the difference.*/

public class P6_04 {
    public static int sumWithoutSmallest(int[] seq) {
        int sum = 0;
        for (int i = 0; i < seq.length; i++) {
            sum += seq[i];
        }
        return sum - findSmallest(seq);
    }
    public static int findSmallest(int[] seq) {
        int smallest = seq[0];
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] < smallest) {
                smallest = seq[i];
            }
        }
        return smallest;
    }
}
