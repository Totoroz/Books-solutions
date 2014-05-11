/* Write a program that helps a person decide whether to buy a hybrid car. 
Your pro gram’s inputs should be:
 • The cost of a new car
 • The estimated miles driven per year
 • The estimated gas price
 • The efficiency in miles per gallon
 • The estimated re-sale value after 5 years
Compute the total cost of owning the car for five years. 
(For simplicity, we will not take the cost of financing into account.) 
Obtain realistic prices for a new and used hybrid and a comparable car from the Web.
Run your program twice, using today’s gas price and 15,000 miles per year. */


import java.util.Scanner;


public class P2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Car cost: ");
        double car_cost = input.nextDouble();
        System.out.print("Miles driven: ");
        double miles_driven = input.nextDouble();
        System.out.print("Gas price: ");
        double gas_price = input.nextDouble();
        System.out.print("Fuel Efficiency: ");
        double fuel_efficiency = input.nextDouble();
        System.out.print("Re-sale value:  ");
        double resale_value = input.nextDouble();
        input.close();
        double cost_to_own = car_cost * (fuel_efficiency * miles_driven * gas_price);
        System.out.printf("Cost to own: %.2f", cost_to_own);
        System.out.println("Cost after re-sale: " + (car_cost - resale_value));
    }
}
