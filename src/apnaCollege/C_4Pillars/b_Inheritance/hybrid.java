package apnaCollege.C_4Pillars.b_Inheritance;

// Base class (Parent)
class Vehicle {
    void type() {
        System.out.println("This is a vehicle.");
    }
}

// Derived class from Vehicle (Single Inheritance)
class Car extends Vehicle {
    void wheels() {
        System.out.println("A car has 4 wheels.");
    }
}

// Another derived class from Vehicle (Hierarchical Inheritance)
class Bike extends Vehicle {
    void wheels() {
        System.out.println("A bike has 2 wheels.");
    }
}

// Another class extending Car (Multilevel Inheritance)
class ElectricCar extends Car {
    void battery() {
        System.out.println("Electric cars run on battery.");
    }
}

public class hybrid {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.type();     // Inherited from Vehicle
        tesla.wheels();   // Inherited from Car
        tesla.battery();  // Own method

        System.out.println();

        Bike honda = new Bike();
        honda.type();     // Inherited from Vehicle
        honda.wheels();   // Bike-specific method
    }
}


