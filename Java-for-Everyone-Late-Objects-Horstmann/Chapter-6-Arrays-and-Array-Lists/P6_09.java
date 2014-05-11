/*Write a method
    public static boolean equals(int[] a, int[] b)
that checks whether two arrays have the same elements in the same order.*/

public class P6_09 {
    public static boolean arrayEquals(int[] a, int[] b) {
        if (a.length != a.length) {
            return false;
        }
        for (int i = 0; i < b.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
