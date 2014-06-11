/*When printing separators, we skipped the separator before the initial element.
Rewrite the loop so that the separator is printed after each element, except for
the last element*/

public class S6_15 {
    public static void addSeparators(String separator, double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.printf(" %s ", separator);
            }
        }
    }
}
