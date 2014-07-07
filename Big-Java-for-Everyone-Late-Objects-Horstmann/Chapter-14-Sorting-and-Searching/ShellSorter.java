import java.util.ArrayList;
import java.util.List;


public class ShellSorter {
    public static void sort(int[] array) {
        List<Integer> columns = new ArrayList<Integer>();
        int c = 1;
        while (c < array.length) {
            columns.add(c);
            c = 3 * c + 1;
        }
        for (int s = columns.size() - 1; s >= 0; s--) {
            c = columns.get(s);
            for (int k = 0; k < c; k++) {
                columnSort(array, k, c);
            }
        }
    }

    /**
     * Sorts a column using insertion sort
     *
     * @param array to be sorted
     * @param k the index of the first element in the column
     * @param c the gap between elements and columns
     */
    private static void columnSort(int[] array, int k, int c) {
        for (int i = k + c; i < array.length; i += c) {
            int next = array[i];
            int j = i;
            while (j >= c && array[j - c] > next) {
                array[j] = array[j - c];
                j -= c;
            }
            array[j] = next;
        }
    }
}
