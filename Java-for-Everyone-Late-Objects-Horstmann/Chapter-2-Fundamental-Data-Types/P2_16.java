//Write a program that reads a five-digit positive integer and breaks it into a sequence
//of individual digits. For example, the input 16384 is displayed as
//1 6 3 8 4


import java.util.Scanner;


public class P2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Five-digit number: ");
        int number = input.nextInt();
        input.close();
        int digit_a = number % 10; 
        number /= 10;
        int digit_b = number % 10;
        number /= 10;
        int digit_c = number % 10;
        number /= 10;
        int digit_d = number % 10;
        int digit_e = number /  10;
        System.out.printf("%d %d %d %d %d", digit_e, digit_d, digit_c, digit_b, digit_a);
    }
}
