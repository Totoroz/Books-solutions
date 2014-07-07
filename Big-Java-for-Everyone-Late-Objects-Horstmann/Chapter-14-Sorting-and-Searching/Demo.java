import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
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

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int from, int to) {
        if (from >= to) {
            return;
        }
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
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        quickSort(array, from, j);
        quickSort(array, j + 1, to);
    }

    public static int linearSearch(int[] array, int needle) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == needle) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int needle) {
        return binarySearch(array, 0, array.length - 1, needle);
    }

    public static int binarySearch(int[] array, int low, int high, int needle) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == needle) {
                return mid;
            } else if (array[mid] < needle) {
                return binarySearch(array, mid + 1, high, needle);
            } else if (array[mid] > needle) {
                return binarySearch(array, low, mid - 1, needle);
            }
        }
        return -(low + 1);
    }

    public static void shellSort(int[] array) {
        List<Integer> columns = new ArrayList<Integer>();
        int c = 1;
        while (c < array.length) {
            columns.add(c);
            c = 3 * c + 1;
        }
        for (int i = columns.size() - 1; i >= 0; i--) {
            c = columns.get(i);
            for (int k = 0; k < c; k++) {
                columnSort(array, k, c);
            }
        }
    }

    private static void columnSort(int[] array, int k, int c) {
        for (int i = k + c; i < array.length; i+= c) {
            int next = array[i];
            int j = i;
            while (j >= c && array[j - c] > next) {
                array[j] = array[j - c];
                j -= c;
            }
            array[j] = next;
        }
    }

    public static void main(String[] args) {
        int[] arr = ArrayUtils.randomIntArray(100, 100);
        StopWatch stopwatch = new StopWatch();
        System.out.println(Arrays.toString(arr));
        stopwatch.start();
        shellSort(arr);
        stopwatch.stop();
        stopwatch.showElapsedTime();
        System.out.println(Arrays.toString(arr));
    }
}
