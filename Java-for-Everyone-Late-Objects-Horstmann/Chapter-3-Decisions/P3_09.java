/*
 * Write a program that reads a temperature value and the letter C for Celsius or F for #
 * Fahrenheit. Print whether water is liquid, solid, or gaseous at the given temperature at sea
 * level.
 */

import java.util.Scanner;

public class P3_09 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Temperature type: ");
    String temp_type = input.next();
    System.out.print("Temperature value: ");
    double temp_value = input.nextDouble();
    input.close();
    if (temp_type.equals("C")) {
      if (temp_value >= 0 && temp_value <= 100) {
        System.out.println("Water is liquid.");
      } else if (temp_value > 100) {
        System.out.println("Water is gaseous.");
      } else {
        System.out.println("Water is solid.");
      }
    } else if (temp_type.equals("F")) {
      if (temp_value >= 32 && temp_value < 132) {
        System.out.println("Water is liquid.");
      } else if (temp_value >= 132) {
        System.out.println("Water is gaseous.");
      } else {
        System.out.println("Water is solid.");
      }
    }
  }
}
