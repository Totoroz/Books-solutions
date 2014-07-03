import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortDemo {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.println("Array size: ");
        int arraySize = consoleIn.nextInt();
        consoleIn.close();

        int[] array = ArrayUtils.randomIntArray(arraySize, 100);
        System.out.println(Arrays.toString(array));
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        // ascending sort
        InsertionSorter.sort(array);
        stopwatch.stop();
        stopwatch.showElapsedTime();
        System.out.println(Arrays.toString(array));

        // descending sort
        stopwatch.reset();
        stopwatch.start();
        InsertionSorter.descSort(array);
        stopwatch.stop();
        stopwatch.showElapsedTime();
        System.out.println(Arrays.toString(array));
    }
}
