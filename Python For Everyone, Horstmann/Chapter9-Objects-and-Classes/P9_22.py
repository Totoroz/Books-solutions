# Implement a class Portfolio . This class has two objects, checking and savings , of the
# type BankAccount that was developed in Worked Example 9.1 ( ch09/bank­­account.py in
# your code files). Implement four methods:
# •    def deposit(self, amount, account)
# •    def withdraw(self, amount, account)
# •    def transfer(self, amount, account)
# •    def getBalance(self, account)
# Here the account string is "S" or "C" . For the deposit or withdrawal, it indicates which
# account is affected. For a transfer, it indicates the account from which the money is
# taken; the money is automatically trans­ferred to the other account.


# IMPORTS
from bankaccount import BankAccount


class Portfolio():
    def __init__(self):
        self._checkings = BankAccount()
        self._savings = BankAccount()

    def get_balance(self, account):
        if account == "C":
            self._checkings.getBalance()
        elif account == "S":
            self._savings.getBalance()

    def deposit(self, amount, account):
        if account == "C":
            self._checkings.deposit(amount)
        elif account == "S":
            self._savings.deposit(amount)

    def withdraw(self, amount, account):
        if account == "C":
            self._checkings.withdraw(amount)
        elif account == "S":
            self._savings.withdraw(amount)

    def transfer(self, amount, account):
        if account == "C":
            amount_to_transfer = self._checkings.withdraw(amount)
            self._savings.deposit(amount_to_transfer)
        elif account == "S":
            amount_to_transfer = self._savings.withdraw(amount)
            self._checkings.deposit(amount_to_transfer)
