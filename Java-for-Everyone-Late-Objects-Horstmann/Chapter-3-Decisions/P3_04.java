/*Write a program that reads three different numbers and prints if they're "all the same",
 * "all different" or "neither".*/


import java.util.Scanner;

public class P3_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        input.close();
        
        if ((n1 == n2) && (n2 == n3))
        {
            System.out.println("All the same");
        }
        else if ((n1 != n2) && (n1 != n3))
        {
            System.out.println("All different");
        }
        else
        {
            System.out.println("Neither");
        }
    }
}
