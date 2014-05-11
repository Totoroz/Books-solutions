import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*Write a method
        public static boolean sameSet(int[] a, int[] b)
that checks whether two arrays have the same elements in some order, ignoring
duplicates. For example, the two arrays
    1  4  9  16  9  7  4  9  11
and
    11  11  7  9  16  4  1
would be considered identical. You will probably need one or more helper methods.*/

public class P6_10 {
    public static boolean sameSet(int[] a, int[] b) {
        Set<Integer> tempSetA = new HashSet<Integer>(Arrays.asList(a));
        Set<Integer> tempSetB = new HashSet<Integer>(Arrays.asList(b));
        return tempSetA.equals(tempSetB);
    }
}
