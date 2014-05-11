/*A video club wants to reward its best members with a discount based on the member’s number of movie 
rentals and the number of new members referred by the member. The discount is in percent and is
equal to the sum of the rentals and the referrals, but it cannot exceed 75 percent. 
Write a program to calculate the value of the discount.
Here is a sample run:
    Enter the number of movie rentals: 56
    Enter the number of members referred to the video club: 3
    The discount is equal to: 59.00 percent.*/


import java.util.Scanner;


public class P2_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of movie rentals: ");
        Integer rentals = input.nextInt();
        System.out.print("Number of members referred: ");
        int referrals = input.nextInt();
        input.close();
        final double DISCOUNT_CAP = 75.00;
        double discount = Math.min(rentals + referrals, DISCOUNT_CAP);
        System.out.printf("Your discount is: %.2f percent.", discount);
    }
}
