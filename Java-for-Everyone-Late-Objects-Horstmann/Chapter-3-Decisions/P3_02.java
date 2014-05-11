/*Write a program that reads a floating ­point number and prints “zero” if the number
  is zero. Otherwise, print “positive” or “negative”. Add “small” if the absolute value
  of the number is less than 1, or “large” if it exceeds 1,000,000.
Note: my solutions aim to test my knowledge of the ternary operator. You can always solve the problem
with a normal if/else if/else statement*/


import java.util.Scanner;


public class P3_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        double number = input.nextDouble();
        input.close();
        System.out.print((number > 0)? 
                             (number < 1)? "Positive small":
                             (number > 1000000)? "Positive large":
                             "Positive":
                         (number < 0)? 
                             (number < 1)? "Negative small":    
                             (number > 1000000)? "Negative large":
                             "Negative":
                         "Zero");
    }
}
