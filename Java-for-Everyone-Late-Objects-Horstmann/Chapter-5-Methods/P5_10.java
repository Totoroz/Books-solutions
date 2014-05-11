/*Write a method
public static double readDouble(String prompt)
that displays the prompt string, followed by a space, reads a floating-point number
in, and returns it. Here is a typical usage:
salary = readDouble("Please enter your salary:");
percentageRaise = readDouble("What percentage raise would you like?");*/

import java.util.Scanner;

public class P5_10 {
    public static double readDouble(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt + " ");
        double input_number = input.nextDouble();
        input.close();
        return input_number;
    }
}
