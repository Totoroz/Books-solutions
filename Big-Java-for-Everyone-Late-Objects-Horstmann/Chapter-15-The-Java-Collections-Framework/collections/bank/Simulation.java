package collections.bank;

import java.util.PriorityQueue;

public class Simulation {
    private PriorityQueue<Event> eventQueue;
    private double currentTime;

    public Simulation() {
        this.eventQueue = new PriorityQueue<Event>();
    }

    public double getCurrentTime() {
        return this.currentTime;
    }

    public static double expdist(double mean) {
        return -mean * Math.log(1 - Math.random());
    }

    public void addEvent(Event e) {
        this.eventQueue.offer(e);
    }

    public void display() {
    }

    public void displaySummary() {
    }

    public void run(double startTime, double endTime) {
        this.currentTime = startTime;
        while (this.eventQueue.size() > 0 && this.currentTime <= endTime) {
            Event event = this.eventQueue.remove();
            this.currentTime = event.getTime();
            event.process(this);
            this.display();
        }
        this.displaySummary();
    }
}
