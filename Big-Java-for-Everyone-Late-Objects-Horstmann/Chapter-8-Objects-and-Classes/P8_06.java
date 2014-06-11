/*Implement a class Car with the following properties. A car has a cer­tain fuel efficiency 
(measured in miles/gallon) and a certain amount of fuel in the gas tank. 
The efficiency is specified in the constructor, and the initial fuel level is 0. 
Supply a method drive that simulates driving the car for a certain distance, 
reducing the fuel level in the gas tank, and methods getGas- Level , 
to return the current fuel level, and addGas , to tank up. Sample usage:
    Car myHybrid = new Car(50); // 50 miles per gallon
    myHybrid.addGas(20); // Tank 20 gallons
    myHybrid.drive(100); // Drive 100 miles
    System.out.println(myHybrid.getGasLevel()); // Print fuel remaining*/

public class P8_06 {
    private final int INITIAL_FUEL = 0;
    private double fuel;
    private double fuelEfficiency;
    
    public P8_06(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
        this.fuel = this.INITIAL_FUEL;
    }
    
    public void addGas(double amount) {
        this.fuel += amount;
    }
    
    public void drive(double distance) {
        this.fuel -= distance * this.fuelEfficiency;
    }
    
    public void printFuel() {
        System.out.println(this.fuel);
    }
}
