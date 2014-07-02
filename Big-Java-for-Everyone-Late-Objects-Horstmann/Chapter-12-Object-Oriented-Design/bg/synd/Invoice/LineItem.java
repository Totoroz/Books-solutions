package bg.synd.Invoice;

public class LineItem {
    private int quantity;
    private Product theProduct;
    
    public LineItem(Product product, int quantity) {
        this.quantity = quantity;
        this.theProduct = product;
    }
    
    public double getTotalPrice() {
        return this.theProduct.getPrice() * this.quantity;
    }
    
    public String format() {
        return String.format("%-30s%8.2f%5d%8.2f", this.theProduct.getDescription(), this.theProduct.getPrice(), this.quantity, this.getTotalPrice());
    }
}
