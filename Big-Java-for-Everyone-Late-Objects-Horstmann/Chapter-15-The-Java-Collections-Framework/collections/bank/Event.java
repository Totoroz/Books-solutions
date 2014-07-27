package collections.bank;

public class Event implements Comparable<Event> {
    private double time;

    public Event(double eventTime) {
        this.time = eventTime;
    }

    public void process(Simulation simulation) {
    }

    public double getTime() {
        return this.time;
    }

    @Override
    public int compareTo(Event o) {
        if (this.time < o.time) {
            return -1;
        } else if (this.time > o.time) {
            return 1;
        } else {
            return 0;
        }
    }
}
