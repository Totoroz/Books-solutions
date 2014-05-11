/*Write a method that implements the algorithm developed in Section 6.6.*/

public class P6_08 {
    public static void swap(int[] seq) {
        int i = 0;
        int j = seq.length / 2;
        while (i < seq.length / 2) {
            int temp = seq[i];
            seq[i] = seq[j];
            seq[j] = temp;
            i += 1;
            j += 1;
        }
    }
}
