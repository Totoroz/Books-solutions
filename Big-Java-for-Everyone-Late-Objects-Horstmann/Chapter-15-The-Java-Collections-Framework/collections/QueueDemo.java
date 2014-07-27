package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> cashierLine = new LinkedList<String>();
        System.out.println(cashierLine.peek());
        cashierLine.offer("Mike");
        cashierLine.offer("Mike");
        System.out.println(cashierLine);
        System.out.println(cashierLine.poll());
        System.out.println(cashierLine);
    }
}
