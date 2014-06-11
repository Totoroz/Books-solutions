import java.util.Arrays;

/*Write a loop that fills an array values with ten random numbers between 1 and 100.
Write code for two nested loops that fill values with ten different random numbers
between 1 and 100.*/

public class R6_04 {
    public static void main(String[] args) {
        // ten random numbers  between 1 and 100
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(numbers));
        
        // ten different random numbers between 1 and 100
        for (int i = 0; i < 10; i++) {
            int count = 0;
            numbers[i] = (int) (Math.random() * 100 + 1);
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    count += 1;
                }
            }
            if (count > 0) {
                i -= 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
