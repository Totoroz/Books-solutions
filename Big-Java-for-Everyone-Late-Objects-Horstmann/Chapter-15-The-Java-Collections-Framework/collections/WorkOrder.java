package collections;

public class WorkOrder implements Comparable {
    private int priority;
    private String description;

    public WorkOrder(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("%s[priority=%s,description=%s]", this.getClass().getName(), this.priority,
                this.description);
    }

    @Override
    public int compareTo(Object o) {
        WorkOrder other = (WorkOrder) o;
        if (this.priority < other.priority) {
            return -1;
        } else if (this.priority == other.priority) {
            return 0;
        } else {
            return -1;
        }
    }
}
