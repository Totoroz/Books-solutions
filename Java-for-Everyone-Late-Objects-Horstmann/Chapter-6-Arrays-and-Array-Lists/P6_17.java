import java.util.ArrayList;

/*In this assignment, you will model the game of Bulgarian Solitaire. The game starts
 with 45 cards. (They need not be playing cards. Unmarked index cards work just as
 well.) Randomly divide them into some number of piles of random size. For exam­
 ple, you might start with piles of size 20, 5, 1, 9, and 10. In each round, you take one
 card from each pile, forming a new pile with these cards. For example, the sample
 starting configuration would be transformed into piles of size 19, 4, 8, 9, and 5. The
 solitaire is over when the piles have size 1, 2, 3, 4, 5, 6, 7, 8, and 9, in some order. 
 (It can be shown that you always end up with such a configuration.)
 In your program, produce a random starting configuration and print it. Then keep  applying the
 soli­taire step and print the result. Stop when the solitaire final configuration is reached.*/

public class P6_17 {
    public static ArrayList<Integer> createPile() {
        int cards = 45;
        ArrayList<Integer> pile = new ArrayList<Integer>();
        while (cards > 0) {
            int randomCard = (int) (Math.random() * 45) + 1;
            cards -= randomCard;
            pile.add(randomCard);
        }
        System.out.println("Initial piles: " + pile.toString());
        return pile;
    }

    public static void clearZeros(ArrayList<Integer> pile) {
        for (int i = 0; i < pile.size(); i++) {
            if (pile.get(i) == 0) {
                pile.remove(i);
                i -= 1;
            }
        }
    }

    public static void nextRound(ArrayList<Integer> pile) {
        for (int i = 0; i < pile.size(); i++) {
            pile.set(i, pile.get(i) - 1);
        }
        System.out.println(pile.toString());
    }

    public static boolean finalConfig(ArrayList<Integer> pile) {
        if (pile.size() != 9) {
            return false;
        }
        boolean dupes = false;
        for (int i = 0; i < pile.size(); i++) {
            for (int j = 1; j < pile.size(); j++) {
                if (pile.get(i) == pile.get(j)) {
                    dupes = true;
                }
            }
        }
        if (dupes) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> pile = createPile();
        while (finalConfig(pile) == false) {
            nextRound(pile);
        }
    }
}
