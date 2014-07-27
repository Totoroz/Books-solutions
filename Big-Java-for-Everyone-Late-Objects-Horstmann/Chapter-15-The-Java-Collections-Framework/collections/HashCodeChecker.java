package collections;

import java.util.HashSet;
import java.util.Set;

public class HashCodeChecker {
    public static void main(String[] args) {
        Country country1 = new Country("Belgium", 30510);
        Country country2 = new Country("Thailand", 514000);
        Country country3 = new Country("Belgium", 30510);
        System.out.println("Hash code country1: " + country1.hashCode());
        System.out.println("Hash code country2: " + country2.hashCode());
        System.out.println("Hash code country3: " + country3.hashCode());

        Set<Country> countries = new HashSet<Country>();
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        System.out.println(countries);
    }
}
