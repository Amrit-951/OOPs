class Vehicle {
    int wheels = 4;

    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    String brand = "Toyota";

    public void showDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Number of Wheels: " + wheels); 
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); 
        myCar.showDetails(); 
    }
}
