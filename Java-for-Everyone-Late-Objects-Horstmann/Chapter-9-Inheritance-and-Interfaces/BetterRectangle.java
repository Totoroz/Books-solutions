import java.awt.Rectangle;

/* P9.10 The Rectangle class of the standard Java library does not supply a method to com­
pute the area or the perimeter of a rectangle. Provide a subclass BetterRectangle of the
Rectangle class that has getPerimeter and getArea methods. Do not add any instance
variables. In the constructor, call the setLocation and setSize methods of the Rectangle
class. Provide a program that tests the methods that you supplied.*/

/*P9.11    Repeat Exercise P9.10, but in the BetterRectangle constructor, invoke the superclass
constructor.*/

@SuppressWarnings("serial")
public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
    
    /*public BetterRectangle(int x, int y, int width, int height) {
        super.setLocation(x, y);
        super.setSize(width, height);
    }*/
    public double getPerimeter() {
        return super.getHeight() * 2 + super.getWidth() * 2;
    }
    
    public double getArea() {
        return super.getHeight() * super.getWidth();
    }
}
