public class SelectionSorter {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPos = minValuePosition(array, i);
            ArrayUtils.swap(array, minPos, i);
        }
    }

    private static int minValuePosition(int[] array, int fromPos) {
        int minPos = fromPos;
        for (int i = fromPos + 1; i < array.length; i++) {
            if (array[i] < array[minPos]) {
                minPos = i;
            }
        }
        return minPos;
    }

    private static int maxValuePosition(int[] array, int fromPos) {
        int maxPos = fromPos;
        for (int i = maxPos + 1; i < array.length; i++) {
            if (array[i] > array[maxPos]) {
                maxPos = i;
            }
        }
        return maxPos;
    }

    public static void descSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxPos = maxValuePosition(array, i);
            ArrayUtils.swap(array, maxPos, i);
        }
    }
}
