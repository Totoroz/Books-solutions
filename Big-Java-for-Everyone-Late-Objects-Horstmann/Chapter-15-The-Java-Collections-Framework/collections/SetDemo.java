package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> names = new HashSet<String>();
        names.add("Romeo");
        names.add("Juliet");
        System.out.println(names);
        System.out.println(names.contains("Waldo"));
        System.out.println(names.size());
    }
}
