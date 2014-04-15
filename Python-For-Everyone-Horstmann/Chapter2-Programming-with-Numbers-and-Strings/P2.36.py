# An online bank wants you to create a program that shows prospective customers
# how their deposits will grow. Your program should read the initial balance and the
# annual interest rate. Interest is compounded monthly. Print out the balances after the
# first three months. Here is a sample run:
# Initial balance: 1000
# Annual interest rate in percent: 6.0
# After first month: 1005.00
# After second month: 1010.03
# After third month: 1015.08

initialBalance = float(input("Enter your initial balance: "))
annualInterestRate = float(input("Enter your annual interest rate: "))

print("Initial balance:", initialBalance)
print("Annual interest rate in percent:", (annualInterestRate * 100))
# monthly interest
annualInterestRate /= 12

initialBalance += initialBalance * annualInterestRate
print("After first month:", initialBalance)

initialBalance += initialBalance * annualInterestRate
print("After second month:", initialBalance)

initialBalance += initialBalance * annualInterestRate
print("After third month:", initialBalance)