
public class SinglyLinkedListDemo {
    public static void main(String[] args) {
        SinglyLinkedList staff = new SinglyLinkedList();
        staff.addFirst("Tom");
        staff.addFirst("Romeo");
        staff.addFirst("Harry");
        staff.addFirst("Diana");

        // |D H R T
        ListIterator iterator = staff.listIterator();
        iterator.next();
        iterator.next();
        // D H| R T
        iterator.add("Danny");
        // D H D| R T
        iterator.next();
        iterator.next();
        // D H D R T|
        iterator.remove();

        iterator = staff.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
