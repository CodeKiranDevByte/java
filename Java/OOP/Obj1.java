public class Obj1{

    public static class Student{
        String name;
        int rollno;
        float perc;

    }
public static void main(String args[])
{

Student s1= new Student();
s1.name="kiran";
s1.rollno=1;
s1.perc=98;

System.out.println(s1.name);
System.out.println(s1.rollno);
System.out.println(s1.perc);
}
}

//Creating static class outside main and creating obj inside main.
