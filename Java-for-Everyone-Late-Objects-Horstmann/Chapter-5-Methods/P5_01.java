/*Write the following methods and provide a program to test them.
a.	 double smallest(double x, double y, double z) , returning the smallest of the
arguments
b.	 double average(double x, double y, double z) , returning the average of the
arguments*/


public class P5_01 {
    public static double smallest(double x, double y, double z) {
	return ((x <= y && x < z) || (x < y && x <= z))? x :
		(y < x && y < z)? y: z;
    }
    public static double average(double x, double y, double z) {
	return (x + y + z) / 3;
    }
}
