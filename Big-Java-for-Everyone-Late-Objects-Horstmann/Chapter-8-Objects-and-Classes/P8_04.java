/*Implement a class Address . An address has a house number, a street, an optional apartment number,
 a city, a state, and a postal code. Supply two constructors: one with an apartment number and 
 one without. Supply a print method that prints the address with the street on one line and the city,
 state, and zip code on the next line. Supply a method public boolean comesBefore(Address other)
 that tests whether this address comes before another when the addresses are compared by postal code.*/

public class P8_04 {
    private int houseNumber;
    private String street;
    private int apartmentNumber;
    private String city;
    private int postalCode;

    public P8_04(int houseNumber, String street, int apartmentNumber, String city, int postalCode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.postalCode = postalCode;
    }

    public P8_04(int houseNumber, String street, String city, int postalCode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public void print() {
        System.out.println(String.format("%s, %s\n%s, %s, %d", street, 
                (apartmentNumber != 0)? apartmentNumber : houseNumber, city, postalCode));
    }
    
    public boolean comesBefore(P8_04 other) {
        return this.postalCode > other.postalCode;
    }
}
