import java.io.*;

class FirstClass{

    static String geek = "Sweta Dash";  // Static variable
    public static void main(String args[])
    {
        System.out.println("Hello");     //println give output to next line
        System.out.print("Hello\n");    // \n with print also work like println
        System.out.print("Hello");     // print do not prints output to next line
        System.out.print("Hello \n world");

        System.out.println("Geek Name is: " + FirstClass.geek);  // Access static variable without creating an object

        int var = 10; //local variable
        System.out.println("Local Variable: " + var);

        boolean isJavaFun = true;  // boolean data type
        boolean isFishTasty = false;
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);

        byte age = 25;  // byte data type
        System.out.println("Age: " + age);
        
        short students = 1000; // short data type
        System.out.println("Number's of Students: " + students);
        
        int population = 2000000; // int data type
        System.out.println("Population: " + population);

        long worldPopulation = 7800000000L;  // long data type
        System.out.println("World Population: " + worldPopulation);

        float pi = 3.14f; // float data type
        System.out.println("Pi: " + pi);

        double avogadro = 6.02214076e23; // double data type
        System.out.println("Avogadro's Number: " + avogadro);

        char grade = 'A'; // char data type
        System.out.println("Grade: " + grade);


        //Implicit type conversion
        byte b=24;
        int i =6;
        i=b;
        System.err.println(i);// prints 24

        char ch='a';
        int k= ch; 
        System.out.println("Int value " + k);//prints 97

      // implicit type conversion where Destination data type should be wider than source data type
        // implicit type conversion also known as widenining conversion  


        //Explicit type conversion
        double d = 100.04;
        long l = (long)d;
        int p = (int)l; // Explicit type casting
        System.out.println("Double value " + d);

        // While printing we will see that
        // fractional part lost
        System.out.println("Long value " + l);

        // While printing we will see that
        // fractional part lost
        System.out.println("Int value " + p);
        
        //While evaluating expressions, the result is automatically updated to a larger data type of the operand. But if we store that result in any smaller data type it generates a compile-time error, due to which we need to typecast the result. 
        byte by = 50;
        by = (byte)(by * 2); // Type casting int to byte
        System.out.println(by);
    
        
    }
}