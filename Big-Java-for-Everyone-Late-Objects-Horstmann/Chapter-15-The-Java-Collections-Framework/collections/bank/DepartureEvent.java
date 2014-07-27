package collections.bank;

public class DepartureEvent extends Event {
    private int teller;
    public DepartureEvent(double eventTime, int teller) {
        super(eventTime);
        this.teller = teller;
    }

    @Override
    public void process(Simulation sim) {
        BankSimulation bank = (BankSimulation) sim;
        bank.remove(this.teller);
    }
}
