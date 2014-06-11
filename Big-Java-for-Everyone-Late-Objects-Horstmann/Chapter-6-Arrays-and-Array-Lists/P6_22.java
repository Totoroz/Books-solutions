/*Write a program that reads a sequence of input values and displays a bar chart of the
values, using asterisks, like this:
 **********************
 ****************************************
 ****************************
 **************************
 ***************/

public class P6_22 {
    public static void displayCharts(int[] seq) {
        int maxElement = findMaxElement(seq);
        for (int i = 0; i < seq.length; i++) {
            int times = (seq[i] / maxElement) * 40;
            for (int j = 0; j < times; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int findMaxElement(int[] seq) {
        int maxElement = seq[0];
        for (int i = 1; i < seq.length; i++) {
            if (seq[i] > maxElement) {
                maxElement = seq[i];
            }
        }
        return maxElement;
    }
}
