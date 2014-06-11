/*Simulate a tally counter that can be used to admit a limited number of people. First,
the limit is set with a call
    public void setLimit(int maximum)
If the count button was clicked more often than the limit, simulate an alarm by
printing out a message “Limit exceeded”.*/

public class P8_02 {
    private int value;
    private int maximum;

    public int getValue() {
        return value;
    }

    public void count() {
        if (value + 1 > maximum) {
            System.out.println("Limit exceeded");
        } else {
            value = value + 1;
        }
    }

    public void reset() {
        value = 0;
    }

    public void undo() {
        value -= 1;
    }

    public void setLimit(int maximum) {
        this.maximum = maximum;
    }
}
