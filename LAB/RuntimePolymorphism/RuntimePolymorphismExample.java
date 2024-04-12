/**
 * Author: omteja04
 * Description: RuntimePolymorphismExample
 */
package LAB.RuntimePolymorphism;

public class RuntimePolymorphismExample {
    public static void main(String[] args) {
        // Creating objects of child classes
        Vehicle car = new Car();
        Vehicle truck = new Truck();
        Vehicle vehicle = new Vehicle();

        // Calling the displayInfo method of the Car class
        car.displayInfo(); 

        // Calling the displayInfo method of the Truck class
        truck.displayInfo();
        
        // Calling the displayInfo method of the Vehicle class
        vehicle.displayInfo();

    }
}

// Parent class
class Vehicle {
    // Method to display information about the vehicle
    void displayInfo() {
        System.out.println("This is a vehicle.");
    }
}

// Child class 1
class Car extends Vehicle {
    // Overriding the displayInfo method of the parent class
    void displayInfo() {
        System.out.println("This is a car.");
    }
}

// Child class 2
class Truck extends Vehicle {
    // Overriding the displayInfo method of the parent class
    void displayInfo() {
        System.out.println("This is a truck.");
    }
}
