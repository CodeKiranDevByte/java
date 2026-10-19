class Student {
    String name;
    int rollNo;

    // This is a Method (an action the student can perform)
    void introduce() {
        System.out.println("Hello, my name is " + name + " and my roll number is " + rollNo);
    }
}
public class Obj3 {
    public static void main(String[] args) {

        // Creating student 1
        Student s1 = new Student();
        s1.name = "Prachi";
        s1.rollNo = 10;
        
        // Creating a second student object from the same blueprint
        Student s2 = new Student();
        s2.name = "Aaditya";
        s2.rollNo = 12;
        
        // Instead of writing System.out.println here, we just call the method!
        s1.introduce();
        s2.introduce();
    }
}