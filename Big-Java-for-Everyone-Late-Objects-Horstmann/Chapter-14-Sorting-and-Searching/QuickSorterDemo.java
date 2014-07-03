import java.util.Arrays;
import java.util.Scanner;


public class QuickSorterDemo {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.print("Array size: ");
        int arraySize = consoleIn.nextInt();
        consoleIn.close();
        int[] array = ArrayUtils.randomIntArray(arraySize, 100);
        System.out.println(Arrays.toString(array));
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        QuickSorter.sort(array);
        stopwatch.stop();
        System.out.println(Arrays.toString(array));
        stopwatch.showElapsedTime();
    }
}
