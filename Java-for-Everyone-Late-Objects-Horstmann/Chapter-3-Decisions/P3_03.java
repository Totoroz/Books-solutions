/*Write a program that reads an integer and prints how many digits the number has, by
checking whether the number is ≥ 10, ≥ 100, and so on. (Assume that all integers are
less than ten billion.) If the number is negative, first multiply it by –1.*/


import java.util.Scanner;


public class P3_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextInt();
        input.close();
        int num_digits = 1;
        if (number < 0) number *= -1;
        if (number >= 10 && number < 100)
        {
            num_digits = 2;
        }
        else if (number >= 100 && number < 1000) 
        {
            num_digits = 3;
        }
        else if (number >= 1000 && number < 10000)
        {
            num_digits = 4;
        }
        else if (number >= 10000 && number< 100000)
        {
            num_digits = 5;            
        }
        else if (number >= 100000 && number < 1000000)
        {
            num_digits = 6;            
        }
        else if (number >= 1000000 && number < 10000000)
        {
            num_digits = 7;
        }
        else if (number >= 10000000 && number < 100000000)
        {
            num_digits = 8;            
        }
        else if (number >= 100000000 && number < 1000000000)
        {
            num_digits = 9;
        }
        else if (number >= 1000000000 && number < 1000000000)
        {
            num_digits = 10;
        }
        else
        {
            System.out.println("Number greater than 10 billion.");
        }
        System.out.printf("Num digits: %d", num_digits);
    }
}
