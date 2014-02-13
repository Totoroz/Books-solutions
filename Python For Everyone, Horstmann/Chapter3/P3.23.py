# The original U.S. income tax of 1913 was quite simple. The tax was
#     • 1 percent on the first $50,000.
#     • 2 percent on the amount over $50,000 up to $75,000.
#     • 3 percent on the amount over $75,000 up to $100,000.
#     • 4 percent on the amount over $100,000 up to $250,000.
#     • 5 percent on the amount over $250,000 up to $500,000.
#     • 6 percent on the amount over $500,000.
# There was no separate schedule for single or married taxpayers. Write a program that
# computes the income tax according to this schedule.

income = float(input("Enter your income: $"))

if income > 0:
    if income <= 50000:
        tax = income * 0.01

    elif income > 50000 and income <= 75000:
        tax = income * 0.02

    elif income > 75000 and income <= 100000:
        tax = income * 0.03

    elif income > 100000 and income <= 250000:
        tax = income * 0.04

    elif income > 250000 and income <= 500000:
        tax = income * 0.05

    else:
        tax = income * 0.06

    print("Your tax is: $%f" % tax)

else:
    print("Invalid input")