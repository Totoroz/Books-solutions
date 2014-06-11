/*Write the following methods and provide a program to test them.
a.	 boolean allTheSame(double x, double y, double z) , returning true if the arguments
are all the same
b.	 boolean allDifferent(double x, double y, double z) , returning true if the argu-
ments are all different
c.	 boolean sorted(double x, double y, double z) , returning true if the arguments are
sorted, with the largest one coming first*/

public class P5_02 {
    public static boolean allTheSame(double x, double y, double z) {
	return x == y && y == z;
    }
    public static boolean allDifferent(double x, double y, double z) {
	return x != y && x != z && y != z;
    }
    public static boolean sorted(double x, double y, double z) {
	return ((x > y && y > z) || (x >= y && y > z));
    }
}
