class Student {
    String name;
    int rollNo;

    // Option 1: Constructor for when we know BOTH name and roll number
    Student(String studentName, int studentRollNo) {
        name = studentName;
        rollNo = studentRollNo;
    }

    // Option 2: Constructor for when we ONLY know the name
    Student(String studentName) {
        name = studentName;
        rollNo = 0; // Setting a default fallback value
    }

    void introduce() {
        System.out.println("Hello, my name is " + name + " and my roll number is " + rollNo);
    }
}

public class Constructor1 {
    public static void main(String[] args) {
        
        // Uses Option 1 (Passes 2 arguments)
        Student s1 = new Student("Prachi", 10);
        
        // Uses Option 2 (Passes only 1 argument)
        Student s2 = new Student("Aaditya");
        
        s1.introduce();
        s2.introduce();
    }
}