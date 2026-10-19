class SmartWatch {
    String brand;
    int batteryLife;

    void displayDetails() {
        System.out.println("Brand: " + brand + ", Battery: " + batteryLife + " hours");
    }
}

public class DefaultCon {
    public static void main(String[] args) {
        // Java uses its automatic default constructor here
        SmartWatch watch = new SmartWatch();
        
        // It will print: Brand: null, Battery: 0 hours
        watch.displayDetails(); 
    }
}