package bg.synd.Invoice;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private Address billingAddress;
    private List<LineItem> items;

    public Invoice(Address address) {
        this.billingAddress = address;
        this.items = new ArrayList<LineItem>();
    }

    public void add(Product product, int quantity) {
        this.items.add(new LineItem(product, quantity));
    }

    public String format() {
        String output = "                     I N V O I C E\n\n" + billingAddress.format()
                + String.format("\n\n%-30s%8s%5s%8s\n", "Description", "Price", "Qty", "Total");
        for (LineItem item : items) {
            output = output + item.format() + "\n";
        }
        output = output + String.format("\nAMOUNT DUE: $%8.2f", this.getAmountDue());
        return output;
    }

    public double getAmountDue() {
        double amountDue = 0;
        for (LineItem item : this.items) {
            amountDue += item.getTotalPrice();
        }
        return amountDue;
    }
}
