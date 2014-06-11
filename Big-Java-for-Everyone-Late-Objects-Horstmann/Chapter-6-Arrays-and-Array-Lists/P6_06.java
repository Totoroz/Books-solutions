/*Compute the alternating sum of all elements in an array. For example, if your program reads the input
    1  4  9  16  9  7  4  9  11
then it computes
1 – 4 + 9 – 16 + 9 – 7 + 4 – 9 + 11 = –2*/

public class P6_06 {
    public static int alternatingSum(int seq[]) {
        int alternateSum = 0;
        for (int i = 0; i < seq.length; i++) {
            if (i % 2 == 0) {
                alternateSum += seq[i];
            }
            else {
                alternateSum -= seq[i];
            }
        }
        return alternateSum;
    }
}
