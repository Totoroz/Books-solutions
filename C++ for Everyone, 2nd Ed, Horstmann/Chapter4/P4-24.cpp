//The game of Nim.This is a well - known game with a number of variants.The
//fol lowing variant has an interesting winning strategy.Two players alternately take
//marbles from a pile.In each move, a player chooses how many marbles to take.The
//player must take at least one but at most half of the marbles.Then the other player
//takes a turn.The player who takes the last marble loses.
//You will write a program in which the computer plays against a human opponent.
//Generate a random integer between 10 and 100 to denote the initial size of the pile.
//Generate a random integer between 0 and 1 to decide whether the computer or the
//human takes the first turn.Generate a random integer between 0 and 1 to decide
//whether the computer plays smart or stupid.In stupid mode the computer simply
//takes a random legal value(between 1 and n?2) from the pile whenever it has a turn.
//In smart mode the computer takes off enough marbles to make the size of the pile a
//power of two minus 1—that is, 3, 7, 15, 31, or 63. That is always a legal move, except
//when the size of the pile is currently one less than a power of two.In that case, the
//computer makes a random legal move.
//You will note that the computer cannot be beaten in smart mode when it has the first
//move, unless the pile size happens to be 15, 31, or 63. Of course, a human player who
//has the first turn and knows the win ning strategy can win against the computer.

#include <iostream>
#include <cmath>
#include <cstdlib>
#include <ctime>

using namespace std;

int main()
{
   int seed = static_cast<int>(time(0));
   srand(seed);

   // Generate size of pile of marbles
   // using formula a + rand() % (b - a + 1)
   int rand_num = 10 + rand() % (100 - 10 + 1);
   int pile = rand_num;

   // If 0, computer goes first; else, player
   rand_num = 0 + rand() % (1 - 0 + 1);
   bool computer_turn = rand_num == 0;

   // If 0, computer plays smart; else, stupid
   rand_num = 0 + rand() % (1 - 0 + 1);
   bool smart = rand_num == 0;

   cout << "Nim.  Players alternate taking at least one but at"
        << endl << "most half of the marbles in the pile."
        << endl << "The player who takes the last marble loses."
        << endl;

   if (computer_turn)
   {
      cout << "The computer will play first." << endl;
   }
   else
   {
      cout << "You will play first." << endl;
   }

   if (smart)
   {
      cout << "The computer will play smart." << endl;
   }
   else
   {
      cout << "The computer will not play smart." << endl;
   }

   int take;

   while(pile > 1)
   {
      cout << "There are " << pile << " marbles in the pile."
           << endl;

      if (computer_turn)
      {
         cout << "Computer plays" << endl;

         int p = 1;
         while (p < (pile + 1)) { p = 2 * p; }
         bool power_of_2 = p == (pile + 1);

         if (smart && !power_of_2)
         {
            take = pile – (pow(2, floor(log(static_cast<double>(pile)) / log(2.0))) - 1);
         }
         else  // not smart play
         {
            rand_num = 1 + rand() % (pile / 2 - 1 + 1);
            take = rand_num;
         }

         cout << "The computer takes " << take << " marbles."
              << endl;
      }
      else
      {
         cout << "Your play .. you may take 1 to " << pile / 2
              << " marbles." << endl;
         cout << "You take: ";
         cin >> take;
         if (take < 1 || take > pile / 2)
         {
            cout << "Ooops, you picked too many or not enough."
                 << endl;
            rand_num = 1 + rand() % (pile / 2 - 1 + 1);
            take = rand_num;
            cout << "You will take " << take << " marbles." << endl;
         }
      }
      pile = pile - take;
      computer_turn = !computer_turn;
   }

   if (computer_turn)  // Computer's turn
   {
       cout << "Computer must take the last marble. "
            << "You win!" << endl;
   }
   else   // Player's turn
   {
       cout << "You must take the last marble. "
          << "You lose!" << endl;
   }

   return 0;
}
