abstract class Animal{

    // Abstract method: No body! Just a rule that children MUST follow.
    abstract void makesound();

    // Regular method: Already fully built, children can just use it.
    void eat(){
        System.out.println("eats food");
    }
}
class Dog extends Animal{

    // The child is FORCED to implement the abstract method
    @Override
    void makesound(){
        System.out.println("Barking");
    }
}
public class AbstractClass{
    public static void main(String args[]){
        Dog d1=new Dog();
        d1.makesound(); // Runs the forced implementation
        d1.eat();// Runs the inherited regular method
      
    }
}
//An abstract class is a blueprint that is purposely left unfinished. 
// It uses the abstract keyword.

//The Rules of Abstract Classes:

//1) You cannot create an object directly from an abstract class
//  (e.g., new Vehicle(); will throw an error). It is just a concept.

//2)It can contain regular methods (with code inside) 
// AND abstract methods (empty methods with no code).

//3)Any Child class that inherits an abstract class MUST provide the code for 
// all the empty abstract methods.