/*Repeat Exercise P3.5, but before reading the numbers, ask the user whether increas­ing/decreasing 
should be “strict” or “lenient”. In lenient mode, the sequence 3 4 4 is
increasing and the sequence 4 4 4 is both increasing and decreasing*/


import java.util.Scanner;


public class P3_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Strict or lenient? ");
        String mode = input.next().toLowerCase();
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        input.close();
        if (mode.equals("strict"))
        {
            if ((n1 < n2) && (n2 < n3))
            {
                System.out.println("Increasing");
            }
            else if ((n1 > n2) && (n2 > n3))
            {
                System.out.println("Decreasing");
            }
            else
            {
                System.out.println("Neither");
            }
        }
        else if (mode.equals("lenient"))
        {
            if (((n1 <= n2) && (n2 < n3)) || ((n1 < n2 ) && (n2 <= n3)))
            {
                System.out.println("Increasing");
            }
            else if ((n1 >= n2) && (n2 > n3) || ((n1 > n2) && (n2 >= n3)))
            {
                System.out.println("Decreasing");
            }
            else if ((n1 == n2) && (n2 == n3))
            {
                System.out.println("Increasing and decreasing");
            }
            else
            {
                System.out.println("Neither");
            }
        }
    }
}
