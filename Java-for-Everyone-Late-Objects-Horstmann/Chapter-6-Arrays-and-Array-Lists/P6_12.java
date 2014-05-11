/*A run is a sequence of adjacent repeated values. Write a program that generates a
sequence of 20 random die tosses in an array and that prints the die values, marking
the runs by including them in parentheses, like this:
1 2 (5 5) 3 1 2 4 3 (2 2 2 2) 3 6 (5 5) 6 3 1
Use the following pseudocode:
    Set a boolean variable inRun to false.
    For each valid index i in the array
         If inRun
             If values[i] is different from the preceding value
                 Print ).
                 inRun = false.
         If not inRun
             If values[i] is the same as the following value
                 Print (.
                 inRun = true.
         Print values[i].
    If inRun, print ).*/

public class P6_12 {
    public static void printRun(int[] values) {
        boolean inRun = false;
        int previousValue = values[0];
        for (int i = 0; i < values.length - 1; i++) {
            if (inRun) {
                if (values[i] != previousValue) {
                    System.out.print(")");
                    inRun = false;
                }
            } else {
                if (values[i] == values[i + 1]) {
                    System.out.print(" (");
                    inRun = true;
                } else {
                    System.out.print(" ");
                }
            }
            previousValue = values[i];
            System.out.print(values[i]);
        }
        if (inRun && values[values.length - 1] == previousValue) {
            System.out.print(" " + values[values.length - 1] + ")");
        } else if (inRun && values[values.length - 1] != previousValue) {
            System.out.print(") " + values[values.length - 1]);
        } else {
            System.out.print(" " + values[values.length - 1]);
        }
    }

    public static int[] generateDieTosses(int n) {
        int[] tosses = new int[n];
        for (int i = 0; i < n; i++) {
            tosses[i] = (int) (Math.random() * 6 + 1);
        }
        return tosses;
    }
}
