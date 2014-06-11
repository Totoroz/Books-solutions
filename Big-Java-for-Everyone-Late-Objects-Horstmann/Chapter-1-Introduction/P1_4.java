/*
Write a program that prints the balance of an account
after the first, second and third year.
Initial balance is $10000 and interest per year - 5%
*/


public class P1_4 {
    public static void main(String[] args) {
        System.out.print("Account balance:");
        int account_balance = 10000;
        System.out.println(account_balance);

        System.out.print("\nInterest per year: ");
        int interest_per_year = 5;
        System.out.println(interest_per_year);

        double balance_after_first_year = account_balance + account_balance * interest_per_year;
        System.out.print("Balance after first year: ");
        System.out.println(balance_after_first_year);

        double balance_after_second_year = balance_after_first_year * 2;
        System.out.print("Balance after second year: ");
        System.out.println(balance_after_second_year);

        double balance_after_third_year = balance_after_first_year * 3;
        System.out.print("Balance after third year: ");
        System.out.println(balance_after_third_year);

    }
}
