/*Write a program that transforms numbers  1 ,  2 ,  3 , …,  12
into the corresponding month names  January ,  February ,
March , …,  December . Hint: Make a very long string  "January
February March ..." , in which you add spaces such that
each month name has the same length. Then use substring to extract the month you want.*/


import java.util.Scanner;


public class P2_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Month number: ");
        int month = input.nextInt();
        input.close();
        String month_names = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
        String month_text = month_names.substring((month - 1) * 9, month * 9);
        System.out.println(month_text);
    }
}
