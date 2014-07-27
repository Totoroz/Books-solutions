package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionsInterfaceDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        int size = coll.size();
        coll.add("Harry");
        coll.add("Poter");
        String contents = coll.toString();
        System.out.println(contents);

        coll.remove("Poter");
        System.out.println(coll);
        boolean isRemoved = coll.remove("Waldo");
        System.out.println(isRemoved);
        System.out.println(coll.contains("Magic"));


        // uses an iterator underneath
        for (String string : coll) {
            System.out.println(string);
        }

        Iterator<String> iter = coll.iterator();
        System.out.println(iter.next());

        coll = new TreeSet<String>(Arrays.asList("Potato", "Carrot", "Tomato", "Pineapple"));
        System.out.println(coll);

    }
}
