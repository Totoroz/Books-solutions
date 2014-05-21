/*Make a class Employee with a name and salary. Make a class Manager inherit from
Employee . Add an instance variable, named department , of type String . Supply a method
toString that prints the manager’s name, department, and salary. Make a class Execu­tive 
inherit from Manager . Supply appropriate toString methods for all classes. Supply
a test program that tests these classes and methods.*/

public class Executive extends Manager {
    private double bonus;
    
    public Executive(String name, double salary, double bonus, String department) {
        super(name, salary, department);
        this.bonus = bonus;
    }
    
    public double getBonus() {
        return this.bonus;
    }
}
