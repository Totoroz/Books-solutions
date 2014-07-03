public class InsertionSorter {
    // ascending sort
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int next = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > next) {
                array[j] = array[j - 1];
                j -= 1;
            }
            array[j] = next;
        }
    }

    // descending sort
    public static void descSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int next = array[i];
            int j = i;
            while (j > 0 && array[j - 1] < next) {
                array[j] = array[j - 1];
                j -= 1;
            }
            array[j] = next;
        }
    }
}
