
public class QuickSorter {
    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int from, int to) {
        if (from >= to) {
            return;
        }
        int p = partition(array, from, to);
        sort(array, from, p);
        sort(array, p + 1, to);
    }

    private static int partition(int[] array, int from, int to) {
        int pivot = array[from];
        int i = from - 1;
        int j = to + 1;
        while (i < j) {
            i += 1;
            while (array[i] < pivot) {
                i += 1;
            }
            j -= 1;
            while (array[j] > pivot) {
                j -= 1;
            }
            if (i < j) {
                ArrayUtils.swap(array, i, j);
            }
        }
        return j;
    }
}
