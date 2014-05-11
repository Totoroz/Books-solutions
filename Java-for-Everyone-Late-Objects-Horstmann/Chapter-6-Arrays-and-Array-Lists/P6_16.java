/*It is a well-researched fact that men in a restroom generally prefer to maximize
their distance from already occupied stalls, by occupying the middle of the longest
sequence of unoccupied places.
For example, consider the situation where ten stalls are empty.
_ _ _ _ _ _ _ _ _ _
The first visitor will occupy a middle position:
_ _ _ _ _ X _ _ _ _
The next visitor will be in the middle of the empty area at the left.
_ _ X _ _ X _ _ _ _
Write a program that reads the number of stalls and then prints out diagrams in the
format given above when the stalls become filled, one at a time. Hint: Use an array of
boolean values to indicate whether a stall is occupied.*/

public class P6_16 {
    public static final int STALL_NUMBER = 10;
    
    public static int nextStall(boolean[] stalls) {
        int longestIndex = -1;
        int longestRun = 0;
        int currentIndex = -1;
        int currentRun = 0;
        boolean inRun = false;
        for (int i = 0; i < stalls.length; i++) {
            if (inRun && stalls[i]) {
                inRun = false;
                if (currentRun >= longestRun) {
                    longestRun = currentRun;
                    longestIndex = currentIndex;
                }
                
            }
            else if (!inRun && !stalls[i]) {
                inRun = true;
                currentIndex = i;
                currentRun = 1;
            }
            else if (inRun && !stalls[i]) {
                currentRun += 1;
            }
        }
        if (inRun) {
            if (currentRun >= longestRun) {
                longestRun = currentRun;
                longestIndex = currentIndex;
            }
        }
        return (longestRun - 1) / 2 + longestIndex;
    }
    
    public static void printStalls(boolean[] stalls) {
        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i]) {
                System.out.print("X ");
            }
            else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        boolean[] stalls = new boolean[STALL_NUMBER];
        for (int i = 0; i < stalls.length; i++) {
            stalls[nextStall(stalls)] = true;
            printStalls(stalls);
        }
    }
}
