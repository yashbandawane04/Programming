class Vehicle {                                       // Base class

    void start() {
        System.out.println("Vehicle started.");
    }
}


class Car extends Vehicle {                           // Derived class
    void drive() {
        System.out.println("Driving the car...");
    }
}

class ElectricCar extends Car {                        // Another derived class inheriting from Car

    void charge() {
        System.out.println("Charging the electric car...");
    }
}


public class MultilevelInheritance {                     // Main class to test multilevel inheritance
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.start();                                       // Inherited from Vehicle
        tesla.drive();                                      // Inherited from Car
        tesla.charge();                                    // Class-specific method
    }
}
