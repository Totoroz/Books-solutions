/*Write a program that reads three numbers and prints “increasing” if they are
* in increasing order, “decreasing” if they are in decreasing order, and “neither”
* otherwise. Here, “increasing” means “strictly increasing”, with each value larger
* than its predecessor. The sequence 3 4 4 would not be considered increasing.
*/

import java.util.Scanner;


public class P3_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        input.close();
        System.out.println((n1 > n2 == true) && (n2 > n3 == true)? "Decreasing":
                           (n1 < n2 == true) && (n2 < n3 == true)? "Increasing":
                                                                   "Neither");
    }
}
