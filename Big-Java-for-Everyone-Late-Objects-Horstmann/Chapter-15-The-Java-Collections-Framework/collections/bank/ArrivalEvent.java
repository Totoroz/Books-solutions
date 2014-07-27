package collections.bank;

public class ArrivalEvent extends Event {
    public ArrivalEvent(double time) {
        super(time);
    }

    @Override
    public void process(Simulation sim) {
        double now = sim.getCurrentTime();
        BankSimulation bank = (BankSimulation) sim;
        Customer c = new Customer(now);
        bank.add(c);
    }
}
