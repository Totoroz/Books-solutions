import java.util.Arrays;

public class Demo {
    // ascending
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPos]) {
                    minPos = j;
                }
            }
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
        }
    }

    // ascending
    public static void insertionSort(int[] array) {
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

    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int[] first = new int[array.length / 2];
        int[] second = new int[array.length - first.length];
        for (int i = 0; i < first.length; i++) {
            first[i] = array[i];
        }
        for (int i = 0; i < second.length; i++) {
            second[i] = array[first.length + i];
        }
        mergeSort(first);
        mergeSort(second);
        merge(first, second, array);
    }

    private static void merge(int[] first, int[] second, int[] array) {
        int nextFirstPos = 0;
        int nextSecondPos = 0;
        int nextMergedPos = 0;

        while (nextFirstPos < first.length && nextSecondPos < second.length) {
            if (first[nextFirstPos] < second[nextSecondPos]) {
                array[nextMergedPos] = first[nextFirstPos];
                nextFirstPos += 1;
            } else {
                array[nextMergedPos] = second[nextSecondPos];
                nextSecondPos += 1;
            }
            nextMergedPos += 1;
        }

        // add one of the leftovers
        while (nextFirstPos < first.length) {
            array[nextMergedPos] = first[nextFirstPos];
            nextFirstPos += 1;
            nextMergedPos += 1;
        }

        while (nextSecondPos < second.length) {
            array[nextMergedPos] = second[nextSecondPos];
            nextSecondPos += 1;
            nextMergedPos += 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = ArrayUtils.randomIntArray(20, 100);
        StopWatch stopwatch = new StopWatch();
        System.out.println(Arrays.toString(arr));
        stopwatch.start();
        mergeSort(arr);
        stopwatch.stop();
        stopwatch.showElapsedTime();
        System.out.println(Arrays.toString(arr));
    }
}
