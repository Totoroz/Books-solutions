# Change the CheckingAccount class in How To 10.1 so that a $1 fee is levied for deposits
# or withdrawals in excess of three free monthly transactions. Place the code for com­puting
# the fee into a separate method that you call from the deposit and withdraw
# methods.


class BankAccount():
    def __init__(self):
        self._balance = 0.0

    def deposit(self, amount):
        self._balance = self._balance + amount

    def withdraw(self, amount):
        self._balance = self._balance - amount

    def monthEnd(self):
        return

    def getBalance(self):
        return self._balance


class SavingsAccount(BankAccount):
    def __init__(self):
        super().__init__()
        self._interestRate = 0.0
        self._minBalance = 0.0

    def setInterestRate(self, rate):
        self._interestRate = rate

    def withdraw(self, amount):
        super().withdraw(amount)
        balance = self.getBalance()
        if balance < self._minBalance:
            self._minBalance = balance

    def monthEnd(self):
        interest = self._minBalance * self._interestRate / 100
        self.deposit(interest)
        self._minBalance = self.getBalance()


class CheckingAccount(BankAccount):
    def __init__(self):
        super().__init__()
        self._withdrawals = 0
        self._WITHDRAWAL_FEE = 1

    def deposit(self, amount):
        if self.is_free() is False:
            super().withdraw(self._WITHDRAWAL_FEE)
        super().deposit(amount)

    def withdraw(self, amount):
        if self.is_free() is False:
            super().withdraw(amount + self._WITHDRAWAL_FEE)
        else:
            super().withdraw(amount)

    def monthEnd(self):
        self._withdrawals = 0

    def is_free(self):
        FREE_WITHDRAWALS = 3
        return self._withdrawals > FREE_WITHDRAWALS
