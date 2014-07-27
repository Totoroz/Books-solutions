package collections.bank;


public class BankSimulationRunner {
    public static void main(String[] args) {
        final double START_TIME = 8 * 60; // 8 AM
        final double END_TIME = 5 * 60; // 5 PM;
        final int NTELLERS = 5;
        Simulation sim = new BankSimulation(NTELLERS);
        sim.addEvent(new ArrivalEvent(START_TIME));
        sim.run(START_TIME, END_TIME);
    }
}
