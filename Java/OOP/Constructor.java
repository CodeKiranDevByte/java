class Student {
    String name;
    int rollNo;

    // 1. This is the Constructor
    // It must have the EXACT same name as the Class and NO return type
    Student(String studentName, int studentRollNo) {
        name = studentName;
        rollNo = studentRollNo;
    }

    void introduce() {
        System.out.println("Hello, my name is " + name + " and my roll number is " + rollNo);
    }
}

public class Constructor {
    public static void main(String[] args) {
        
        // 2. Now we can pass the data directly inside the parentheses!
        Student s1 = new Student("Prachi", 10);
        Student s2 = new Student("Aaditya", 12);
        
        s1.introduce();
        s2.introduce();
    }
}