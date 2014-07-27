package collections;

public class Country {
    private String name;
    private double area;

    public Country(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return this.name;
    }

    public double getArea() {
        return this.area;
    }

    @Override
    public int hashCode() {
        int h1 = this.name.hashCode();
        int h2 = new Double(this.area).hashCode();
        final int HASH_MULTIPLIER = 29;
        return HASH_MULTIPLIER * h1 + h2;
    }

    public boolean equals(Country other) {
        return this.name.equals(other.name) && new Double(this.area).equals(new Double(other.area));
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[name=" + this.name + ", area=" + this.area + "]";
    }
}