import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemover {
    // NAIVE SOLUTION 0(n^2)
    public static int[] removeDuplicates(int[] array) {
        List<Integer> output = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            boolean hasDuplicate = false;
            int j = i +1;
            while (!hasDuplicate && j < array.length) {
                if (array[i] == array[j]) {
                    hasDuplicate = true;
                }
                j += 1;
            }
            if (!hasDuplicate) {
                output.add(array[i]);
            }
        }
        array = new int[output.size()];
        int i = 0;
        for (Integer integer : output) {
            array[i] = integer;
            i += 1;
        }
        return array;
    }


    public static int[] removeDuplicatesBest(int[] array) {
        Set<Integer> set = new LinkedHashSet<Integer>();
        for (int element : array) {
            set.add(element);
        }
        set.toArray();
        array = new int[set.size()];
        int i = 0;
        for (Integer integer : set) {
            array[i] = integer;
            i += 1;
        }
        return array;
    }
}