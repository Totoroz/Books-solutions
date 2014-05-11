/*Write a program that reads an integer and prints if it's positive or negative.*/


import java.util.Scanner;


public class P3_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        input.close();
        System.out.println((number > 0)?  "Positive":
                           (number == 0)? "Zero":
                                          "Negative");
    }
}
