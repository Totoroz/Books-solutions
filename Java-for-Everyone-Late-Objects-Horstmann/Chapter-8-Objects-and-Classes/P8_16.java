import java.util.ArrayList;

/*Reimplement the CashRegister class so that it keeps track of the price of each added
 item in an ArrayList<Double> . Remove the itemCount and totalPrice instance variables.
 Reimplement the clear , addItem , getTotal , and getCount methods. Add a method
 displayAll that displays the prices of all items in the current sale.*/

public class P8_16 {
    private ArrayList<Double> items;

    public P8_16() {
        this.items = new ArrayList<Double>();
    }

    public void clear() {
        this.items.clear();
    }

    public void addItem(double itemPrice) {
        this.items.add(itemPrice);
    }

    public double getTotal() {
        double total = 0;
        for (double itemPrice : this.items) {
            total += itemPrice;
        }
        return total;
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
