import java.util.Arrays;

public class BinarySearcherDemo {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 50, 60, 7, 50, 3, 4, 5, 6 };
        QuickSorter.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(BinarySearcher.binarySearch(array, 55));
    }
}
