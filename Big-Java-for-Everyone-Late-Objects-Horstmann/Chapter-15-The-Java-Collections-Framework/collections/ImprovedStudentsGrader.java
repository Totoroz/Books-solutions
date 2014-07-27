package collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class ImprovedStudentsGrader {
    private Map<Student, String> students;

    public ImprovedStudentsGrader() {
        this.students = new TreeMap<Student, String>();
    }

    public void add(String firstName, String lastName, String grade) {
        this.students.put(new Student(firstName, lastName), grade);
    }

    public void update(int id, String grade) {
        Student student = this.findStudent(id);
        if (student != null) {
            this.students.put(student, grade);
        }
    }

    private Student findStudent(int id) {
        for (Student student : this.students.keySet()) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void remove(int id) {
        this.students.remove(this.findStudent(id));
    }

    public void print() {
        for (Entry<Student, String> entry : this.students.entrySet()) {
            System.out.println(entry);
        }
    }

    public static void main(String[] args) {
        ImprovedStudentsGrader grader = new ImprovedStudentsGrader();
        Scanner consoleIn = new Scanner(System.in);
        System.out.println("Command:");
        while (consoleIn.hasNext()) {
            String command = consoleIn.next();
            if (command.equals("add")) {
                String firstName = consoleIn.next();
                String lastName = consoleIn.next();
                String grade = consoleIn.next();
                grader.add(firstName, lastName, grade);
            } else if (command.equals("remove")) {
                grader.remove(consoleIn.nextInt());
            } else if (command.equals("print")) {
                grader.print();
            } else if (command.equals("update")) {
                int id = consoleIn.nextInt();
                String newGrade = consoleIn.next();
                grader.update(id, newGrade);
            } else if (command.equals("quit")) {
                System.exit(0);
            }
        }
        consoleIn.close();
    }
}
