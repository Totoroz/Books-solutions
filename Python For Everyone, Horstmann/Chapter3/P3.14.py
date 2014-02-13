# Write a program that takes user input describing a playing card in the following
# shorthand notation:
#     A Ace
#     2 ... 10  Card values
#     J Jack
#     Q Queen
#     K King
#     D Diamonds
#     H Hearts
#     S Spades
#     C Clubs
# Your program should print the full description of the card. For example,
#     Enter the card notation: QS
#     Queen of Spades

from sys import exit

card = str(input("Enter the notation for the card: "))

valueCode = ""
suitCode = ""

if len(card) == 3:
    valueCode = card[:2]
    suitCode = card[2:3]

else:
    valueCode = card[:1]
    suitCode = card[1:2]

value = ""

if valueCode == "A":
    value = "Ace"

elif valueCode == "K":
    value = "King"

elif valueCode == "Q":
    value = "Queen"

elif valueCode == "J":
    value = "Jack"

elif int(valueCode) >= 2 and int(valueCode) <= 10:
    value = valueCode

else:
    exit("Unknown card. Exiting...")

suit = ""

if suitCode == "H":
    suit = "Hearts"

elif suitCode == "D":
    suit = "Diamonds"

elif suitCode == "C":
    suit = "Clubs"

elif suitCode == "S":
    suit ="Spades"

print("That card is the %s of %s" % (value, suit))