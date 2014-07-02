package bg.synd.ATM;

import bg.synd.ATM.BankAccount.InsufficientFundsException;

public class ATM {
    private int customerNumber;
    private Customer currentCustomer;
    private BankAccount currentAccount;
    private Bank connectedBank;
    
    private int state;
    protected static final int CHECKING = 1;
    protected static final int SAVINGS = 2;
    
    protected static final int START_STATE = 1;
    protected static final int PIN_STATE = 2;
    protected static final int ACCOUNT_STATE = 3;
    protected static final int TRANSACT_STATE = 4;
    
    public ATM(Bank bank) {
        this.connectedBank = bank;
        this.reset();
    }
    
    public void reset() {
        this.customerNumber = -1;
        this.currentAccount = null;
        this.state = START_STATE;
    }
    
    public void setCustomerNumber(int number) {
        this.customerNumber = number;
        this.state = PIN_STATE;
    }
    
    public void selectCustomer(int pin) {
        this.currentCustomer = this.connectedBank.findCustomer(this.customerNumber, pin);
        if (this.currentCustomer == null) {
            this.state = START_STATE;
        } else {
            this.state = ACCOUNT_STATE;
        }
    }
    
    public void selectAccount(int account) {
        if (account == CHECKING) {
            this.currentAccount = this.currentCustomer.getCheckingsAccount();
        } else {
            this.currentAccount = this.currentCustomer.getSavingsAccount();
        }
        this.state = TRANSACT_STATE;
    }
    
    public void withdraw(double amount) throws InsufficientFundsException {
        this.currentAccount.withdraw(amount);
    }
    
    public void deposit(double amount) {
        this.currentAccount.deposit(amount);
    }
    
    public double getBalance() {
        return this.currentAccount.getBalance();
    }
    
    public void back() {
        if (this.state == TRANSACT_STATE) {
            this.state = ACCOUNT_STATE;
        } else if (this.state == ACCOUNT_STATE) {
            this.state = PIN_STATE;
        } else if (this.state == PIN_STATE) {
            this.state = START_STATE;
        }
    }
    
    public int getState() {
        return this.state;
    }
}
