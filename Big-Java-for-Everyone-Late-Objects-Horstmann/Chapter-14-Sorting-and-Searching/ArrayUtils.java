import java.util.Random;

public class ArrayUtils {
    private static Random generator = new Random();

    public static int[] randomIntArray(int length, int nLimit) {
        int[] output = new int[length];
        for (int i = 0; i < output.length; i++) {
            output[i] = generator.nextInt(nLimit);
        }
        return output;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
