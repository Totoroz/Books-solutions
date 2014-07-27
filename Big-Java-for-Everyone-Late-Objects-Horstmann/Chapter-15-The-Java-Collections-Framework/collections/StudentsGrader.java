package collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StudentsGrader {
    private Map<String, String> students;

    public StudentsGrader() {
        this.students = new TreeMap<String, String>();
    }

    public void add(String name, String grade) {
        this.students.put(name, grade);
    }

    public void remove(String name) {
        this.students.remove(name);
    }

    public void print() {
        System.out.println(this.students);
    }

    public static void main(String[] args) {
        StudentsGrader grader = new StudentsGrader();
        Scanner consoleIn = new Scanner(System.in);
        System.out.println("Command:");
        while (consoleIn.hasNext()) {
            String command = consoleIn.next();
            if (command.equals("add")) {
                String studentName = consoleIn.next();
                String grade = consoleIn.next();
                grader.add(studentName, grade);
            } else if (command.equals("remove")) {
                grader.remove(consoleIn.next());
            } else if (command.equals("print")) {
                grader.print();
            } else if (command.equals("quit")) {
                System.exit(0);
            }
        }
        consoleIn.close();
    }
}
