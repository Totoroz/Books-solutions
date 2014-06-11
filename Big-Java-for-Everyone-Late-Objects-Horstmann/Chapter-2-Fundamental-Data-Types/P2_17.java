/*Write a program that reads two times in military format (0900, 1730) and prints the
number of hours and minutes between the two times. Here is a sample run. User
input is in color.
 Please enter the first time: 0900
 Please enter the second time: 1730
8 hours 30 minutes
Extra credit if you can deal with the case where the first time is later than the second:
 Please enter the first time: 1730
 Please enter the second time: 0900
15 hours 30 minutes*/


import java.util.Scanner;


public class P2_17 {
    public static void main(String[] args) {
        final int MINUTES_IN_HOUR = 60;
        final int MINUTES_IN_DAY = 24 * 60;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the first time: ");
        int firstTime = in.nextInt();
        int firstTimeInMinutes = firstTime / 100 * MINUTES_IN_HOUR + firstTime % 100;
        System.out.print("Please enter the second time: ");
        int secondTime = in.nextInt();
        in.close();
        int secondTimeInMinutes = secondTime / 100 * MINUTES_IN_HOUR + secondTime % 100;
        int minutes = secondTimeInMinutes - firstTimeInMinutes;
        minutes = (MINUTES_IN_DAY + minutes) % MINUTES_IN_DAY;
        int hours = minutes / 60;
        minutes %= 60;
        System.out.printf("%d hours %d minutes", hours, minutes);
    }
}
