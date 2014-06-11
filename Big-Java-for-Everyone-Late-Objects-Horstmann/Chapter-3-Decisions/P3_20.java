/*Write a program that prompts for the day and month of the user’s birthday and then
prints a horoscope. Make up fortunes for programmers, like this:
     Please enter your birthday.
     month: 6
     day: 16
     Gemini are experts at figuring out the behavior of complicated programs.
     You feel where bugs are coming from and then stay one step ahead. Tonight,
     your style wins approval from a tough critic.
 Each fortune should contain the name of the astrological sign. (You will find the
 names and date ranges of the signs at a distressingly large number of sites on the
 Internet.)*/

import java.util.Scanner;


public class P3_20 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your birthday.");
	System.out.print("Month: ");
	int month = input.nextInt();
	System.out.print("Day: ");
	int day = input.nextInt();
	input.close();
	String sign;
	if (month < 1 || month > 12) {
	    System.out.println("Invalid month number. Months are between 1-12");
	    return;
	}
	
	else if (day < 1 || day > 31) {
	    System.out.println("Invalid day number. Days are between 1-31");
	    return;
	}
	
	else if (month == 1) {
	    if (day <= 19) {
		sign = "Capricorn";
	    }
	    else {
		sign = "Aquarius";
	    }
	}
	else if (month == 2) {
	    if (day <= 18) {
		sign = "Aquarius";
	    }
	    else {
		sign = "Pisces";
	    }
	}
	else if (month == 3) {
	    if (day <= 20) {
		sign = "Pisces";
	    }
	    else {
		sign = "Aries";
	    }
	}
	else if (month == 4) {
	    if (day <= 19) {
		sign = "Aries";
	    }
	    else {
		sign = "Taurus";
	    }
	}
	else if (month == 5) {
	    if (day <= 20) {
		sign = "Taurus";
	    }
	    else {
		sign = "Gemini";
	    }
	}
	else if (month == 6) {
	    if (day <= 21) {
		sign = "Gemini";
	    }
	    else {
		sign = "Cancer";
	    }
	}
	else if (month == 7) {
	    if (day <= 22) {
		sign = "Cancer";
	    }
	    else {
		sign = "Leo";
	    }
	}
	else if (month == 8) {
	    if (day <= 22) {
		sign = "Leo";
	    }
	    else {
		sign = "Virgo";
	    }
	}
	else if (month == 9) {
	    if (day <= 22) {
		sign = "Virgo";
	    }
	    else {
		sign = "Libra";
	    }
	}
	else if (month == 10) {
	    if (day <= 23) {
		sign = "Libra";
	    }
	    else {
		sign = "Scorpio";
	    }
	}
	else if (month == 11) {
	    if (day <= 21) {
		sign = "Scorpio";
	    }
	    else {
		sign = "Sagittarius";
	    }
	}
	else {
	    if (day <= 21) {
		sign = "Sagittarius";
	    }
	    else {
		sign = "Capricorn";
	    }
	}
	
	System.out.println("Your sign: " + sign);
	String fortune;
	if (sign.equals("Capricorn")) {
	    fortune = "Example Capricorn fortune";
	}
	else if (sign.equals("Aquarius")) {
	    fortune = "Example Aquarius fortune";
	}
	else if (sign.equals("Pisces")) {
	    fortune = "Example Pisces fortune";
	}
	else if (sign.equals("Aries")) {
	    fortune = "Example Aries fortune";
	}
	else if (sign.equals("Taurus")) {
	    fortune = "Example Taurus fortune";
	}
	else if (sign.equals("Gemini")) {
	    fortune = "Example Gemini fortune";
	}
	else if (sign.equals("Cancer")) {
	    fortune = "Example Cancer fortune";
	}
	else if (sign.equals("Leo")) {
	    fortune = "Example Leo fortune";
	}
	else if (sign.equals("Virgo")) {
	    fortune = "Example Virgo fortune";
	}
	else if (sign.equals("Libra")) {
	    fortune = "Example Libra fortune";
	}
	else if (sign.equals("Scorpio")) {
	    fortune = "Example Scorpio fortune";
	}
	else {
	    fortune = "Unknown sign. You're a special one.";
	}
	System.out.println("Your sign: " + fortune);
    }
}
