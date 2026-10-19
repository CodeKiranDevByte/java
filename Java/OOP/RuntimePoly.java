// The Parent Class
class Animal {
    void makeSound() {
        System.out.println("The animal makes a generic sound...");
    }
}

// Child Class 1
class Dog extends Animal {
    // We are OVERRIDING the parent's method!
    @Override
    void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }
}

// Child Class 2
class Cat extends Animal {
    // We are OVERRIDING the parent's method!
    @Override
    void makeSound() {
        System.out.println("The cat meows: Meow!");
    }
}

public class RuntimePoly {
    public static void main(String[] args) {
        
        Animal a1 = new Animal();
        a1.makeSound(); // Runs Parent version
        
        Dog d1 = new Dog();
        d1.makeSound(); // Runs Child version (Overridden)
        
        Cat c1 = new Cat();
        c1.makeSound(); // Runs Child version (Overridden)
    }
}
//Method Overriding happens when a Child class decides it doesn't like
//  how the Parent class does something, so it completely redefines the parent's method
//  using the exact same name and parameters.
