//Compute Easter Sunday using the algorithm invented by mathematician Carl Friedrich Gauss in 1800


import java.util.Scanner;


public class P2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Current year: ");
        int y = input.nextInt();
        input.close();
        int a = y % 19;
        int b = y / 100; 
        int c = y % 100;
        int d = b / 4;
        int e = b % 4;
        int g = (8 * b + 13) / 25;
        int h = (19 * a + b - d - g + 15) % 30;
        int j = c / 4;
        int k = c % 4;
        int m = (a + 11 * h) / 319;
        int r = (2 * e + 2 * j - k - h + m + 32) % 7;
        int n = (h - m + r + 90) / 25;
        int p = (h - m + r + n + 19) % 32;
        System.out.println("Easter falls on " + p + "/" + n + "/" + y);
    }
}
