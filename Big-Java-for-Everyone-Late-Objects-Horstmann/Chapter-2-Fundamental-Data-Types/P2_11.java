/*Write a program that asks the user to input
 • The number of gallons of gas in the tank
 • The fuel efficiency in miles per gallon
 • The price of gas per gallon
Then print the cost per 100 miles and how far the car can go with the gas in the tank.*/


import java.util.Scanner;


public class P2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gas in tank: ");
        double gas_tank = input.nextDouble();
        System.out.print("Fuel efficiency: ");
        double fuel_efficiency = input.nextDouble();
        System.out.print("Price of gas: ");
        double gas_price = input.nextDouble();
        input.close();
        double cost_100_miles = 100 / fuel_efficiency * gas_price;
        System.out.printf("Cost per 100 miles: %.2f\n", cost_100_miles);
        double max_distance = fuel_efficiency * gas_tank;
        System.out.println("Maximum distance: " + max_distance);
    }
}
