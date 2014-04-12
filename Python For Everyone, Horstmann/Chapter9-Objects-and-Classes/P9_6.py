# Implement a class Car with the following properties. A car has a cer­tain fuel effi-
# ciency (measured in miles/gallon) and a certain amount of fuel in the gas tank.
# The efficiency is specified in the constructor, and the initial fuel level is 0. Supply a
# method drive that simulates driving the car for a certain distance, reducing the fuel
# level in the gas tank, and methods getGasLevel , to return the current fuel level, and
# addGas , to tank up. Sample usage:
# myHybrid = Car(50) # 50 miles per gallon
# myHybrid.addGas(20) # Tank 20 gallons
# myHybrid.drive(100) # Drive 100 miles
# print(myHybrid.getGasLevel()) # Print fuel remaining


class Car():
    def __init__(self, fuel_efficiency, fuel=0):
        self._fuel = fuel
        self._fuel_efficiency = fuel_efficiency

    def drive(self, distance):
        if self._fuel - distance * self._fuel_efficiency < 0:
            return False
        self._fuel -= distance * self._fuel_efficiency
        return True

    def get_gas_level(self):
        return self._fuel

    def add_gas(self, amount):
        self._fuel += amount
