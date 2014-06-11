/*French country names are feminine when they end with the letter e, masculine 
otherwise, except for the following which are masculine even though they end with e:
    • le Belize
    • le Cambodge
    • le Mexique
    • le Mozambique
    • le Zaïre
    • le Zimbabwe
Write a program that reads the French name of a country and adds the article: le for
masculine or la for feminine, such as le Canada or la Belgique.
However, if the country name starts with a vowel, use l’; for example, l’Afghanistan.
For the following plural country names, use les:
    • les Etats­Unis
    • les Pays­Bas*/

import java.util.Scanner;

public class P3_29 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Country: ");
	String country = input.next();
	input.close();
	boolean vowel = false;
	boolean plural = false;
	boolean feminine = false;

	char first_letter = country.charAt(0);
	if (country.equals("Etats-Unis") || country.equals("Pays-Bas")) {
	    plural = true;
	}
	else if (first_letter == 'a' || first_letter == 'A'
		|| first_letter == 'e' || first_letter == 'E'
		|| first_letter == 'i' || first_letter == 'I'
		|| first_letter == 'o' || first_letter == 'O'
		|| first_letter == 'u' || first_letter == 'U') {
	    vowel = true;
	}
	else if (!(country.equals("Belize") || country.equals("Cambodge")
		|| country.equals("Mexique") || country.equals("Mozambique")
		|| country.equals("Zaïre") || country.equals("Zimbabwe"))) {
	    if (country.charAt(country.length() - 1) == 'e') {
		feminine = true;
	    }
	}
	if (vowel) {
	    country = "l’" + country;
	}
	else if (plural) {
	    country = "les " + country;
	}
	else if (feminine) {
	    country = "la " + country;
	}
	else {
	    country = "le " + country;
	}
	System.out.println(country);
    }
}
