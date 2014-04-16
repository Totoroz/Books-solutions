# Unit tests for P10_21.py


# IMPORTS
from nose.tools import ok_, eq_
from P10_21 import CheckingAccount


class TestCheckingsAccount():
    def setup(self):
        self.c = CheckingAccount()

    def test_is_free(self):
        ok_(True, self.c.is_free())

    def test_deposit(self):
        self.c.deposit(500)
        ok_(500, self.c.getBalance())

    def test_withdraw(self):
        self.c.deposit(500)
        self.c.withdraw(200)
        ok_(300, self.c.getBalance())

    def test_withdraw_fee(self):
        self.c.deposit(500)
        self.c.withdraw(100)
        self.c.withdraw(100)
        self.c.withdraw(100)
        ok_(300, self.c.getBalance())
        self.c.withdraw(100)
        eq_(False, self.c.is_free())
        ok_(199, self.c.getBalance())

    def test_deposit_fee(self):
        self.c.deposit(100)
        self.c.deposit(100)
        self.c.deposit(100)
        ok_(300, self.c.getBalance())
        self.c.deposit(100)
        eq_(False, self.c.is_free())
        ok_(399, self.c.getBalance())
