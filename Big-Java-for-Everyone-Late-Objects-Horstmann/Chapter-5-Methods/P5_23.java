/*Write a program that prints instructions to get coffee, asking the user for input
whenever a decision needs to be made. Decompose each task into a method, for
example:
    public static void brewCoffee()
    {
        System.out.println(“Add water to the coffee maker.”);
        System.out.println(“Put a filter in the coffee maker.”);
        grindCoffee();
        System.out.println(“Put the coffee in the filter.”);
        . . .
    }*/

import java.util.Scanner;

public class P5_23 {
    public static void grindCoffee() {
        System.out.println("Add coffee beans to the coffee grinder.");
        System.out.println("Push the button for 60 seconds.");
    }
    public static void brewCoffee() {
        System.out.println("Add water to the coffee maker.");
        System.out.println("Put a filter in coffee maker.");
        grindCoffee();
        System.out.println("Add coffee beans to filer.");
        System.out.println("Trun coffee maker on.");
    }
    public static void boilWater() {
        System.out.println("Is there a microwave available? (yes/no) ");
        Scanner input = new Scanner(System.in);
        String result = input.next();
        if (result.equals("yes"))
        {
            System.out.println("Fill cup with water.");
            System.out.println("Place cup in microwave.");
            System.out.println("Heat for three minutes.");
        }
        else
        {
            System.out.println("Fill a kettle with water.");
            System.out.println("Heat kettle on stove until water comes " + "to a boil.");
        }
        input.close();
    }
    public static void makeCoffee() {
        System.out.println("Is there instant coffee available? (yes/no)");
        Scanner input = new Scanner(System.in);
        String result = input.next();
        if (result.equals("yes"))
        {
            boilWater();
            System.out.println("Mix boiling water with instant coffee.");
        }
        else
        {
            brewCoffee();
        }
        input.close();
    }
    public static void getCoffee() {
        System.out.println("Can you ask someone? (yes/no) ");
        Scanner input = new Scanner(System.in);
        String result = input.next();
        if (result.equals("no"))
        {
            System.out.println("You must make coffee.");
            makeCoffee();
        }
        else
        {
            System.out.println("Ask for some.");
        }
        input.close();
    }
}
