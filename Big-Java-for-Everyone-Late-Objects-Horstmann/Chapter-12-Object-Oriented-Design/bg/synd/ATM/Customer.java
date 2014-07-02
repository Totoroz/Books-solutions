package bg.synd.ATM;

public class Customer {
    private int customerNumber;
    private int pin;
    private BankAccount checkingsAccount;
    private BankAccount savingsAccount;
    
    public Customer(int customerNumber, int pin) {
        this.customerNumber = customerNumber;
        this.pin = pin;
        this.checkingsAccount = new BankAccount();
        this.savingsAccount = new BankAccount();
    }
    
    public boolean match(int customerNumber, int pin) {
        return this.customerNumber == customerNumber && this.pin == pin;
    }
    
    public BankAccount getCheckingsAccount() {
        return this.checkingsAccount;
    }
    
    public BankAccount getSavingsAccount() {
        return this.savingsAccount;
    }
}
