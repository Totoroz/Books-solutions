package bg.synd.Invoice;

public class Product {
    private String description;
    private double price;
    
    public Product(String description, double price) {
        this.description = description;
        this.price = price;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public double getPrice() {
        return this.price;
    }
}
