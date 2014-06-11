/*Write a program that reads a number between 1,000 and 999,999 from the user and
prints it with a comma separating the thousands.
Here is a sample dialog:
   Please enter an integer between 1000 and 999999: 23456
   23,456*/


import java.util.Scanner;


public class P2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Integer between 1 000 and 999 999: ");
        String number = input.next();
        input.close();
        String postfix = number.substring(number.length() - 3);
        String prefix = number.substring(0, number.length() - 3);
        System.out.println(prefix + "," + postfix);
    }
}
