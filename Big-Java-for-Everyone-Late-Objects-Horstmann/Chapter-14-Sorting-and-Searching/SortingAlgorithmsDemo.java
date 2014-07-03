import java.util.Arrays;
import java.util.Scanner;


public class SortingAlgorithmsDemo {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.println("Array size: ");
        int arraySize = consoleIn.nextInt();
        consoleIn.close();

        int[] array = ArrayUtils.randomIntArray(arraySize, 100);
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        SelectionSorter.sort(Arrays.copyOf(array, arraySize));
        stopwatch.stop();
        System.out.println("Selection sort");
        stopwatch.showElapsedTime();
        stopwatch.reset();

        stopwatch.start();
        InsertionSorter.sort(Arrays.copyOf(array, arraySize));
        stopwatch.stop();
        System.out.println("Insertion sort");
        stopwatch.showElapsedTime();
        stopwatch.reset();

        stopwatch.start();
        BubbleSorter.sort(Arrays.copyOf(array, arraySize));
        stopwatch.stop();
        System.out.println("Bubble sort");
        stopwatch.showElapsedTime();
        stopwatch.reset();

        stopwatch.start();
        MergeSorter.sort(Arrays.copyOf(array, arraySize));
        stopwatch.stop();
        System.out.println("Merge sort");
        stopwatch.showElapsedTime();
        stopwatch.reset();
    }
}
