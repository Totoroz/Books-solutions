/*Modify the LargestInArray.java program in Section 6.3 to mark both the smallest and
the largest elements.*/

import java.util.Scanner;

public class P6_03 {
    public static void main(String[] args) {
        final int LENGTH = 100;
        double[] values = new double[LENGTH];
        int currentSize = 0;

        // Read inputs
        System.out.println("Please enter values, Q to quit:");
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble() && currentSize < values.length) {
            values[currentSize] = in.nextDouble();
            currentSize++;
        }
        in.close();

        // Find the largest and smallest values
        double largest = values[0];
        double smallest = values[0];
        for (int i = 1; i < currentSize; i++) {
            if (values[i] > largest) {
                largest = values[i];
            }
            if (values[i] < smallest) {
                smallest = values[i];
            }
        }

        // Print all values, marking the largest and smallest
        for (int i = 0; i < currentSize; i++) {
            System.out.print(values[i]);
            if (values[i] == largest && smallest != largest) {
                System.out.print(" <== largest value");
            } else if (values[i] == smallest && smallest != largest) {
                System.out.print(" <== smallest value");
            } else {
                System.out.print(" <== smallest and largest value");
            }
            System.out.println();
        }
    }
}
