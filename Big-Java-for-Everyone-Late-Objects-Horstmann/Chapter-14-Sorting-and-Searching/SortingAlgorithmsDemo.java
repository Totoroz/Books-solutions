import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgorithmsDemo {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.print("Array size: ");
        int arraySize = consoleIn.nextInt();
        consoleIn.close();

        int[] array = ArrayUtils.randomIntArray(arraySize, 100);
        StopWatch stopwatch = new StopWatch();

        stopwatch.start();
        BubbleSorter.sort(Arrays.copyOf(array, arraySize));
        stopwatch.stop();
        System.out.println("Bubble sort");
        stopwatch.showElapsedTime();
        stopwatch.reset();

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
        ShellSorter.sort(Arrays.copyOf(array, arraySize));
        stopwatch.stop();
        System.out.println("Shell sort");
        stopwatch.showElapsedTime();
        stopwatch.reset();

        stopwatch.start();
        RadixSorter.sort(Arrays.copyOf(array, arraySize), String.valueOf(arraySize).length());
        stopwatch.stop();
        System.out.println("Radix sort");
        stopwatch.showElapsedTime();
        stopwatch.reset();

        stopwatch.start();
        MergeSorter.sort(Arrays.copyOf(array, arraySize));
        stopwatch.stop();
        System.out.println("Merge sort");
        stopwatch.showElapsedTime();
        stopwatch.reset();

        stopwatch.start();
        QuickSorter.sort(Arrays.copyOf(array, arraySize));
        stopwatch.stop();
        System.out.println("Quick sort");
        stopwatch.showElapsedTime();
        stopwatch.reset();
    }
}
