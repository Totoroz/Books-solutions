/*Write a program that initializes an array with ten random integers and then prints
four lines of output, containing
•    Every element at an even index.
•    Every even element.
•    All elements in reverse order.
•    Only the first and last element.*/

public class P6_01 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("Every even index element:");
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
        System.out.println("Every even element:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
        System.out.println("All elements in reverse order:");
        for (int i = numbers.length - 1; i > -1; i--) {
            System.out.println(numbers[i]);
        }
        System.out.println("First and last element:");
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length - 1]);
    }
}
