/*The Fibonacci numbers.
 Reformulate that as
     fold1 = 1
     fold2 = 1
     fnew = fold1 + fold2
 After that, discard  fold2 , which is no longer needed, and set  fold2 to  fold1 and  fold1 to
 fnew . Repeat an appropriate number of times.
 Implement a program that prompts the user for an integer n and prints the nth
 Fibonacci number, using the above algorithm.*/

import java.util.Scanner;

public class P4_16 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Number: ");
	int number = input.nextInt();
	input.close();
	int fold1 = 1;
	int fold2 = 1;
	
	if (number >= 1) {
	    System.out.println("Fib 1 = " + fold1);
	}
	if (number >= 2) {
	    System.out.println("Fib 2 = " + fold2);
	}
	
	for (int i = 3; i <= number; i++) {
	    int fnew = fold1 + fold2;
	    System.out.println("Fib " + i + " = " + fnew);
	    fold2 = fold1;
	    fold1 = fnew;
	}
    }
}
