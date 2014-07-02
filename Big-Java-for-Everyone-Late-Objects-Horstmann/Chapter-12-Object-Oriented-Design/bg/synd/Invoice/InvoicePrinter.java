package bg.synd.Invoice;

public class InvoicePrinter {
    public static void main(String[] args) {
        Address exampleAddress = new Address("Peter Parker", "20 Ingram St. Forest Hills, Queens", "New York city",
                "New York", "11375");
        Invoice parkerInvoice = new Invoice(exampleAddress);
        parkerInvoice.add(new Product("Web", 2.44), 100);
        parkerInvoice.add(new Product("Thread", 1.10), 17);
        parkerInvoice.add(new Product("Red paint", 7.80), 5);
        parkerInvoice.add(new Product("Blue paint", 7.80), 5);
        
        System.out.println(parkerInvoice.format());
    }
}
