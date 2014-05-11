/*Write a method public static void removeMin that removes the minimum value from a
partially filled array without calling other methods.*/

public class P6_05 {
    public static void removeMin(int[] seq) {
        int minElement = seq[0];
        int minIndex = 0;
        for (int i = 1; i < seq.length; i++) {
            if (seq[i] != 0 && seq[i] < minElement) {
                minElement = seq[i];
                minIndex = i;
            }
        }
        for (int i = minIndex; i < seq.length - 1; i++) {
            seq[i] = seq[i + 1];
        }
    }
}
