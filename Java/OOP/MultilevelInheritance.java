// Grandparent
class Device {
    Device() { System.out.println("Device created"); }
    void powerOn() { System.out.println("Power is ON"); }
}

// Parent
class Computer extends Device {
    Computer() { System.out.println("Computer system initialized"); }
    void bootOS() { System.out.println("Booting Operating System..."); }
}

// Child
class Laptop extends Computer {
    Laptop() { System.out.println("Laptop screen active"); }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        // When we create a Laptop, ALL constructors in the chain run from top to bottom!
        Laptop myLaptop = new Laptop();
        
        // Laptop inherits methods from BOTH Computer and Device
        myLaptop.powerOn(); // From Device
        myLaptop.bootOS();  // From Computer
     
    }
}