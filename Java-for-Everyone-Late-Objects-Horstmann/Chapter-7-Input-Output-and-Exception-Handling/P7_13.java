import java.util.InputMismatchException;
import java.util.Scanner;

/*Write a program that asks the user to input a set of floating-point values. When the user enters a 
value that is not a number, give the user a second chance to enter the value. After two chances, 
quit reading input. Add all correctly specified values and print the sum when the user is done 
entering data. Use exception handling to detect improper inputs.*/

public class P7_13 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Number: ");
        int tries = 2;
        double sum = 0;
        int count = 0;
        while (tries > 0) {
            try {
                sum += console.nextDouble();
                count += 1;
            } catch (InputMismatchException e) {
                String badInput = console.next();
                tries -= 1;
            }
        }
        console.close();
        double average = sum / count;
        System.out.println("Average: " + average);
    }
}
