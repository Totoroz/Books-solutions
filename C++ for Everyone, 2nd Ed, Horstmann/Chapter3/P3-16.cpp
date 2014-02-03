Write a program that reads in the name and salary of an employee.Here the salary
will denote an hourly wage, such as $9.25.Then ask how many hours the employee
worked in the past week.Be sure to accept fractional hours.Any overtime work
(over 40 hours per week) is paid at 150 percent of the regular wage.Compute the
pay.Print a paycheck for the employee.

#include<iostream>

using namespace std;

int main()
{
    cout << "Enter your name and salary: ";
    string name;
    double salary;
    cin >> name >> salary;

    double hourlyWage = salary / (21*8);
    cout << "Your hourly wage is: $" << hourlyWage << "\n";

    cout << "How much hours did you work last week?: ";
    float lastWeek;
    cin >> lastWeek;

    double pay;

    if(lastWeek > 40)
    {
        float extraWork = (lastWeek - 40);
        pay = (extraWork * 1.50 * hourlyWage) + lastWeek * hourlyWage;
    }

    else

    {
        pay = lastWeek * hourlyWage;
    }

    cout << name << ", you'll get paid " << pay << " for " << lastWeek << " hours of work last week\n";
    return 0;
}
