package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList<String> letters = new LinkedList<String>(Arrays.asList("A", "B", "C", "D"));
        System.out.println(letters);
        ListIterator<String> iter = letters.listIterator();
        iter.next();
        iter.next();
        System.out.println(iter.nextIndex());
        iter.remove();
        System.out.println(letters);
        System.out.println(iter.nextIndex());
        iter.next();
        iter.add("E");
        System.out.println(letters);
        iter.next();
        System.out.println(iter.nextIndex());
        iter.add("F");
        System.out.println(letters);
    }
}
