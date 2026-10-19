// 1. The Parent Class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating food.");
    }
}

// 2. The Child Class (Notice the 'extends' keyword)
class Dog extends Animal {
    // Java automatically copies 'name' and 'eat()' into this class behind the scenes!
    
    void bark() {
        System.out.println(name + " is barking! Woof!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Create an object of the CHILD class
        Dog myDog = new Dog();
        
        // We can access 'name' because Dog inherited it from Animal!
        myDog.name = "Tommy"; 
        
        // We can call 'eat()' because Dog inherited it from Animal!
        myDog.eat();  // Output: Tommy is eating food.
        
        // We can call Dog's own unique method
        myDog.bark(); // Output: Tommy is barking! Woof!
    }
}