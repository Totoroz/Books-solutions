import java.util.ArrayList;

/*Reimplement the CashRegister class so that it keeps track of the total price as an inte­ger:
 the total cents of the price. For example, instead of storing 17.29, store the inte­ger 1729.
 Such an implementation is commonly used because it avoids the accumulation of roundoff errors.
 Do not change the public interface of the class.*/

public class P8_17 {
    private ArrayList<Double> items;
    private int totalCents;

    public P8_17() {
        this.items = new ArrayList<Double>();
    }

    public void clear() {
        this.items.clear();
    }

    public void addItem(double itemPrice) {
        this.items.add(itemPrice * 100);
    }

    public double getTotal() {
        return totalCents / 100;
    }

    public double getCount() {
        return items.size();
    }

    public void displayAll() {
        for (double itemPrice : this.items) {
            System.out.println(itemPrice);
        }
    }
}
