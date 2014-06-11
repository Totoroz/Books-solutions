/*Rewrite the following loops without using the enhanced for loop construct. Here,
values is an array of floating-point numbers.
a.   for (double x : values) { total = total + x; }
b.   for (double x : values) { if (x == target) { return true; } }
c.   int i = 0;
    for (double x : values) { values[i] = 2 * x; i++; }*/

public class R6_08 {
    // A
    public static double total(double[] seq) {
        double total = 0;
        for (int i = 0; i < seq.length; i++) {
            total += seq[i];
        }
        return total;
    }

    // B
    public static boolean findTarget(double[] seq, double target) {
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] == target) {
                return true;
            }
        }
        return false;
    }
    // C
    public static double[] multipleEachByFactor(double[] seq, double factor) {
        for (int i = 0; i < seq.length; i++) {
            seq[i] = 2 * factor;
        }
        return seq;
    }
}
