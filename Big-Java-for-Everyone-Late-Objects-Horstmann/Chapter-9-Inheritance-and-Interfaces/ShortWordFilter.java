import java.util.ArrayList;

/*Declare an interface Filter as follows:
 public interface Filter
 {
 boolean accept(Object x);
 }
 Write a method
 public static ArrayList<Object> collectAll(ArrayList<Object> objects, Filter f)
 that returns all objects in the objects array that are accepted by the given filter.
 Provide a class ShortWordFilter whose filter method accepts all strings of length < 5.
 Then write a program that reads all words from System.in , puts them into an Array­
 List<Object> , calls collectAll , and prints a list of the short words.*/

public class ShortWordFilter implements Filter {
    public boolean accept(Object x) {
        return x.toString().length() < 5;
    }

    public static ArrayList<Object> collectAll(ArrayList<Object> objects, Filter f) {
        ArrayList<Object> collected = new ArrayList<Object>();
        for (Object object : collected) {
            if (f.accept(object)) {
                collected.add(object);
            }
        }
        return collected;
    }
}
