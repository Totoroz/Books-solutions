package bg.synd.ATM;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Bank {
    private List<Customer> customers;
    
    public Bank() {
        this.customers = new ArrayList<Customer>();
    }
    
    public void readCustomers(String filename) throws FileNotFoundException {
        Scanner fileIn = new Scanner(new File(filename));
        while (fileIn.hasNext()) {
            int customerNumber = fileIn.nextInt();
            int pin = fileIn.nextInt();
            Customer newCustomer = new Customer(customerNumber, pin);
            this.addCustomer(newCustomer);
        }
        fileIn.close();
    }
    
    public void addCustomer(Customer c) {
        this.customers.add(c);
    }
    
    public Customer findCustomer(int customerNumber, int pin) {
        for (Customer c : this.customers) {
            if (c.match(customerNumber, pin)) {
                return c;
            }
        }
        return null;
    }
} 
