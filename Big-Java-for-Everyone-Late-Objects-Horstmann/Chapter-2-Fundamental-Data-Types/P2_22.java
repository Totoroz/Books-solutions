/* Implement a bookstore price computing algorithm */


import java.util.Scanner;


public class P2_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Book price: ");
        double book_price = input.nextDouble();
        System.out.print("Number of books: ");
        int books_number = input.nextInt();
        input.close();
        double tax = book_price * 7.5 / 100;
        final double SHIPPING_FEE = 2;
        double order_price = book_price * books_number + tax + SHIPPING_FEE;
        System.out.print("Order price: " + order_price);
    }
}
