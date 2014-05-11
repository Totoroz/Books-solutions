/*Write programs with loops that compute
     a.  The sum of all even numbers between 2 and 100 (inclusive).
     b.  The sum of all squares between 1 and 100 (inclusive).
     c.  All powers of 2 from 2 0 up to 2 20 .
     d.  The sum of all odd numbers between  a and  b (inclusive), where  a and  b are
     inputs.
     e.  The sum of all odd digits of an input. (For example, if the input is 32677, the
     sum would be 3 + 7 + 7 = 17.)*/

import java.util.Scanner;

public class P4_01 {
    public static void main(String[] args) {
	double even_sum = 0;
	for (int i = 0; i < 101; i += 2) {
	    even_sum += i;
	}
	System.out.println("Evens sum: " + even_sum);
	
	double square_sum = 0;
	for (int i = 1; i < 101; i++) {
	    square_sum += i * i;	    
	}
	System.out.println("Squares sum: " + square_sum);
	
	double powers_sum = 0;
	for (int i = 0; i < 21; i++) {
	    powers_sum 	+= Math.pow(2, i);
	}
	System.out.println("Powers of 2 sum: " + powers_sum);
	
	
	Scanner input = new Scanner(System.in);
	System.out.print("Range a: ");
	int a_range = input.nextInt();
	System.out.print("Range b: ");
	int b_range = input.nextInt();
	double odd_sum = 0;
	for (int i = a_range; i <= b_range; i++) {
	    if (i % 2 == 0) {
		odd_sum += i;
	    }
	}
	System.out.println("Odd numbers in range a-b sum: " + odd_sum);
	
	System.out.print("Number: ");
	int number = input.nextInt();
	input.close();
	int odd_digits_sum = 0;
	while (number > 0) {
	    int digit = number % 10;
	    if (digit % 2 != 0) {
		odd_digits_sum += digit;
	    }
	    number /= 10;
	}
	System.out.printf("Sum of %s's odd digits: %f", number, odd_digits_sum);
    }
}
