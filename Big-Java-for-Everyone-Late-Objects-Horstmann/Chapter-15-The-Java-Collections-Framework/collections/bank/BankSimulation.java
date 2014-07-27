package collections.bank;

import java.util.LinkedList;
import java.util.Queue;

public class BankSimulation extends Simulation {
    private Customer[] tellers;
    private Queue<Customer> customersQueue;
    private int totalCustomers;
    private double totalTime;

    private static final double INTERARRIVAL = 1;
    private static final double PROCESSING = 5;

    public BankSimulation(int numberOfTellers) {
        this.tellers = new Customer[numberOfTellers];
        this.customersQueue = new LinkedList<Customer>();
        this.totalCustomers = 0;
        this.totalTime = 0;
    }

    public void add(Customer c) {
        boolean added = false;
        for (int i = 0; !added && i < this.tellers.length; i++) {
            if (this.tellers[i] == null) {
                this.addToTeller(i, c);
                added = true;
            }
        }
        if (!added) {
            this.customersQueue.add(c);
        }
        super.addEvent(new ArrivalEvent(super.getCurrentTime() + super.expdist(PROCESSING)));
    }

    private void addToTeller(int i, Customer c) {
        this.tellers[i] = c;
        this.addEvent(new DepartureEvent(super.getCurrentTime() + super.expdist(PROCESSING), i));
    }

    public void remove(int i) {
        Customer c = this.tellers[i];
        this.tellers[i] = null;
        this.totalCustomers += 1;
        this.totalTime += super.getCurrentTime() - c.getArrivalTime();
        if (this.customersQueue.size() > 0) {
            this.addToTeller(i, this.customersQueue.remove());
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < this.tellers.length; i++) {
            if (this.tellers[i] == null) {
                System.out.print('.');
            } else {
                System.out.print('C');
            }
        }
        System.out.print('<');
        int q = this.customersQueue.size();
        for (int i = 1; i <= q; i++) {
            System.out.print('C');
        }
        System.out.println();
    }

    @Override
    public void displaySummary() {
        double averageTime = 0;
        if (this.totalCustomers > 0) {
            averageTime = this.totalTime / this.totalCustomers;
        }
        System.out.println(this.totalCustomers  + " customers. Average time " + averageTime + " minutes .");
    }
}
