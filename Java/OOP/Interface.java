// Interface 1 (Contract A)
interface camera{
    void takephotos();
}

// Interface 2 (Contract B)
interface musicplayer{
    void song();
}

// The Child Class implementing MULTIPLE interfaces!
class Mobile implements camera,musicplayer{

    // Fulfilling Contract A
    @Override
   public void takephotos(){
        System.out.println("Take good pics");
    }

    // Fulfilling Contract B
    @Override
    public void song(){
        System.out.println("Plays diff songs");
    }
}
public class Interface{
    public static void main(String args[]){
        Mobile m1=new Mobile();
        m1.takephotos();
        m1.song();
    }
}

//An interface is a completely abstract blueprint. 
// Up until recent versions of Java, an interface could only contain 100% empty,
//  abstract methods. It is a strict contract. Because interfaces contain no actual
//  code bodies, there is no confusion if a class inherits from two of them!

//The Rules of Interfaces:
//1) We use the keyword interface instead of class.

//2) To inherit from an interface, a child uses the keyword implements (instead of extends).

//3) A single class CAN implement multiple interfaces at the same time!