import java.awt.Point;

/*Reimplement the LabeledPoint class of Exercise P9.12 by storing the location in a
 java.awt.Point object. Your toString method should invoke the toString method of
 the Point class.*/

@SuppressWarnings("serial")
public class ModifiedPoint extends Point {
    private String label;

    public ModifiedPoint(int x, int y, String label) {
        super(x, y);
        this.label = label;
    }

    @Override
    public String toString() {
        return String.format("%s [x=%d, y=%d, label=%s]", getClass().getName(), this.x, this.y, this.label);
    }
}
