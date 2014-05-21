/*P9.12    A labeled point has x- and y-coordinates and a string label. Provide a class Labeled­Point
 with a constructor LabeledPoint(int x, int y, String label) and a toString method that displays 
 x, y and label*/

public class LabeledPoint {
    private int x;
    private int y;
    private String label;

    public LabeledPoint(int x, int y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public String toString() {
        return String.format("%s [x=%d, y=%d, label=%s]", getClass().getName(), this.x, this.y, this.label);
    }
}
