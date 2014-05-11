/*
 * Write a program that takes user input describing a playing card in the following shorthand
 * notation: A Ace 2 ... 10 Card values J Jack Q Queen K King D Diamonds H Hearts S Spades C Clubs
 * Your program should print the full description of the card. For example, Enter the card notation:
 * QS Queen of Spades
 */

import java.util.Scanner;

public class P3_14 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Your card: ");
    String card = input.next();
    input.close();
    String value = card.substring(0, card.length() - 1);
    String suit = card.substring(card.length() - 1);
    String card_name = "";

    if (value.compareTo("A") == 0) {
      card_name = "Ace";
    } else if (value.compareTo("J") == 0) {
      card_name = "Jack";
    } else if (value.compareTo("Q") == 0) {
      card_name = "Queen";
    } else if (value.compareTo("K") == 0) {
      card_name = "King";
    } else {
      card_name = value;
    }

    if (suit.compareTo("D") == 0) {
      card_name += " of Diamonds";
    } else if (suit.compareTo("H") == 0) {
      card_name += " of Hearts";
    } else if (suit.compareTo("S") == 0) {
      card_name += " of Spades";
    } else if (suit.compareTo("C") == 0) {
      card_name += " of Clubs";
    }
    System.out.println(card_name);
  }
}
