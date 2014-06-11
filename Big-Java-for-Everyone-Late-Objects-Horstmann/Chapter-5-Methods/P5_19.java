/*Use recursion to compute a n , where n is a positive integer. Hint: If n is 1, then
n = a. If n is even, then a n = (a n/2 ) 2 . Otherwise, a n = a × a n–1 .*/

public class P5_19 {
    public static double power(double a, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 1) {
            return a * power(a, n-1);
        }
        return Math.pow(power(a, n / 2), 2);
    }
}
