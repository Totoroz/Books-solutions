/*
 * Write a program that reads four integers and prints “two pairs” if the input consists of two
 * matching pairs (in some order) and “not two pairs” otherwise. For example, 1 2 2 1 two pairs 1 2
 * 2 3 not two pairs 2 2 2 2 two pairs
 */


import java.util.Scanner;

public class P3_08 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double n1 = input.nextDouble();
    double n2 = input.nextDouble();
    double n3 = input.nextDouble();
    double n4 = input.nextDouble();
    if (n1 == n2 || n1 == n3 || n1 == n4 || n2 == n3 || n2 == n4 || n3 == n4) {
      System.out.println("Two pairs");
    } else {
      System.out.println("Not two pairs");
    }
    input.close();
  }
}
