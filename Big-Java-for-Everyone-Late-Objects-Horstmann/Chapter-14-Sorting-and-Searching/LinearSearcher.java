public class LinearSearcher {
    public static int search(int[] array, int needle) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == needle) {
                return i;
            }
        }
        return -1;
    }
}
