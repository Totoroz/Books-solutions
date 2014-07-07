import java.util.Arrays;


public class ShellSorterDemo {
    public static void main(String[] args) {
        int[] array = ArrayUtils.randomIntArray(20, 100);
        System.out.println(Arrays.toString(array));
        ShellSorter.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
