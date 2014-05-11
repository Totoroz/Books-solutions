/*Prime numbers. Write a program that prompts the user for an integer and then prints
 out all prime numbers up to that integer. For example, when the user enters 20, the
 program should print
     2
     3
     5
     7
     11
     13
     17
     19
 Recall that a number is a prime number if it is not divisible by any number except 1
 and itself.*/

import java.util.Scanner;

public class P4_18 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Number: ");
	int number = input.nextInt();
	input.close();
	for (int current_number = 2; current_number <= number; current_number++) {
	    boolean prime = true;
	    int test_number = 2;
	    while (prime && test_number < current_number) {
		if (current_number % test_number == 0) {
		    prime = false;		    
		}
		test_number += 1;
	    }
	    if (prime) {
		System.out.println(current_number);
	    }
	}
    }
}
