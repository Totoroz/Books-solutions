//The Drunkard’s Walk.A drunkard in a grid of streets randomly picks one of four
//directions and stumbles to the next intersection, then again randomly picks one of
//four directions, and so on.You might think that on average the drunkard doesn’t
//move very far because the choices cancel each other out, but that is actually not
//the case.
//Represent locations as integer pairs(x, y).Implement the drunkard’s walk over 100
//intersections and print the beginning and ending location.

#include <iostream>
#include<cstdlib>
#include <ctime>

using namespace std;

int main()
{
    // Define starting location
    int x_loc = 0;
    int y_loc = 0;

    cout << "Starting location for the drunk is ("
      << x_loc << "," << y_loc << ")." << endl;

    srand(time(0));

    int i = 1;

    // Define compass points
    const int NORTH = 0;
    const int WEST = 1;
    const int EAST = 2;
    const int SOUTH = 3;

    const int NTRIES = 100;

    while (i <= NTRIES)
    {
        int direction = rand() % 4;

        if(direction == NORTH)
        {
            y_loc++;
        }
        else if (direction == EAST)
        {
            x_loc++;
        }
        else if (direction == SOUTH)
        {
            y_loc--;
        }
        else if (direction == WEST)
        {
            x_loc--;
        }
         i++;
    }

    cout << "After " << NTRIES << " intersections, the ending"
        << endl << "location for the drunk is ("
            << x_loc << "," << y_loc << ")." << endl << endl;

    return 0;
}
