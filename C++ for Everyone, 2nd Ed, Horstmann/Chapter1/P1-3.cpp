//Write a program that prints out a message “Hello, my name is Hal!” Then, on a new
//line, the program should print the message “What is your name ? ”

#include<iostream>
#include<string>

using namespace std;

int main()
{
    cout << "Holla, my name is Hal!\n";
    cout << "What is your name?\n";

    string user_input;

    getline(cin, user_input);

    cout << "Hello, " << user_input << ". I am glad to meet you!";


    return 0;
}
