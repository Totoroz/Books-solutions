/*Write a program that generates a sequence of 20 random die tosses in an array and
that prints the die values, marking only the longest run, like this:
    1 2 5 5 3 1 2 4 3 (2 2 2 2) 3 6 5 5 6 3 1
If there is more than one run of maximum length, mark the first one.*/

public class P6_13 {
    public static int[] generateDieTosses(int n) {
        int[] tosses = new int[n];
        for (int i = 0; i < n; i++) {
            tosses[i] = (int) (Math.random() * 6 + 1);
        }
        return tosses;
    }

    public static void printArrayWithParenthesis(int[] values, int index, int length) {
        boolean inRun = false;
        for (int i = 0; i < values.length; i++) {
            if (inRun) {
                if (length == 0) {
                    System.out.print(") " + values[i] + " ");
                    inRun = false;
                } else {
                    System.out.print(" " + values[i]);
                }
                length--;
            } else if (i == index) {
                inRun = true;
                length--;
                System.out.print("(" + values[i]);
            } else {
                System.out.print(values[i] + " ");
            }
        }
        if (length == 0) {
            System.out.print(")");
        }
    }

    public static void printLongestRun(int[] values) {
        boolean inRun = false;
        int previousValue = values[0];
        int longestRunLength = 0;
        int longestRunIndex = -1;
        int currentRunLength = 0;
        int currentRunIndex = -1;
        for (int i = 0; i < values.length - 1; i++) {
            if (inRun) {
                if (values[i] != previousValue) {
                    inRun = false;
                    if (currentRunLength > longestRunLength) {
                        longestRunLength = currentRunLength;
                        longestRunIndex = currentRunIndex;
                    }
                } else {
                    currentRunLength++;
                }
            } else {
                if (values[i] == values[i + 1]) {
                    inRun = true;
                    currentRunLength = 1;
                    currentRunIndex = i;
                }
            }
            previousValue = values[i];
        }
        if (inRun && values[values.length - 1] == previousValue) {
            currentRunLength++;
            if (currentRunLength > longestRunLength) {
                longestRunLength = currentRunLength;
                longestRunIndex = currentRunIndex;
            }
        }
        printArrayWithParenthesis(values, longestRunIndex, longestRunLength);
    }
}
