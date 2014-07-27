package collections;

public class Task implements Comparable {
    private String description;
    private int importance;

    public Task(String description, int importance) {
        this.description = description;
        this.importance = importance;
    }

    public String getDescription() {
        return this.description;
    }

    public int getImportance() {
        return this.importance;
    }

    @Override
    public int compareTo(Object o) {
        Task other = (Task) o;
        if (this.importance > other.importance) {
            return 1;
        } else if (this.importance < other.importance) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Importance: %d, Description: %s", this.importance, this.description);
    }
}
