/*Turn a string containing a 10 digit phone number into a more readable string with parentheses
 * and dashes*/


import java.util.Scanner;


public class P2_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tel_number = input.next();
        input.close();
        String area_code = tel_number.substring(0, 4);
        String next_three = tel_number.substring(4, 7);
        String last_four = tel_number.substring(7, 10);
        System.out.printf("(%s) %s-%s", area_code, next_three, last_four);
    }
}
