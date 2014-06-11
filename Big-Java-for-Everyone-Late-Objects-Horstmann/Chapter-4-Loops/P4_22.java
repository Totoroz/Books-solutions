/*The game of Nim. This is a well-known game with a number of variants. The fol­lowing 
variant has an interesting winning strategy. Two players alternately take
marbles from a pile. In each move, a player chooses how many marbles to take. The
player must take at least one but at most half of the marbles. Then the other player
takes a turn. The player who takes the last marble loses.
Write a program in which the computer plays against a human opponent. Generate a
random integer between 10 and 100 to denote the initial size of the pile. Generate a
random integer between 0 and 1 to decide whether the computer or the human takes
the first turn. Generate a random integer between 0 and 1 to decide whether the
computer plays smart or stupid. In stupid mode the computer simply takes a random
legal value (between 1 and n/2) from the pile whenever it has a turn. In smart mode
the computer takes off enough marbles to make the size of the pile a power of two
minus 1—that is, 3, 7, 15, 31, or 63. That is always a legal move, except when the size
of the pile is currently one less than a power of two. In that case, the computer makes
a random legal move.
You will note that the computer cannot be beaten in smart mode when it has the first
move, unless the pile size happens to be 15, 31, or 63. Of course, a human player who
has the first turn and knows the win­ning strategy can win against the computer.*/

import java.util.Scanner;

public class P4_22 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int size_of_pile = (int) (Math.random() * 91) + 10;
	int current_turn = (int) (Math.random() * 2);
	int smart_or_stupid = (int) (Math.random() * 2);
	while (size_of_pile > 0) {
	    System.out.println("Current number of marlbes in pile: " +  size_of_pile);
	    int marbles_to_remove = 0;
	    if (current_turn == 0) {
		if (smart_or_stupid == 1 || (size_of_pile == 1 || size_of_pile == 3
                    || size_of_pile == 7 || size_of_pile == 15 || size_of_pile == 31
                    || size_of_pile == 63)) {
		    marbles_to_remove = (int) (Math.random() * (size_of_pile / 2 + 1)) + 1;
		}
		else {
		    if (size_of_pile > 63) {
			marbles_to_remove = size_of_pile - 63;
		    }
		    else if (size_of_pile > 31) {
			marbles_to_remove = size_of_pile - 31;
		    }
		    else if (size_of_pile > 15) {
			marbles_to_remove = size_of_pile - 15;
		    }
		    else if (size_of_pile > 7) {
			marbles_to_remove = size_of_pile - 7;
		    }
		    else if (size_of_pile > 3) {
			marbles_to_remove = size_of_pile - 3;
		    }
		    else {
			marbles_to_remove = size_of_pile - 1;
		    }
		}
		System.out.println("Computer removes " + marbles_to_remove  + " marble" + ((marbles_to_remove > 1)? "s": ""));
		current_turn = 1;
	    }
	    else {
		do {
		    System.out.println("How many marbles do you want to remove: ");
		    marbles_to_remove = input.nextInt();
		} while ((marbles_to_remove != 1) && (marbles_to_remove <= 0 || marbles_to_remove > size_of_pile / 2));
		current_turn = 0;
	    }
	    size_of_pile -= marbles_to_remove;
	}
	input.close();
	if (current_turn == 0) {
	    System.out.println("Human took last marble, computer wins!");
	}
	else {
	    System.out.println("Computer took the last  marble, human wins!");
	}
    }
}
