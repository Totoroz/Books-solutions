package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedListLoops {
    public static void removeStringsLesserThan(List<String> collection, int length) {
        ListIterator<String> iter = collection.listIterator();
        while (iter.hasNext()) {
            String string = iter.next();
            if (string.length() < length) {
                iter.remove();
            }
        }
    }

    public static void printEverySecond(Collection<Object> colection) {
        int i = 0;
        Iterator<Object> iter = colection.iterator();
        while (iter.hasNext()) {
            if (i % 2 == 0) {
                System.out.println(iter.next());
            }
            i += 1;
        }
    }
}
