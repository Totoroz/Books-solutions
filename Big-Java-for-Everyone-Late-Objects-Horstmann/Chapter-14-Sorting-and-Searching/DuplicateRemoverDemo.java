import java.util.Arrays;

public class DuplicateRemoverDemo {
    public static void main(String[] args) {
        int[] array = ArrayUtils.randomIntArray(10000, 100);
        System.out.println(Arrays.toString(array));
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        System.out.println(Arrays.toString(DuplicateRemover.removeDuplicates(Arrays.copyOf(array, array.length))));
        stopwatch.stop();
        stopwatch.showElapsedTime();
        stopwatch.reset();

        stopwatch.start();
        System.out.println(Arrays.toString(DuplicateRemover.removeDuplicatesBest(Arrays.copyOf(array, array.length))));
        stopwatch.stop();
        stopwatch.showElapsedTime();
        stopwatch.reset();
    }
}
