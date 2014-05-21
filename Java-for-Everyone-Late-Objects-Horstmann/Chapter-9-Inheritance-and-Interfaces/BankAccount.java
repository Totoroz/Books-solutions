import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Scanner;

/*••• P9.18   The System.out.printf method has predefined formats for printing integers, floating-
 point numbers, and other data types. But it is also extensible. If you use the S for­mat,
 you can print any class that implements the Formattable interface. That interface has a
 single method:
 void formatTo(Formatter formatter, int flags, int width, int precision)
 In this exercise, you should make the BankAccount class implement the Formattable
 interface. Ignore the flags and precision and simply format the bank balance, using
 the given width. In order to achieve this task, you need to get an Appendable reference
 like this:
 Appendable a = formatter.out();
 Appendable is another interface with a method
 void append(CharSequence sequence)
 CharSequence is yet another interface that is implemented by (among others) the String
 class. Construct a string by first converting the bank balance into a string and then
 padding it with spaces so that it has the desired width. Pass that string to the append
 method.

 ••• P9.19    Enhance the formatTo method of Exercise P9.18 by taking into account the precision.*/

public class BankAccount implements Formattable {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount() {
        this(0);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount should be positive and greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance - amount >= 0) {
            this.balance -= amount;
        } else if (amount < 0) {
            throw new IllegalArgumentException("Withdraw amount should be positive and greater than 0.");
        } else {
            System.out.println("Error: Withdraw amount exceeds available funds.");
        }
    }

    @Override
    public void formatTo(Formatter formatter, int flags, int width, int precision) {
        Appendable a = formatter.out();
        // round appropriately based on precision
        double rounded = Math.round(balance * Math.pow(10, precision)) / Math.pow(10, precision);
        String balanceString = Double.toString(rounded);
        // add trailing 0s if necessary
        Scanner getDecimal = new Scanner(balanceString);
        getDecimal.useDelimiter("\\.");
        String digitsPart = getDecimal.next();
        String decimalPart = getDecimal.next();
        getDecimal.close();
        if (precision == 0) {
            // remove any decimal part if the precision is 0
            balanceString = digitsPart;
        } else {
            // add remaining extra zeros
            int extraZeros = decimalPart.length();
            while (extraZeros < precision) {
                balanceString = balanceString + "0";
                extraZeros++;
            }
        }
        while (width > balanceString.length()) {
            balanceString = " " + balanceString;
        }
        try {
            a.append(balanceString);
        } catch (IOException e) {
            System.out.println("Error!");
        }
    }

}
