import java.util.Arrays;
import java.util.Scanner;


public class MergeSortDemo {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.println("Array size: ");
        int arraySize = consoleIn.nextInt();
        consoleIn.close();
        int[] arr = ArrayUtils.randomIntArray(arraySize, 100);
        System.out.println(Arrays.toString(arr));
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        MergeSorter.sort(arr);
        stopwatch.stop();
        stopwatch.showElapsedTime();
        System.out.println(Arrays.toString(arr));
    }
}
