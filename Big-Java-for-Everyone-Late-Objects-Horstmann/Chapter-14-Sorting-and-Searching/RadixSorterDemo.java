import java.util.Arrays;


public class RadixSorterDemo {
    public static void main(String[] args) {
        int[] array = ArrayUtils.randomIntArray(100, 100);
        System.out.println(Arrays.toString(array));
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        RadixSorter.sort(array, 3);
        stopwatch.stop();
        System.out.println(Arrays.toString(array));
        stopwatch.showElapsedTime();
    }
}
