import java.util.ArrayList;
import java.util.List;

public class RadixSorter {
    public static void sort(int[] array, int maxDigits) {
        int exp = 1;
        for (int i = 0; i < maxDigits; i++) {
            ArrayList<Integer>[] bucketList = new ArrayList[10];
            for (int k = 0; k < 10; k++) {
                bucketList[k] = new ArrayList<Integer>();
            }
            for (int j = 0; j < array.length; j++) {
                int number = (array[j] / exp) % 10;
                bucketList[number].add(array[j]);
            }
            exp *= 10;
            int index = 0;
            for (int k = 0; k < 10; k++) {
                for (int number : bucketList[k]) {
                    array[index] = number;
                    index += 1;
                }
            }
        }
    }

    public static void rSort(int[] array, int maxDigits) {
        int exp = 1;
        for (int i = 0; i < maxDigits; i++) {
            List<Integer>[] bucketList = new ArrayList[10];
            for (int k = 0; k < bucketList.length; k++) {
                bucketList[k] = new ArrayList<Integer>();
            }
            for (int j = 0; j < array.length; j++) {
                int number = (array[j] / exp) % 10;
                bucketList[number].add(array[j]);
            }
            exp *= 10;
            int index = 0;
            for (int k = 0; k < bucketList.length; k++) {
                for (int number : bucketList[k]) {
                    array[index] = number;
                    index += 1;
                }
            }
        }
    }
}
