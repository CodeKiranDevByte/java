class Student{
     private String name;
     private int age;
 // Step 1: Hide the data using the 'private' keyword
 // Constructor to initialize
    Student(String studname, int studage){
        this.name=studname;
        this.age=studage;
    }
// Step 2: Create a SETTER to safely modify age with a security check
    public void setAge(int newAge){
        if(newAge>0){
        this.age=newAge;
        }
        else{
            System.out.println("Age is not valid");
        }
    }
// Step 2: Create a GETTER to let outside classes safely read the age
    public int getAge(){
        return age;
    }
 // Getter for username (No setter provided, making username READ-ONLY!)
    public String getName(){
        return name;
    }


}
public class Encap{
    public static void main(String args[]){
        Student s1=new Student("Kiran",20);
        s1.getName();
        s1.getAge();
        s1.setAge(-5); // Try to input an invalid age through the setter guard
        s1.setAge(6);// Change age correctly using the setter
        System.out.println(s1.getName()+" is " +s1.getAge()+ " years old");
    }
}

