class Product {
    String productName;
    double price;

    // Parameterized Constructor
    Product(String name, double cost) {
        productName = name;
        price = cost;
    }

    void printReceipt() {
        System.out.println("Item: " + productName + " | Price: Rs." + price);
    }
}

public class ParameterizedCon {
    public static void main(String[] args) {
        // Creating unique objects with unique data on birth
        Product item1 = new Product("Laptop", 55000);
        Product item2 = new Product("Headphones", 2500);

        item1.printReceipt();
        item2.printReceipt();
    }
}