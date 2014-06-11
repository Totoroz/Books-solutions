/*Write a method that computes the balance of a bank account with a given initial
­balance and interest rate, after a given number of years. Assume interest is com­pounded yearly.*/

public class P5_22 {
    public static double computeBalance(double init_balance, double interest, int years) {
        return init_balance * Math.pow((1 + interest), years);
    }
}
