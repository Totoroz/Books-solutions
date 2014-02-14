# Write a program to simulate a bank transaction. There are two bank accounts:
# checking and savings. First, ask for the initial balances of the bank accounts; reject
# negative balances. Then ask for the transaction; options are deposit, withdrawal, and
# transfer. Then ask for the account; options are checking and savings. Then ask for the
# amount; reject transactions that overdraw an account. At the end, print the balances
# of both accounts

# imports
from sys import exit

savings = float(input("Enter savings balance: "))
checking = float(input("Enter checking balance: "))


if checking < 0 or savings < 0:
    exit("Invalid checking/savings balance. Less than 0?")

choice = str(input("Choose a transaction. 1)Deposit, 2)Withdrawal, 3)Transfer: "))

if choice == "deposit" or choice == "Deposit":
    accountChoice = str(input("To which account?(Savings or Checking)"))

    if accountChoice == "savings" or accountChoice == "Savings":
        amount = float(input("How much you want to deposit? "))
        savings += amount

    elif accountChoice == "checking" or accountChoice == "Checking":
        amount = float(input("How much you want to deposit? "))
        checking += amount

    else:
        exit("Invalid account choice. Exiting...")


elif choice == "withdrawal" or choice == "Withdrawal":
    accountChoice = str(input("To which account? (Savings or Checking"))

    if accountChoice == "savings" or accountChoice == "Savings":
        amount = float(input("How much you want to withdraw? "))
        savings -= amount

    elif accountChoice == "checking" or accountChoice == "Checking":
        amount = float(input("How much you want to withdraw? "))
        checking -= amount

    else:
        exit("Invalid account choice. Exiting...")

elif choice == "transfer" or choice == "Transfer":
    accountChoiceFrom = str(input("From which account?(Savings or Checking) "))
    accountChoiceTo = str(input("To which account?(Savings or Checking) "))

    if accountChoiceFrom == accountChoiceTo:
        exit("Error. Same account to transfer from and to. Exiting...")

    elif accountChoiceFrom == "savings" or accountChoiceFrom == "Savings":
        amount = float(input("How much you want to transfer? "))
        savings -= amount
        checking += amount

    elif accountChoiceFrom == "checking" or accountChoiceFrom == "Checking":
        amount = float(input("How much you want to transfer? "))
        checking -= amount
        savings += amount


print("Balance of Savings:", savings)
print("Balance of Checking:", checking)
