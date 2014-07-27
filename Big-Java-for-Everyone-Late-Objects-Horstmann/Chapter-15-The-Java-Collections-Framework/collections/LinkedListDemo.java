package collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        // does the same as .add
        list.addLast("Waldo");

        list.addFirst("GladOS");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        String removed = list.removeFirst();
        System.out.println(removed);

        list.clear();

        LinkedList<String> staff = new LinkedList<String>();
        staff.addFirst("Harry");
        staff.addFirst("Diana");
        staff.addFirst("Tom");
        System.out.println(staff);
        System.out.println(staff.removeFirst());
        System.out.println(staff.removeFirst());
        System.out.println(staff.removeFirst());
    }
}
