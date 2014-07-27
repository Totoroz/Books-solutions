package collections;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ToDoList {
    private PriorityQueue<Task> tasks;


    public ToDoList() {
        this.tasks = new PriorityQueue<Task>();
    }

    public void add(String description, int importance) {
        this.tasks.offer(new Task(description, importance));
    }

    public void next() {
        System.out.println(this.tasks.poll());
    }

    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        Scanner consoleIn = new Scanner(System.in);
        System.out.println("Command: ");
        while (consoleIn.hasNext()) {
            String command = consoleIn.next();
            if (command.equals("add")) {
                int importance = consoleIn.nextInt();
                String description = consoleIn.nextLine().trim();
                list.add(description, importance);
            } else if (command.equals("next")) {
                list.next();
            } else if (command.equals("quit")) {
                System.exit(0);
            }
        }
        consoleIn.close();
    }
}
