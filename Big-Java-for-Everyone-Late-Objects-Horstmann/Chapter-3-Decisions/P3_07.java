/*Write a program that reads in three integers and prints “in order” if they are sorted in
* ascending or descending order, or “not in order” otherwise. For example,
*     1 2 5 in order
*     1 5 2 not in order
*     5 2 1 in order
*     1 2 2 in order
*/


import java.util.Scanner;


public class P3_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        if ((n1 <= n2  && n2 < n3) || (n1 < n2 && n2 <= n3) || (n1 > n2 && n2 >= n3) || (n1 >= n2 && n2 > n3))
        {
            System.out.println("In order");
        }
        else
        {
            System.out.println("Not in order");
        }
        input.close();
    }
}
