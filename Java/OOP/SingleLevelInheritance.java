// 1. Parent Class
class Vehicle {
    private String brand;

    // Parent Parameterized Constructor
    Vehicle(String brand1) {
        this.brand = brand1;
    }

    public String getBrand() {
        return brand;
    }
}

// 2. Child Class
class Car extends Vehicle {
    private int speed;

    // Child Parameterized Constructor
    Car(String brand2, int speed1) {
        // CRITICAL RULE: super() MUST be the absolute first line of code!
        super(brand2); // Passes the 'brand' up to the Vehicle constructor
        
        this.speed = speed1; // Sets the child's own variable
    }

    void showDetails() {
        // We use getBrand() because the brand variable is private in Vehicle
        System.out.println("Brand: " + getBrand() + " | Max Speed: " + speed + " km/h");
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 180);
        myCar.showDetails();
    }
}