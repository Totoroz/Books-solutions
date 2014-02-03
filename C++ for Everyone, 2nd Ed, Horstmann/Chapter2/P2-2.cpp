//Write a program that computes and displays the circumference of a letter - size(8.5 ×
//	11 inches) sheet of paper and the length of its diagonal

#include<iostream>
#include<cmath>

using namespace std;

int main()
{
    // Define constants for paper size in inches
    const double PAPER_WIDTH_IN = 8.5;
    const double PAPER_LENGTH_IN = 11.0;


    // Define a variable and calculate circumference
    double circum = (2 * PAPER_WIDTH_IN) + (2 * PAPER_LENGTH_IN);

    // Define a variable and calculate the diagonal
    double diagonal = sqrt((PAPER_WIDTH_IN * PAPER_WIDTH_IN) + (PAPER_LENGTH_IN * PAPER_LENGTH_IN));

    // Display (print to screen) the circumference and diagonal
    cout << "The circumference of a letter-sized sheet of paper is " << circum << " inches." << endl;
    cout << "Its diagonal is " << diagonal << " inches." << endl;


    return 0;
}
