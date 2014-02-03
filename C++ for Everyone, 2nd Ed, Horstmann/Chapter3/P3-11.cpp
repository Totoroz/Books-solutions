Write a program that takes user input describing a playing card in the following
shorthand notation :
A Ace
2 ... 10 Card values
J Jack
Q Queen
K King
D Diamonds
H Hearts
S Spades
C Clubs
120 Chapter 3 Decisions
Your program should print the full description of the card.For example,
Enter the card notation : QS
Queen of Spades

#include <iostream>
#include <string>

using namespace std;

int main()
{
    cout << "Enter the notation for the card: ";
    string card;
    cin >> card;

    string value_code;
    string suit_code;

    if(card.length() == 3)
    {
      value_code = card.substr(0, 2);
      suit_code = card.substr(2, 1);
    }
    else
    {
      value_code = card.substr(0, 1);
      suit_code = card.substr(1, 1);
    }

    string value;

    if(value_code == "A")
    {
      value = "Ace";
    }
    else if(value_code == "K")
    {
      value = "King";
    }
    else if(value_code == "Q")
    {
      value = "Queen";
    }
    else if(value_code == "J")
    {
      value = "Jack";
    }
    else
    {
      value = value_code;
    }

    string suit;
    if(suit_code == "H")
    {
      suit = "Hearts";
    }
    else if(suit_code == "D")
    {
      suit = "Diamonds";
    }
    else if(suit_code == "C")
    {
      suit = "Clubs";
    }
    else
    {
      suit = "Spades";
    }

    cout << "That card is the " << value << " of " << suit << endl;

    return 0;
}
