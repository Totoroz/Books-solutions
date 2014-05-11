/*Write methods
public static double sphereVolume(double r)
public static double sphereSurface(double r)
public static double cylinderVolume(double r, double h)
public static double cylinderSurface(double r, double h)
public static double coneVolume(double r, double h)
public static double coneSurface(double r, double h)
that compute the volume and surface area of a sphere with radius r , a cylinder with a
circular base with radius r and height h , and a cone with a circular base with radius r
and height h . Then write a program that prompts the user for the values of r and h ,
calls the six methods, and prints the results.*/

public class P5_09 {
    public static double sphereVolume(double radius) {
        return 4 / 3 * Math.PI * Math.pow(radius, 3);
    }
    public static double sphereSurface(double radius) {
        return 4 * Math.PI * radius * radius;
    }
    public static double cylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
    public static double cylinderSurface(double radius, double height) {
        return 2 * Math.PI * radius * (radius + height);
    }
    public static double coneVolume(double radius, double height) {
        return 1 / 3 * Math.PI * radius * radius * height;
    }
    public static double coneSurface(double radius, double height) {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }
}
