public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList staff = new ArrayList();
        staff.addLast("John");
        staff.addLast("Mike");
        staff.addLast("Harry");
        printList(staff);

        System.out.println();
        System.out.println(staff.contains("Mike"));
        System.out.println(staff.indexOf("Mike"));

        staff.remove(1);
        printList(staff);

        System.out.println();
        staff.add(0, "Tom");
        printList(staff);
    }

    public static void printList(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list .get(i));
        }
    }
}
