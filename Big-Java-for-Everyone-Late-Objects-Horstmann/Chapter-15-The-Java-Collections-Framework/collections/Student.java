package collections;

public class Student implements Comparable<Student> {
    private static int id_assigner = 0000;
    private final String firstName;
    private final String lastName;
    private int id;

    public Student(String firstName, String lastName) {
        this.id = id_assigner += 1;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return String.format("Student: %s, %s, ID: %d; ", this.firstName, this.lastName, this.id);
    }

    @Override
    public int compareTo(Student o) {
        if (this.lastName.equals(o.lastName)) {
            if (this.firstName.equals(o.firstName)) {
                if (this.id == o.id) {
                    return 0;
                } else if (this.id < o.id) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (this.firstName.compareTo(o.firstName) < 0) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.lastName.compareTo(o.lastName) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
