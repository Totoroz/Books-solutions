import java.util.Scanner;

/*Write a loop that reads ten numbers and a second loop that displays them in the
opposite order from which they were entered.*/

public class R6_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;
        System.out.println("Enter 10 numbers: ");
        do {
            System.out.printf("n %d: ", count+1);
            numbers[count] = input.nextInt();
            count += 1;
        } while (count < 10);
        input.close();
        
        for (int i = numbers.length - 1; i > -1; i--) {
            System.out.println(numbers[i]);
        }
    }
}
