/* P9.8    Implement a superclass Person . Make two classes, Student and Instructor, 
 * that inherit from Person . A person has a name and a year of birth. A student has a major,
 *  and an instructor has a salary. Write the class declarations, the constructors, 
 *  and the methods toString for all classes. 
 *  Supply a test program that tests these classes and methods.*/

public class Instructor extends Person {
    private double salary;

    public Instructor(String name, int birthYear, double salary) {
        super(name, birthYear);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }
}
