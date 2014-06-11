import java.util.ArrayList;

/*After closing time, the store manager would like to know how much business was
transacted during the day. Modify the CashRegister class to enable this functionality.
Supply methods getSalesTotal and getSalesCount to get the total amount of all sales
and the number of sales. Supply a method resetSales that resets any counters and
totals so that the next day’s sales start from zero.*/

public class P8_18 {
    private ArrayList<Double> items;
    private int totalCents;

    public P8_18() {
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
