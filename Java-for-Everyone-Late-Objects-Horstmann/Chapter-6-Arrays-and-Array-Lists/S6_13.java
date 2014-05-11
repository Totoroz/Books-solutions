/*Write a loop that counts how many elements in an array are equal to zero.*/

public class S6_13 {
    public static int zerosCount(double[] array) {
        int count = 0;
        for (double element : array) {
            if (element == 0) {
                count += 1;
            }
        }
        return count;
    }
}
