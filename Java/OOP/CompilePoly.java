class Calculator {
    // Form 1: Adds two integers
    void add(int a, int b) {
        System.out.println("Adding two integers: " + (a + b));
    }

    // Form 2: Adds THREE integers (Different number of parameters)
    void add(int a, int b, int c) {
        System.out.println("Adding three integers: " + (a + b + c));
    }

    // Form 3: Adds two decimals (Different data type)
    void add(double a, double b) {
        System.out.println("Adding two decimals: " + (a + b));
    }
}

public class CompilePoly {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Java is smart. It looks at the arguments inside the () 
        // to decide which "form" of the add() method to trigger!
        
        calc.add(10, 20);         // Triggers Form 1
        calc.add(10, 20, 30);     // Triggers Form 2
        calc.add(5.5, 2.5);       // Triggers Form 3
    }
}
//It happens when you have multiple methods with the exact same name inside the same class, 
// but they take different parameters
//When you hit "Run," before the program even starts, the Java compiler looks at calc.add(10, 20);
// and says, "Ah, two integers. I will permanently link this line to Form 1." 
// The decision is made during the compiling stage.
