//Write a program that translates a letter grade into a number grade.Letter grades are
//A, B, C, D, and F, possibly followed by + or –.Their numeric values are 4, 3, 2, 1,
//and 0. There is no F + or F–.A + increases the numeric value by 0.3, a – decreases it
//by 0.3.However, an A + has value 4.0.
//Enter a letter grade : B -
//The numeric value is 2.7.

#include<iostream>

using namespace std;

int main()

{
    cout << "Enter your grade: ";
    string grade;
    getline(cin, grade);

    float score = 0; // skips F grade check

    if(grade[0] == 'A')
    {
        score = 4.0;
    }

    else if(grade[0] == 'B')
    {
        score = 3.0;
    }

    else if(grade[0] == 'C')
    {
        score = 2.0;
    }

    else if(grade[0] == 'D')
    {
        score == 1.0;
    }

    if(grade[1] == '+' && (grade[0] != 'A' && grade[0] != 'F'))
    {
        score += 0.3;
    }

    else if(grade[1] == '-' && grade[0] != 'F')
    {
        score -= 0.3;
    }

    cout << "Your score is : " << score;

    return 0;
}
