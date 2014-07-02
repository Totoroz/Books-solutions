package bg.synd.ATM;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (this.balance - amount < 0) {
            throw new InsufficientFundsException();
        } else {
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    @SuppressWarnings("serial")
    class InsufficientFundsException extends Exception {
        public InsufficientFundsException() {
            super();
        }

        public InsufficientFundsException(String message) {
            super(message);
        }
    }
}
